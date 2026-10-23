
package com.mycompany.registration2;

import java.util.Scanner;

public class Registration2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Full Name: ");
        String fullName = input.nextLine();

        System.out.print("Enter Username: ");
        String username = input.nextLine();

        System.out.print("Enter Password: ");
        String password = input.nextLine();

        System.out.print("Confirm Password: ");
        String confirmPassword = input.nextLine();

        if (username.length() < 5) {
            System.out.println("Error: Username must be at least 5 characters long.");
            return;
        }

        if (password.length() < 8) {
            System.out.println("Error: Password must be at least 8 characters long.");
            return;
        }

        if (!password.equals(confirmPassword)) {
            System.out.println("Error: Password and Confirm Password must match.");
            return;
        }

        System.out.println("\nRegistration successful!");
        System.out.println("Welcome " + fullName);
    }
}