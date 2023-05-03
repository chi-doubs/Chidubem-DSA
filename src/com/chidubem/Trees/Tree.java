package com.chidubem.Trees;

import javax.swing.text.Position;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/** An interface for a tree where nodes can have an arbitrary number of children. */
        public interface Tree<E> extends Iterable<E> {
 Position root();
 Position parent(Position p) throws IllegalArgumentException;
 Iterable<Position> children(Position p) throws IllegalArgumentException;
 int numChildren(Position p) throws IllegalArgumentException;
 boolean isInternal(Position p) throws IllegalArgumentException;
 boolean isExternal(Position p) throws IllegalArgumentException;
 boolean isRoot(Position p) throws IllegalArgumentException;
 int size();
 boolean isEmpty();
 Iterator<E> iterator();
 Iterable<Position > positions();
 }

 /** An abstract base class providing some functionality of the Tree interface. */
      abstract class AbstractTree<E> implements Tree<E> {
 public boolean isInternal(Position p) { return numChildren(p) > 0; }
 public boolean isExternal(Position p) { return numChildren(p) == 0; }
 public boolean isRoot(Position p) { return p == root(); }
 public boolean isEmpty() { return size() == 0; }
 }

  /** An interface for a binary tree, in which each node has at most two children. */
  interface BinaryTree<E> extends Tree<E> {
/** Returns the Position of p's left child (or null if no child exists). */
    Position left(Position p) throws IllegalArgumentException;
 /** Returns the Position of p's right child (or null if no child exists). */
  Position right(Position p) throws IllegalArgumentException;
 /** Returns the Position of p's sibling (or null if no sibling exists). */
   Position sibling(Position p) throws IllegalArgumentException;
 }

 abstract class AbstractBinaryTree extends AbstractTree implements BinaryTree {

   public Position sibling(Position p){
    Position parent = parent(p);
    if(parent == null) return null;
    if (p  == left(parent))
     return right(parent);
    else
     return left(parent);
   }

   /** Returns the number of children of Position p. */
           public int numChildren(Position p) {
    int count=0;
    if (left(p) != null)
     count++;
    if (right(p) != null)
     count++;
    return count;
    }


    /** Returns an iterable collection of the Positions representing p's children. */
           public Iterable<Position> children(Position p) {
    List<Position> snapshot = new ArrayList<>(2); // max capacity of 2
   if (left(p) != null)
    snapshot.add(left(p));
    if (right(p) != null)
     snapshot.add(right(p));
    return snapshot;
    }
 }
 