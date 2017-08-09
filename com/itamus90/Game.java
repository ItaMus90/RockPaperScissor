package com.itamus90;

import com.itamus90.enumGameItems.CHOICES;
import com.itamus90.enumGameItems.RESULT;

import java.security.PrivateKey;
import java.util.Scanner;

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
    private Scanner scanner;

    public Game()
    {
        player = new Player();
        computer = new Computer();
        scanner = new Scanner(System.in);
    }

    /**
     * This method is the game plain
     */
    public void play()
    {
        playerChoicePlay();
        computerChoices = computer.getChoices();
        getResult();
        displayResults();
        state();
    }

    /**
     * This method display all information about the game
     */
    public void displayState()
    {
        System.out.println("You have played " + (player.getWins() + player.getLoses() + player.getTies()));
        displayState(player);
        System.out.println("-----------------");
        displayState(computer);

    }

    /**
     *
     * @param playerType send for print the information record about player type
     */
    private void displayState(PlayerType playerType)
    {
        System.out.println(playerType.getClass().getSimpleName() + " have won " + playerType.getWins() + " times");
        System.out.println(playerType.getClass().getSimpleName() + " have lost " + playerType.getLoses() + " times");
        System.out.println("The tie happen " + playerType.getTies() + " times");
    }

    /**
     * This method  check the result member and increase
     * the win lose or tie of player and computer
     */
    private void state()
    {
        if (result == RESULT.WIN)
        {
            player.increaseWins();
            computer.increaseLoses();
        }
        else if (result == RESULT.LOSE)
        {
            player.increaseLoses();
            computer.increaseWins();
        }
        else
        {
            player.increaseTies();
            computer.increaseTies();
        }
    }

    /**
     * This methods displays the result of game
     */
    private void displayResults()
    {
        switch (result)
        {
            case WIN:
                System.out.println(playerChoices + " beats " + computerChoices + " , Player WINS");
                break;

            case LOSE:
                System.out.println(playerChoices + " loses to " + computerChoices + " , Player LOSE");
                break;

            case TIE:
                System.out.println(playerChoices + " equals to " + computerChoices + " , It's a DRAW");
                break;
        }
    }

    /**
     * This methods get from keyboard any char(R, P, S)
     * and convert its to enum choice
     */
    private void playerChoicePlay()
    {
        char playerChoice = Character.MAX_VALUE;
        boolean isNone = true;
        do
        {
            System.out.println("Please enter your choice: R = Rock, P = Paper, S = Scissor ");
            playerChoice = scanner.nextLine().toUpperCase().charAt(0);
            playerChoices = player.getChoices(playerChoice);

            if (!playerChoices.equals(CHOICES.NONE))
            {
                isNone = false;
            }
            else
            {
                System.out.println("Invalid input");
            }

        }while (isNone);
    }

    /**
     * This method help to compare between the choices of player
     * and computer
     *
     */
    private void getResult()
    {
        if (playerChoices.equals(computerChoices))
        {
            result = RESULT.TIE;
        }
        else
        {
            switch (playerChoices)
            {
                case ROCK:
                    //If not scissor then it choose at paper
                    result = (computerChoices == CHOICES.SCISSOR ? RESULT.WIN : RESULT.LOSE);
                    break;
                case PAPER:
                    //If not Rock then it choose at scissor
                    result = (computerChoices == CHOICES.ROCK ? RESULT.WIN : RESULT.LOSE);
                    break;
                case SCISSOR:
                    //If not Paper then it choose at Rock
                    result = (computerChoices == CHOICES.PAPER ? RESULT.WIN : RESULT.LOSE);
                    break;
            }
        }
    }
}
