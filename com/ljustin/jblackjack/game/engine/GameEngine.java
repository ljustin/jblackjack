package com.ljustin.jblackjack.game.engine;

import java.util.Stack;

import com.ljustin.jblackjack.game.Game;

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
    public abstract Game getGame();
    
    public void changeState(GameState state)
    {
        if (!gameStates.isEmpty())
        {
            gameStates.pop();
        }
        
        pushState(state);
    }
    
    public void popState()
    {
        if (!gameStates.isEmpty())
        {
            gameStates.peek().cleanUp();
            gameStates.pop();
        }
        
        if (!gameStates.isEmpty())
        {
            gameStates.peek().resume();
        }
    }
    
    public void pushState(GameState state)
    {
        if (!gameStates.isEmpty())
        {
            gameStates.peek().pause();
        }
        
        gameStates.push(state);
        state.init(this);
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
