package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {

Scanner input = new Scanner(System.in);

CellPhone phone = new CellPhone();

        System.out.println("Please answer the questions about cellphone information below");

        System.out.print("Enter serial number: ");
        phone.setSerialNumber(input.nextInt());
        System.out.print("Enter model: ");
        phone.setModel(input.nextLine());
        System.out.print("Enter carrier: ");
        phone.setCarrier(input.nextLine());
        System.out.print("Enter phone number: ");
        phone.setPhoneNumber(input.nextLine());
        System.out.print("Name of owner: ");
        phone.setOwner(input.nextLine());

        System.out.printf("Serial Number: %s, Model: %s, Carrier: %s, Phone Number: %s, Owner: %s", phone.getSerialNumber(), phone.getModel(), phone.getCarrier(), phone.getPhoneNumber(), phone.getOwner());

        }
    }

