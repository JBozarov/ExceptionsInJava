package com.bozarov.exceptions;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number between 1 and 10:");

        try {
            int num = scanner.nextInt();
            if (num<1 || num>10) {
                throw new InvalidNumberException();
            }
        }catch (InvalidNumberException en) {
            System.out.println(en.getMessage());
        }


        System.out.println("Please enter string value");
        Scanner keyboard = new Scanner(System.in);
        String name = keyboard.nextLine();

        String n = "Bozarov";
        StringBuilder someString = new StringBuilder(n);

        try {
            if (!name.equals(n)) {
                throw new InvalidStringException();
            }
        }
        catch (InvalidStringException es) {
            System.out.println(es.getMessage());
        }



    }
}
