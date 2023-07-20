package com.bridgelabz;

import java.util.Random;

public class SnakeAndLadderGame {

    public static void main(String[] args) {
        System.out.println("*** Welcome To Snake And Ladder Game ***");
        System.out.println("Let Start the Game SNAKE AND LADDER");

//Player1 and Player2 at Start Position.
        int player1Position = 0;
        int player2Position = 0;
        System.out.println("Player1 and Player2 at start Position Zero.");
        System.out.println("Player1 starts the Game");

//Player reaches the winning position 100 and Count the dice to win the game.
        boolean currentTurn = true;
        int winningPosition = 100;
        int count1 = 0;
        int count2 = 0;

        while (player1Position != winningPosition && player2Position != winningPosition) {

            if (currentTurn == true) {
 //Player1:
//Using RANDOM to get the number between 1 - 6.
                Random random = new Random();
                int dice = random.nextInt(6) + 1;
                System.out.println("Player1 rolls the die to get a number : " + dice);

//Using RANDOM and Switch case to check player for option.
                int option = random.nextInt(3) + 1;
                switch (option) {
                    case 1:
                        System.out.println("NO PLAY");
                        System.out.println("Player1 stays in the SamePosition : " + player1Position);
                        currentTurn = false;
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
                        currentTurn = false;
                        break;
                }
                count1++;

                if (player1Position < 0 ) {
                    player1Position = 0;
                    System.out.println("Player1 stays in the SamePosition : "+(player1Position));
                }

//Player gets to exact winning position 100.
                if (player1Position > winningPosition) {
                    player1Position -= dice;
                    System.out.println("Player1 stays in the SamePosition : "+(player1Position));
                }
//player2 game
            } else {
                System.out.println("Player2 currently at Position : "+player2Position);
                Random random = new Random();
                int dice = random.nextInt(6) + 1;
                System.out.println("Player2 rolls the die to get a number : " + dice);

                int option = random.nextInt(3) + 1;
                switch (option) {
                    case 1:
                        System.out.println("NO PLAY");
                        System.out.println("Player2 stays in the SamePosition : " + player2Position);
                        currentTurn = true;
                        break;
                    case 2:
                        System.out.println("LADDER");
                        System.out.println("Player2 moves ahead : " + (player2Position + dice));
                        player2Position += dice;
                        break;
                    case 3:
                        System.out.println("SNAKE");
                        System.out.println("Player2 moves behind : " + (player2Position - dice));
                        player2Position -= dice;
                        currentTurn = true;
                        break;
                }
                count2++;

                if (player2Position < 0 ) {
                    player2Position = 0;
                    System.out.println("Player2 stays in the SamePosition : "+(player2Position));
                }

//Player gets to exact winning position 100.
                if (player2Position > winningPosition) {
                    player2Position -= dice;
                    System.out.println("Player2 stays in the SamePosition : "+(player2Position));
                }
            }
        }
        System.out.println();
        if (player1Position == winningPosition) {
            System.out.println("** Player1 won the Game **");
            System.out.println("Number of Times the Player1 was played to win the Game : "+count1);
        } else {
            System.out.println("** Player2 won the Game **");
            System.out.println("Number of Times the Player2 was played to win the Game : "+count2);
        }
    }
}
