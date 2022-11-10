package com.bridgelabz.snakeladder;

import java.util.Random;

public class SnakeLadderProblem {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Welcome to Snake Ladder Problem");
        System.out.println();
        int Singleplayer = 0;
        int count = 0;
        System.out.println("Starting position of Single Player is: " + Singleplayer);

        while (Singleplayer != 100) {
            count++;
            int SingleplayerRolls = random.nextInt(6) + 1;
            int a = random.nextInt(3);
            System.out.println();
            System.out.println("The Player rolls the die & get a number: " + SingleplayerRolls);
            if (a == 0) {
                System.out.println("No play - stays in the same position");
                System.out.println("Player current position: " + Singleplayer);
            }
            if (a == 1) {
                Singleplayer += SingleplayerRolls;
                System.out.println("Gets Ladder & Player moves ahead by number of position: " + SingleplayerRolls);
                System.out.println("Player current position: " + Singleplayer);
            }
            if (a == 2) {
                Singleplayer -= SingleplayerRolls;
                System.out.println("Snake bytes & Player moves Behind by number of position: " + "-" + SingleplayerRolls);
                if (Singleplayer <= 0) {
                    Singleplayer = 0;
                    System.out.println("Player current position: " + Singleplayer);
                }
                else
                    System.out.println("Player current position: " + Singleplayer);
            }
            if (Singleplayer > 100) {
                Singleplayer -= SingleplayerRolls;
                System.out.println();
                System.out.println("The Number goes beyond 100");
                System.out.println("Therefore Player current position: " + Singleplayer);
                System.out.println("The Number Required by Player is: " + (100 - Singleplayer));
            }
            System.out.println();
            System.out.println("Number of times player played: " + count);
        }

    }
}