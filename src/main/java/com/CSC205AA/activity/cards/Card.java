package com.CSC205AA.activity.cards;

public class Card implements Comparable<Card> {

    private Suit suit;
    private FaceValue value;


    public Card(Suit suit, FaceValue faceValue){

        this.suit = suit;
        this.value = faceValue;
    }



    @Override
    public int compareTo(Card o) {
        return 0;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Card {");
        sb.append(value);
        sb.append(" of ");
        sb.append(suit);
        sb.append('}');
        return sb.toString();
    }
}
