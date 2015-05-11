package com.ljustin.jblackjack;

import com.ljustin.jblackjack.game.BlackJackGameEngine;
import com.ljustin.jblackjack.game.BlackJackIntroState;
import com.ljustin.jblackjack.game.GameEngine;
import com.ljustin.jblackjack.models.Deck;
import com.ljustin.jblackjack.models.DeckFactory;

public class Driver
{
    public static void main(String[] args)
    {
        Deck frenchDeck = DeckFactory.makeDeck("French");
        
        // init game (LOADING STATE)
        
        // init player (MENU STATE)
        
        // 1 player game
        
        // give name, betting money (GAME SETUP)
        
        // 1 card face down on dealer (GAME PLAY)
        
        // player receives two cards
        
        // 1 card face up on dealer (if ace showing,
        // player can place insurance bet)
        // dealer checks face down cards,
        // if blackjack, do calc
        
        // each player have choice to hit or stand
        
        // if player dealt two same card, can split
        // and place another bet equal to original bet
        // and can take hit cards on each hand
        
        // if total > 21, bust
        
        // else can continue hit until satisfied (stand)
        // when players bust or stand, dealer reveals hidden
        // card. dealer must hit soft 17 and must stand 
        // at 17 or higher
        
        // if dealer busts, all remaining players
        // win sum equal to the bet
        // or if player has higher hand, wins sum equal to the bet (GAME OVER)
        
        GameEngine game = new BlackJackGameEngine();
        game.init();
        
        game.changeState(BlackJackIntroState.getInstance());
        
        while (game.isRunning())
        {
            game.handleEvents();
            game.update();
            game.render();
        }
        
        game.cleanUp();
        
        
    }
}
