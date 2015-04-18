package com.ljustin.jblackjack.test;

import java.util.List;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import com.ljustin.jblackjack.models.Card;
import com.ljustin.jblackjack.models.Deck;
import com.ljustin.jblackjack.models.DeckFactory;
import com.ljustin.jblackjack.models.Hand;
import com.ljustin.jblackjack.models.Rank;
import com.ljustin.jblackjack.models.Suit;

public class APITest
{

    @Before
    public void setUp() throws Exception
    {
    }

    @Test
    public void frenchDeckTest()
    {
        Deck frenchDeck = DeckFactory.makeDeck("French");
        System.out.println(frenchDeck.numCards());
        Assert.assertTrue(frenchDeck.numCards() == 52);
    }
    
    @Test
    public void handValueTest()
    {
        Hand hand = new Hand();
        
        hand.addCard(new Card(Rank.EIGHT, Suit.CLUBS));
        hand.addCard(new Card(Rank.TWO, Suit.CLUBS));
        hand.addCard(new Card(Rank.FIVE, Suit.CLUBS));
        
        List<Integer> values = hand.values();
        Assert.assertTrue(values.size() == 1);
        
        Assert.assertTrue(values.get(0) == 15);
        
        hand = new Hand();
        
        hand.addCard(new Card(Rank.EIGHT, Suit.CLUBS));
        hand.addCard(new Card(Rank.ACE, Suit.CLUBS));
        hand.addCard(new Card(Rank.TWO, Suit.CLUBS));
        
        values = hand.values();
        Assert.assertTrue(values.size() == 2);
        Assert.assertTrue(values.contains(new Integer(11)));
        Assert.assertTrue(values.contains(new Integer(21)));
        

    }

}
