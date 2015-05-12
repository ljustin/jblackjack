package com.ljustin.jblackjack.game;

public class BlackJackGame implements Game
{
    // data
    // console
    // inputs
    

    @Override
    public void showIntro()
    {
        System.out.println("**********************************");
        System.out.println("Welcome to JBlackJack Console App!\nHope you go home with a million bucks!\n");
        System.out.println("**********************************");
    }

    @Override
    public void showMenu()
    {
        System.out.println("Menu!!");
    }
}
