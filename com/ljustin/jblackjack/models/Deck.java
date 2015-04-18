package com.ljustin.jblackjack.models;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck
{
    public List<Card> cards;
    
    public Deck(List<Card> cards)
    {
        this.cards = cards;
    }

    public int numCards()
    {
        return cards.size();
    }
    
    public void shuffle()
    {
        long seed = System.nanoTime();
        Collections.shuffle(cards, new Random(seed));
    }
    
}
