package com.bridgelabz.snakeladder;

import java.util.Random;

public class SnakeLadderProblem {
    static int SnLa(int a, int b) {

        Random random = new Random();
        while (a != 100) {
            b++;
            int SingleplayerRolls = random.nextInt(6) + 1;
            int c = random.nextInt(3);
            System.out.println();
            System.out.println();
            System.out.println("The Player rolls the die & get a number: " + SingleplayerRolls);
            if (c == 0) {
                System.out.println("No play - stays in the same position");
                System.out.println("Player current position: " +a);
            }
            if (c == 1) {     {
                    a += SingleplayerRolls;
                    System.out.println("Gets Ladder & Player moves ahead by number of position: " + SingleplayerRolls);
                    System.out.println("Player current position: " + a);
                    if (a == 100)
                        break;
                    }
                    if (a > 100) {
                        a -= SingleplayerRolls;
                        System.out.println();
                        System.out.println("The Number goes beyond 100");
                        System.out.println("Therefore Player current position: " + a);
                        System.out.println("The Number Required by Player is: " + (100 - a));
                    }
                    {
                        SingleplayerRolls = random.nextInt(6) + 1;
                        a += SingleplayerRolls;
                        System.out.println("Gets Ladder so playing again and moves ahead by number of psition: " + SingleplayerRolls);
                        System.out.println("Player current position: " + a);
                    }
                }
                if (c == 2) {
                    a -= SingleplayerRolls;
                    System.out.println("Snake bytes & Player moves Behind by number of psition: " + "-" + SingleplayerRolls);
                    if (a < 0) {
                        a = 0;
                        System.out.println("Player current position: " + a);
                    } else
                        System.out.println("Player current position: " + a);
                }
                if (a > 100) {
                    a -= SingleplayerRolls;
                    System.out.println();
                    System.out.println("The Number goes beyond 100");
                    System.out.println("Therefore Player current position: " + a);
                    System.out.println("The Number Required by Player is: " + (100 - a));
                }
                System.out.println();
                System.out.println("Number of times player played: " + b);
                System.out.println();

            }
            return b;
        }


        public static void main(String[] args) {

            System.out.println("Snake & Ladder Simulator");
            System.out.println();
            System.out.println("Starting position of Single Player is: 0");
            System.out.println();

            int player1 = SnLa(0, 0);
            {
                System.out.println("Number of times player1 played: " + player1);
            }
            int player2 = SnLa(0, 0);
            {
                System.out.println("Number of times player2 played: " + player2);
            }
            System.out.println();
            if (player1 > player2)
                System.out.println("Player2 won the game");
            else
                System.out.println("Player1 won the game");
        }
    }