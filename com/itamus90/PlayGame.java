package com.itamus90;

import java.util.Scanner;

public class PlayGame
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Game game = new Game();
        char quit = ' ';

        while (quit != 'Q')
        {
            game.play();

            System.out.println("Play again? Press any key to continue, or 'Q' to quit " );
            quit = scanner.nextLine().toUpperCase().charAt(0);
        }

        scanner.close();
        game.displayState();
    }
}
