/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.runappication;

/**
 *
 * @author Student
 */
import java.util.Scanner;
public class RunAppication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] types = {"PS5", "XBOX", "NINTENDO SWITCH"};

        System.out.println("Select a console device type:");
        for (int i = 0; i < types.length; i++) {
            System.out.println((i + 1) + ". " + types[i]);
        }

        int choice;
        do {
            System.out.print("Enter choice (1-3): ");
            while (!input.hasNextInt()) {
                System.out.print("Invalid. Enter choice (1-3): ");
                input.next();
            }
            choice = input.nextInt();
        } while (choice < 1 || choice > types.length);
        input.nextLine();

        System.out.print("Enter store name: ");
        String store = input.nextLine();

        System.out.print("Enter total amount of sales: ");
        while (!input.hasNextInt()) {
            System.out.print("Invalid. Enter total amount of sales: ");
            input.next();
        }
        int sales = input.nextInt();

 
        input.close();
    }
}

    

