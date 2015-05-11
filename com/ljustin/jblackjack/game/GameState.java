package com.ljustin.jblackjack.game;


public abstract class GameState
{
    private GameEngine game;
    private String name;
    
    public GameState(String name)
    {
        this.setName(name);
    }
    
    public abstract void init(GameEngine game);
    public abstract void cleanUp();
    public abstract void pause();
    public abstract void resume();
    public abstract void handleEvents();
    public abstract void update();
    public abstract void render();
    public void changeState(GameState gameState)
    {
        game.changeState(gameState);
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
