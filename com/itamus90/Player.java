package com.itamus90;

import com.itamus90.enumGameItems.CHOICES;

/**
 * Created by Itamar on 05-Aug-17.
 */
public class Player implements HumanOperation
{
    /**
     *
     * @param choices rock paper or scissor
     * @return CHOICE enum rock paper or scissor if none of them no selected
     * than return none
     */
    @Override
    public CHOICES getChoices(String choices)
    {
        CHOICES enumChoices = CHOICES.NONE;
        char playerChoice = choices.toUpperCase().charAt(0);

        switch (playerChoice)
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
