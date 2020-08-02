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

    }
}
