package com.ljustin.jblackjack.game;


public class BlackJackIntroState extends BlackJackGameState
{

    private static final GameState instance = new BlackJackIntroState("Intro");
    
    public BlackJackIntroState(String name)
    {
        super(name);
    }

    
    public static GameState getInstance()
    {
        return instance;
    }
    
    @Override
    public void init(GameEngine game)
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void cleanUp()
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void pause()
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void resume()
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void handleEvents()
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void update()
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void render()
    {
        // TODO Auto-generated method stub

    }
    
    @Override
    public String toString()
    {
        return this.getName();
    }

}
