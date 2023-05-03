package com.chidubem.Arrays;

public class GameEntry {
   private String name;
   private int score;

    public GameEntry(String n, int s){
        name = n;
        score = s;
    }
    // Returns the name field. ∗/
    public String getName() { return name; }
    // Returns the score field. ∗/
    public int getScore() { return score; }
    //Returns a string representation of this entry. ∗/
    public String text() {
        return "(" + name + ", " + score + ")";
    }

    public class Scoreboard{
        int numEntries = 0;
        GameEntry[] board;

        public Scoreboard(int capacity) {
            board = new GameEntry[capacity];
        }


        // Adding an Entry
        public void add(GameEntry e){
            int newScore = e.getScore();

            // is the new entry e really a high score?
            if (numEntries < board.length || newScore > board[numEntries -1].getScore()){
                if(numEntries < board.length)
                    numEntries++;
                // shift any lower scores rightward to make room for the new entry
                int j = numEntries -1;
                while(j > 0 && board[j-1].getScore() < newScore){
                    board[j] = board[j-1];
                    j--;
                }
                board[j] = e;
            }
        }

        public GameEntry remove(int i) throws IndexOutOfBoundsException{
            if (i < 0 || i > numEntries)
                throw new IndexOutOfBoundsException(" Invalid index:" + i);

            GameEntry temp = board[i];
            for (int j =i; j< numEntries-1; j++)
             board[j] = board[j+1];
            board[numEntries -1] = null;
            numEntries --;
            return temp;
        }

        public String text() {
            return "(" + name + ", " + score + ")";
        }
    }

    public static void main(String[] args){

    }
}
