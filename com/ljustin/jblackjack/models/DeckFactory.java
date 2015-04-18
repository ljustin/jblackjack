package com.ljustin.jblackjack.models;

import java.util.ArrayList;
import java.util.List;


// make it abstract later
public class DeckFactory
{
    public static Deck makeDeck(String type)
    {
        List<Card> cards = new ArrayList<Card>();
        
        if (type.equalsIgnoreCase("French"))
        {
            for (Suit s: Suit.values())
            {
                for (Rank r: Rank.values())
                {
                    System.out.println("Creating " + r + " of " + s);
                    cards.add(new Card(r, s));
                }            
            }
        }
        
        return new Deck(cards);
    }
}
