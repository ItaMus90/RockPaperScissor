package com.itamus90;

import com.itamus90.enumGameItems.CHOICES;
import com.itamus90.enumGameItems.RESULT;

/**
 * Created by Itamar on 05-Aug-17.
 */
public class Game
{
    private Player player;
    private Computer computer;
    private CHOICES playerChoices;
    private CHOICES computerChoices;
    private RESULT result;

    public Game()
    {
        player = new Player();
        computer = new Computer();
    }

    public void play()
    {

    }
}
