package com.ljustin.jblackjack;

public interface GameState
{
    public void init();
    public void cleanUp();
    public void pause();
    public void resume();
    public void update();
    public void render();
    public void changeState();
}
