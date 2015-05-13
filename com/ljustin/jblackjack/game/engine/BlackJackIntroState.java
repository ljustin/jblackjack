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
    
    
    private String getIntroMessage()
    {
        String s = "**********************************\n"
                + "Welcome to JBlackJack Console App!\nHope you go home with a million bucks!\n"
                + "**********************************\n";
        return s;
    }
    
    private String getMenu()
    {
        return "Please choose: \n" +
        		"1)New Game\n2)Quit\n";
    }
    
    @Override
    public void init(GameEngine ge)
    {
        super.init(ge);
        
        ge.getGame().show(getIntroMessage());
        ge.getGame().show(getMenu());
        
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
        super.cleanUp();
    }

    @Override
    public void pause()
    {
        super.pause();
    }

    @Override
    public void resume()
    {
        super.resume();
    }

    @Override
    public void handleEvents()
    {
        super.handleEvents();

        while(true)
        {
            String input = this.getEngine().getGame().getInput();
            
            switch (input)
            {
            case "1":
                System.out.println("go to new game state");
                break;
            case "2":
                System.out.println("Quitting the game...");
                this.getEngine().quit();
                break;
            default:
                break;
            }
        }
        
        
    }

    @Override
    public void update()
    {
        super.update();
    }

    @Override
    public void render()
    {
        super.render();
    }
    
    @Override
    public String toString()
    {
        return this.getName();
    }

}
