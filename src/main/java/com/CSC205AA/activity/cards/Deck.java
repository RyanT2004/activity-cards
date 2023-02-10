package com.CSC205AA.activity.cards;

import javax.naming.OperationNotSupportedException;

public interface Deck {

    //API for the card deck
    void shuffle();
    void cut(int index);
    Card deal();
    Card turnOver();
    int search(Card card);
    void newOrder(Deck cards);
    int size();

    default int newSize() throws OperationNotSupportedException {
        throw new OperationNotSupportedException();
    }
}
