package com.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, Java!");
        System.out.println("Welcome to Maven!");

        while (true) {
            System.out.print("Please enter your name (or type 'exit' to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;
            }
            System.out.println("Hello, " + input + "! Nice to meet you.");
        }
        scanner.close();
    }
}
