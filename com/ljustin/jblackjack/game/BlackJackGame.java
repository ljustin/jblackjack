package com.ljustin.jblackjack.game;

import java.util.Scanner;

public class BlackJackGame implements Game
{
    private final static Scanner scanner = new Scanner(System.in);
    // data
    // console
    // inputs
    public void show(String s)
    {
        System.out.println(s);
    }

    @Override
    public String getInput()
    {
        return scanner.nextLine();
    }

}
