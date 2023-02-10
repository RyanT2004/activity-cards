package com.CSC205AA.activity.cards;

public class DeckDriver {
    public static void main(String[] args) {

        Deck cards = new StandardDeck();
        displayDeck(cards);

        cards.shuffle();
        displayDeck(cards);
    }

    private static void displayDeck(Deck cards) {
        System.out.println(cards);

    }

}
