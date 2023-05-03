package com.chidubem.Arrays.Lists;

import javafx.geometry.Pos;

import javax.swing.text.Element;
import javax.swing.text.Position;
import java.util.concurrent.ExecutionException;


public interface PositionalList {
    int size();

    boolean isEmpty();

    Position first();

    Position last();

    Position before(Position p) throws IllegalArgumentException;

    Position after(Position p) throws IllegalArgumentException;

    Position addFirst(Element e);

    Position addLast(Element e);

    Position addBefore(Position p, Element e) throws  IllegalArgumentException;

    Position addAfter(Position p, Element e) throws IllegalArgumentException;

    Element set(Position p, Element e) throws IllegalArgumentException;

    Element remove(Position p) throws IllegalArgumentException;


}
