package com.chidubem.Trie;


class Trie {
    class TrieNode {
        boolean isEndOfWord;
        TrieNode children[];

        public TrieNode() {
            isEndOfWord = false;
            children = new TrieNode[26];
        }
    }

    TrieNode root;
    public Trie(){
        root = new TrieNode();
    }

    // insert in a trie
    public void insert(String word){
        TrieNode node = root;

        for(char c : word.toCharArray()) {
            if(node.children[c - 'a'] == null){
                node.children[c-'a'] = new TrieNode();
            }
            node = node.children[c-'a'];
        }
        node.isEndOfWord = true;
    }

    // search in trie
    public boolean search(String word){
        return isMatch(word, root, 0, true);

    }

    public boolean startsWith(String prefix){
        return isMatch(prefix, root, 0, false);
    }

    private boolean isMatch(String s, TrieNode node, int index, boolean isFullMatch) {
        if(node == null)
            return false;

        if (index == s.length())
            return !isFullMatch || node.isEndOfWord;

        return isMatch(s, node.children[s.charAt(index) - 'a'], index + 1, isFullMatch);
    }

    public static void main(String[] args){
        Trie trie = new Trie();
        trie.insert("cat");
        trie.insert("car");
        trie.insert("dog");
        trie.insert("pick");
        trie.insert("pickle");

         boolean isPresent = trie.search("cat");
         System.out.println(isPresent);
         isPresent = trie.search("picky");
         System.out.println(isPresent);
         isPresent = trie.startsWith("ca");
         System.out.println(isPresent);
         isPresent = trie.startsWith("pen");
         System.out.println(isPresent);
    }
}

   /**
    * The time complexity of creating a trie is O(m*n) where m = number of words in a trie and n = average length of each word.
    *
    * Inserting a node in a trie has a time complexity of O(n) where n = length of the word we are trying to insert.
    *
    * Inserting a node in a trie has a space complexity of O(n) where n = length of the word we are trying to insert.
    *
    * Time complexity for searching a key(word) in a trie is O(n) where n = length of the word we are searching.
    *
    * Space complexity for searching a key(word) in a trie is O(1).
    *
    * Searching for a prefix of a key(word) also has a time complexity of O(n) and space complexity of O(1).

    */