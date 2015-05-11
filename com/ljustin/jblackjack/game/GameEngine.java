package com.ljustin.jblackjack.game;

import java.util.Stack;

public abstract class GameEngine
{
    private Stack<GameState> gameStates;
    protected boolean isRunning;
    
    public GameEngine()
    {

    }
    
    public void init()
    {
        gameStates = new Stack<GameState>();
        isRunning = true;
    }
    
    public abstract void cleanUp();
    public abstract void quit();
    public abstract void handleEvents();
    public abstract void update();
    public abstract void render();
    
    public void changeState(GameState state)
    {
        if (!gameStates.isEmpty())
        {
            gameStates.pop();
        }
        
        gameStates.push(state);
    }
    
    public void popState()
    {
        if (!gameStates.isEmpty())
        {
            gameStates.pop();
        }
    }
    
    public void pushState(GameState state)
    {
        gameStates.push(state);
    }
    
    public GameState peekState()
    {
        return gameStates.size() == 0 ? null : gameStates.peek();
    }

    
    public boolean isRunning()
    {
        GameState currentState = this.peekState();
        
        return isRunning && currentState != null;
    }
}
