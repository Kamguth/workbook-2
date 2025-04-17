package com.pluralsight;

public class ForWhileLoop {
    public static void main(String[] args) throws InterruptedException {
        for (int launcher = 10; launcher >= 1; launcher--) {
            System.out.println(launcher);
            Thread.sleep(1000);
        }
        System.out.println("Launch!");
    }
}