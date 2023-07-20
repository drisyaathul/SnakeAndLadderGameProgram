package com.bridgelabz;

import java.util.Random;

public class SnakeAndLadderGame {

    public static void main(String[] args) {
        System.out.println("*** Welcome To Snake And Ladder Game ***");
        System.out.println("Let Start the Game SNAKE AND LADDER");

//UC1:Single Player at Start Position.
        int player1Position = 0;
        System.out.println("Player1 at Start Position Zero");

//UC2: Using RANDOM to get the number between 1 - 6.

//UC4: Player reaches the winning position 100.
        boolean currentTurn = true;
        int winningPosition = 100;

        while (player1Position != winningPosition) {

            if (currentTurn == true) {

                Random random = new Random();
                int dice = random.nextInt(6) + 1;
                System.out.println("Player1 rolls the die to get a number : " + dice);

//UC3: Using RANDOM and Switch case to check player for option.
                int option = random.nextInt(3) + 1;
                switch (option) {
                    case 1:
                        System.out.println("NO PLAY");
                        System.out.println("Player1 stays in the SamePosition : " + player1Position);
                        break;
                    case 2:
                        System.out.println("LADDER");
                        System.out.println("Player1 moves ahead : " + (player1Position + dice));
                        player1Position += dice;
                        break;
                    case 3:
                        System.out.println("SNAKE");
                        System.out.println("Player1 moves behind : " + (player1Position - dice));
                        player1Position -= dice;
                        break;
                }
                if (player1Position < 0 ) {
                    player1Position = 0;
                }
//UC5: Player gets to exact winning position 100.
                if (player1Position > winningPosition) {
                    player1Position -= dice;
                    System.out.println("Player1 stays in the SamePosition : "+(player1Position));
                }
            }
        }
        System.out.println("* Player1 reaches the Winning Position *");


    }
}
