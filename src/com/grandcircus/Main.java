package com.grandcircus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String userName = null;
        int userNum = 0;
        String repeat = null;

        Scanner scnr = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        userName = scnr.next();
        do {

            System.out.print("Enter an integer ranging from 1 to 100: ");
            userNum = scnr.nextInt();

            if ((userNum % 2) != 0) {
                System.out.println(userName + ", " + userNum + " is Odd.");
            }

            if ((userNum % 2) == 0) {
                System.out.println(userName + ", " + userNum + " is Even.");
            }

            if ((userNum >= 2) && (userNum <= 25) && ((userNum % 2) == 0)) {
                System.out.println(userName + ", " + userNum + " is Even and less than 25");
            }

            if ((userNum % 2) == 0)
                if ((userNum >= 26) && (userNum <= 60)) {
                    System.out.println(userName + ", " + userNum + " is Even.");
                }

            if (((userNum % 2) != 0) && (userNum > 60)) {
                System.out.println(userName + ", " + userNum + " is Odd and over 60.");
            }

            System.out.println("Would you like to play again? Y/N?");
            repeat = scnr.next();

        } while (!repeat.equals("N") && !repeat.equals("n"));

        System.out.println("Thanks for playing " + userName + "!");













    }
}
