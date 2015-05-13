package com.ljustin.jblackjack.game.engine;

public abstract class BlackJackGameState extends GameState
{

    public BlackJackGameState(String name)
    {
        super(name);
        // TODO Auto-generated constructor stub
    }
    

    @Override
    public void init(GameEngine ge)
    {
        super.init(ge);
        // TODO Auto-generated method stub
        System.out.println("Initializing game state" + this.getName());
    }

    @Override
    public void cleanUp()
    {
        // TODO Auto-generated method stub
        System.out.println("Cleaning up game state " + this.getName());
    }

    @Override
    public void pause()
    {
        // TODO Auto-generated method stub
        System.out.println("Pausing game state " + this.getName());
    }

    @Override
    public void resume()
    {
        // TODO Auto-generated method stub
        System.out.println("Resuming game state " + this.getName());
    }

    @Override
    public void handleEvents()
    {
        // TODO Auto-generated method stub
        System.out.println("Handling events.. current game state " + this.getName());
    }

    @Override
    public void update()
    {
        // TODO Auto-generated method stub
        System.out.println("Updating game.. current game state " + this.getName());
    }

    @Override
    public void render()
    {
        // TODO Auto-generated method stub
        System.out.println("Rendering game.. current game state " + this.getName());
    }

}
