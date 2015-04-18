package com.ljustin.jblackjack.models;

import java.util.ArrayList;
import java.util.List;

public class Hand
{
    List<Card> cards;
    
    public Hand()
    {
        this.cards = new ArrayList<Card>();
    }
    
    public void addCard(Card c)
    {
        this.cards.add(c);
    }
    
    // if hand contains an ace(s), we could have multiple values
    public List<Integer> values()
    {
        List<Integer> values = new ArrayList<Integer>();
        
        int simpleSum = 0;

        for(Card c:cards)
        {
            simpleSum += c.getRank().getValue();
        }
        
        values.add(simpleSum);

        // max 4 aces, only one of them can be 11
        if (getNumAces() > 0)
        {
            boolean usedEleven = false;
            int sum = 0;
            
            for(Card c:cards)
            {
                if (c.getRank() == Rank.ACE && !usedEleven)
                {
                    sum += 11;
                    usedEleven = true;
                }
                else
                {
                    sum += c.getRank().getValue();
                }
                
            }
            values.add(sum);
        }
        
        return values;
    }
    
    public int getNumAces()
    {
        int numAces = 0;
        for(Card c:cards)
        {
            if(c.getRank() == Rank.ACE)
                numAces++;
        }
        
        return numAces;
    }
}
