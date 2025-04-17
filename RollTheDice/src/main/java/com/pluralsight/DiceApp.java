package com.pluralsight;

public class DiceApp {
    public static void main(String[] args) {

        Dice dice = new Dice();

        int roll1, roll2;
        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;

        for (int rolls = 1; rolls <= 100; rolls++) {
            roll1 = dice.roll();
            roll2 = dice.roll();

            int sum = roll1 + roll2;

            System.out.println("Roll " + rolls + ": " + roll1 + " - " + roll2 + "  Sum: " + sum);

            if (sum == 2) {
                twoCounter++;
            }
            if (sum == 4) {
                fourCounter++;
            }
            if (sum == 6) {
                sixCounter++;
            }
            if (sum == 7) {
                sevenCounter++;
            }
            System.out.println("\nFinal Results:");
            System.out.println("Twos: " + twoCounter);
            System.out.println("Fours: " + fourCounter);
            System.out.println("Sixes: " + sixCounter);
            System.out.println("Sevens: " + sevenCounter);

        }
        }
    }

