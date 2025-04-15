package com.pluralsight;
import java.util.Scanner;
public class FullNameApplication {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = input.nextLine();
        System.out.print("Enter middle name: ");
        String midName = input.nextLine();
        System.out.print("Enter last name: ");
        String lastName = input.nextLine();
        System.out.print("Enter suffix: ");
        String suffix = input.nextLine();

        System.out.println(firstName +" " + midName + " " + lastName + "," + suffix);






    }
}
