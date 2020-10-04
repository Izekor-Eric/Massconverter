package com.company;

import java.util.Scanner;

public class Main {

    // This function converts pounds to kilogram
    public static void pounds() {
        System.out.println("Press C to continue");
        System.out.println("Press R to return to the main menu");
        Scanner myObj = new Scanner(System.in);
        while(true) {
            System.out.print("Enter your command(C/R): ");
            String choice = myObj.next();
            if(choice.equals("C")){
                System.out.print("Enter mass in pounds: ");
                float pounds = myObj.nextFloat();
                System.out.println("Kilogram: " + (pounds / 2.2046)); // formula for converting pounds to KG
            }

            if(choice.equals("R")) {
                main(null);
                break;
            }

        }

    }
    // This function converts kilogram to pounds
    public static void kilogram() {
        System.out.println("Press C to continue");
        System.out.println("Press R to return to the main menu");
        Scanner myO = new Scanner(System.in);
        while(true) {
            System.out.print("Enter your command(C/R): ");
            String choice = myO.next();
            if(choice.equals("C")){
                System.out.print("Enter mass in kilogram: ");
                float kilogram = myO.nextFloat();

                System.out.println("pounds: " + (kilogram * 2.2046)); // kilogram to pounds formula
            }

            if(choice.equals("R")) {
                main(null);
                break;
            }

        }
    }

    // This is the main function that navigate to the conversion function using loop and conditionals
    public static void main(String[] args) {
        System.out.println("**************************************");
        System.out.println("*        Mass Calculator             *");
        System.out.println("**************************************");
        System.out.println("This program converts Distance");
        System.out.println("Press k to covert from kilogram to pounds");
        System.out.println("Press P to convert from pounds to kilogram");
        System.out.println("Press Q to quit");
        Scanner myOb = new Scanner(System.in);

        label:
        while(true) {
            System.out.print("Enter your command: ");
            String command = myOb.next();
            switch (command) {
                case "P":
                    pounds();
                    break label;
                case "K":
                    kilogram();
                    break label;
                case "Q":
                    System.out.println("Thank you for using this calculator");
                    break label;
            }
        }


    }

}
