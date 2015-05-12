package com.ljustin.jblackjack.game.engine;

import com.ljustin.jblackjack.game.BlackJackGame;


public class BlackJackGameEngine extends GameEngine
{
    // context 
    // a single game
    // a deck
    // a dealer
    // a player (1 - n)
    private BlackJackGame game;
    
    public BlackJackGameEngine()
    {
        super();
    }
    
    public BlackJackGame getGame()
    {
        return this.game;
    }

    public void init()
    {
        // initialize the game
        game = new BlackJackGame();
        // load resources
        // setup logic
        super.init();
    }

    public void cleanUp()
    {
        // TODO Auto-generated method stub
        
    }

    public void changeState(GameState gameState)
    {
        super.changeState(gameState);
        // TODO Auto-generated method stub
        String currentState = this.peekState() == null ? "NONE" : this.peekState().toString();
        
        System.out.println("Changing state from " + currentState + " to " + gameState);
    }

    public void popState()
    {
        // TODO Auto-generated method stub
        super.popState();
    }

    public void pushState(GameState state)
    {
        // TODO Auto-generated method stub
        super.pushState(state);
    }

    public void quit()
    {
        // TODO Auto-generated method stub
        isRunning = false;
    }


    @Override
    public void handleEvents()
    {
        // TODO Auto-generated method stub
        System.out.println("Handling events...");
        peekState().handleEvents();
    }

    @Override
    public void update()
    {
        // TODO Auto-generated method stub
        System.out.println("Updating game...");
        peekState().update();
    }

    @Override
    public void render()
    {
        // TODO Auto-generated method stub
        System.out.println("Rendering game...");
        peekState().render();
    }
    
    

}
