package com.CSC205AA.activity.cards;

import javax.naming.OperationNotSupportedException;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class StandardDeck implements Deck{

    List<Card> cards;

    public StandardDeck() {
        this.cards = newDeck();
    }

    private List<Card> newDeck() {
        List<Card> newDeck = new ArrayList<>();

        Arrays.stream(Suit.values()).forEach(suit -> {
            Arrays.stream(FaceValue.values())
                    .map(faceValue -> new Card(suit, faceValue))
                    .forEach(newDeck::add);

        });

        return newDeck;
    }

    @Override
    public void shuffle() {
        Collections.shuffle(this.cards);
    }

    @Override
    public void cut(int index) {
        List<Card> top = this.cards.subList(0,index);
        List<Card> bottom = this.cards.subList(index, this.cards.size());

        this.cards.clear();

        this.cards.addAll(bottom);
        this.cards.addAll(top);

    }

    @Override
    public Card deal() {
        return null;
    }

    @Override
    public Card turnOver() {
        return null;
    }

    @Override
    public int search(Card card) {
        return 0;
    }

    @Override
    public void newOrder(Deck cards) {

    }

    @Override
    public int size() {
        return this.cards.size();
    }

    @Override
    public int newSize() throws OperationNotSupportedException {
        return Deck.super.newSize();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("StandardDeck {");
        sb.append("cards=").append(cards);
        sb.append('}');
        return sb.toString();
    }
}
