package com.itamus90;

import com.itamus90.enumGameItems.CHOICES;

import java.util.Random;

/**
 * Created by Itamar on 05-Aug-17.
 */
public class Computer implements AIOperation
{
    private Random random;

    public Computer()
    {
        random = new Random();
    }


    /**
     * @return CHOICES 2 = ROCK
     * 3 = PAPER
     * 4 = SCISSOR
     */
    @Override
    public CHOICES getChoices()
    {
        CHOICES enumChoices = CHOICES.ROCK;

        //choices hold numbers 2 3 4
        int choices = 2 + random.nextInt(4);


        switch (choices)
        {
            case 2:
                enumChoices = CHOICES.ROCK;
                break;
            case 3:
                enumChoices = CHOICES.PAPER;
                break;
            case 4:
                enumChoices = CHOICES.SCISSOR;
                break;
        }

        return enumChoices;
    }
}
