package com.ljustin.jblackjack.game.engine;


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
    public void init(GameEngine ge)
    {
        // TODO Auto-generated method stub
        ge.getGame().showIntro();
        try
        {
            Thread.sleep(3400);
        }
        catch (InterruptedException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void cleanUp()
    {
        // TODO Auto-generated method stub
        super.cleanUp();
    }

    @Override
    public void pause()
    {
        // TODO Auto-generated method stub
        super.pause();
    }

    @Override
    public void resume()
    {
        // TODO Auto-generated method stub
        super.resume();
    }

    @Override
    public void handleEvents()
    {
        // TODO Auto-generated method stub
        super.handleEvents();
    }

    @Override
    public void update()
    {
        // TODO Auto-generated method stub
        super.update();
    }

    @Override
    public void render()
    {
        // TODO Auto-generated method stub
        super.render();
    }
    
    @Override
    public String toString()
    {
        return this.getName();
    }

}
