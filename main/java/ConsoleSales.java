/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */

    public class ConsoleSales extends Consoles {

    public ConsoleSales(String consoleType, String store, int totalSales) {
        super(consoleType, store, totalSales);
    }

    @Override
    public void printReport() {
        System.out.println("---------------------------------");
        System.out.println("CONSOLE SALES REPORT");
        System.out.println("---------------------------------");
        System.out.println("Console Type: " + getConsoleType());
        System.out.println("Store Name:   " + getStore());
        System.out.println("Total Sales:  " + getTotalSales());
        System.out.println("---------------------------------");
    }


}
