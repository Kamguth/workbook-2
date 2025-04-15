package com.pluralsight;
import java.util.Scanner;

public class NameParserApplication {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter full name: ");
        String fullName = input.nextLine().trim();

        String[] nameParts = fullName.split(" ");

        String firstName = nameParts[0];
        String middleName = nameParts[1];
        String lastName = nameParts[2];

        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);



    }
}
