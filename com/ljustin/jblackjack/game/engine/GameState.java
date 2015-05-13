package com.ljustin.jblackjack.game.engine;


public abstract class GameState
{
    private GameEngine ge;
    private String name;
    
    public GameState(String name)
    {
        this.setName(name);
    }
    
    public void init(GameEngine ge)
    {
        this.ge = ge;
    }
    
    public GameEngine getEngine()
    {
        return ge;
    }

    public void setEngine(GameEngine ge)
    {
        this.ge = ge;
    }

    public abstract void cleanUp();
    public abstract void pause();
    public abstract void resume();
    public abstract void handleEvents();
    public abstract void update();
    public abstract void render();
    
    public void changeState(GameState gameState)
    {
        ge.changeState(gameState);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
