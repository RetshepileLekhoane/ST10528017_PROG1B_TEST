/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gamingconsolereport;

/**
 *
 * @author Student
 */
public class GamingConsoleReport {

    public static void main(String[] args) {
        
         // Single-dimensional arrays
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        String[] consoles = {"PS5", "XBOX", "SWITCH"};

        //2D array: rows = cities, columns = consoles
        int[][] sales = {
            {1000, 2000, 3000},   // Cape Town
            {2000, 3000, 4000},   // Port Elizabeth
            {1500, 1100, 1200}    // Pretoria
        };

        // 1D array for total 
        int[] totals = new int[cities.length];

        // Calculation of total sales per city
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                totals[i] += sales[i][j];
            }
        }

        //City with the most sales
        int maxIndex = 0;
        for (int i = 1; i < totals.length; i++) {
            if (totals[i] > totals[maxIndex]) {
                maxIndex = i;
            }
        }

        String line = "-".repeat(60);

        // Report heading
        System.out.println(line);
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println(line);

        // Console headings
        System.out.printf("%-20s", "");
        for (String console : consoles) {
            System.out.printf("%-10s", console);
        }
        System.out.println();

        // City rows with sales
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-20s", cities[i]);
            for (int j = 0; j < consoles.length; j++) {
                System.out.printf("%-10d", sales[i][j]);
            }
            System.out.println();
        }

        // Totals
        System.out.println(line);
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println(line);
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-20s%d%n", cities[i], totals[i]);
        }

        // Highest city
        System.out.println(line);
        System.out.println("CITY WITH THE MOST SALES: " + cities[maxIndex]);
        System.out.println(line);
    }
}


