package com.ljustin.jblackjack;

public interface GameStateManager
{
    public void init();
    public void cleanUp();
    public void changeState();
    public void popState();
    public void pushState();
    public void quit();
    public void handleEvents();
    public void update();
    public void render();
}
