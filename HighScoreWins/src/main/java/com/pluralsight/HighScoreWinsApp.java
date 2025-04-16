package com.pluralsight;
import java.util.Scanner;
import java.util.regex.Pattern;



public class HighScoreWinsApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter score using 'Home:Visitor|21:9' formatting");
        System.out.print("Enter game score: ");
        String scoreInput = input.nextLine();

        String[] parts = scoreInput.split(Pattern.quote("|"));
        String[] teams = parts[0].split(":");

        String homeTeam = teams[0];
        String visitorTeam = teams[1];

        String[] scores = parts[1].split(":");

        int homeScore = Integer.parseInt(scores[0]);
        int visitorScore = Integer.parseInt(scores[1]);

        if (homeScore > visitorScore) {
            System.out.println(homeTeam + " is the winner!");
        }else if (visitorScore > homeScore){
            System.out.println(visitorTeam + " is the winner!");}
        else {
            System.out.println("It's a draw!");}






        }
    }

