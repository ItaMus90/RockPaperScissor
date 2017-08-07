package com.itamus90;

/**
 * Created by Itamar on 08-Aug-17.
 */
public abstract class PlayerType
{
    private int wins;
    private int loses;
    private int ties;

    public PlayerType()
    {
        this.wins = 0;
        this.loses = 0;
        this.ties = 0;

    }

    public int getWins()
    {
        return wins;
    }

    public void increaseWins()
    {
        this.wins ++;
    }

    public int getLoses()
    {
        return loses;
    }

    public void increaseLoses()
    {
        this.loses ++;
    }

    public int getTies()
    {
        return ties;
    }

    public void increaseTies()
    {
        this.ties ++;
    }
}
