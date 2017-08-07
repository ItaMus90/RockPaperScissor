package com.itamus90;

import com.itamus90.enumGameItems.CHOICES;

/**
 * Created by Itamar on 05-Aug-17.
 */
public class Player extends PlayerType implements HumanOperation
{


    public Player()
    {
        super();
    }

    /**
     *
     * @param choices rock paper or scissor
     * @return CHOICE enum rock paper or scissor if none of them no selected
     * than return none
     */
    @Override
    public CHOICES getChoices(char choices)
    {
        CHOICES enumChoices = CHOICES.NONE;

        switch (choices)
        {
            case 'R':
                enumChoices = CHOICES.ROCK;
                break;
            case 'P':
                enumChoices = CHOICES.PAPER;
                break;
            case 'S':
                enumChoices = CHOICES.SCISSOR;
                break;
        }

        return enumChoices;
    }
}
