package com.ljustin.jblackjack.test;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import com.ljustin.jblackjack.models.Deck;
import com.ljustin.jblackjack.models.DeckFactory;

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

}
