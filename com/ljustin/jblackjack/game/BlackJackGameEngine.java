package com.ljustin.jblackjack.game;


public class BlackJackGameEngine extends GameEngine
{
    // context 
    // a single game
    // a deck
    // a dealer
    // a player (1 - n)
    
    public BlackJackGameEngine()
    {
        super();
    }

    public void init()
    {
        // initialize the game
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
        
    }

    public void pushState(GameState state)
    {
        // TODO Auto-generated method stub
        
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
    }

    @Override
    public void render()
    {
        // TODO Auto-generated method stub
        System.out.println("Rendering game...");
    }
    
    

}
