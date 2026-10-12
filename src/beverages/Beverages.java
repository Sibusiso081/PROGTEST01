/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package beverages;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Beverages {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] cities = {
            "CAPE TOWN",
            "PORT ELIZABETH",
            "PRETORIA"
        };

        String[] beverages = {
            "COFFEE",
            "TEA",
            "BOBA TEA"
        };

        double[][] sales = new double[3][3];

        double[] cityTotals = new double[3];

        double grandTotal = 0;

        System.out.println("NUMBER 1 COFFEE HUT APPLICATION");
        System.out.println("----------------------------------------");

        for (int i = 0; i < cities.length; i++) {

            for (int j = 0; j < beverages.length; j++) {

                System.out.print("Enter the number of "
                        + beverages[j] + " sales for "
                        + cities[i] + ": ");

                sales[i][j] = input.nextDouble();
            }
        }

        System.out.println("\n----------------------------------------");
        System.out.println("NUMBER 1 COFFEE HUT REPORT");
        System.out.println("----------------------------------------");

        System.out.printf("%-20s %10s %10s %10s%n",
                "CITY", "COFFEE", "TEA", "BOBA TEA");

        for (int i = 0; i < cities.length; i++) {

            for (int j = 0; j < beverages.length; j++) {
                cityTotals[i] += sales[i][j];
            }

            grandTotal += cityTotals[i];

            System.out.printf("%-20s %10.2f %10.2f %10.2f%n",
                    cities[i],
                    sales[i][0],
                    sales[i][1],
                    sales[i][2]);
        }

        System.out.println("\nPRODUCT SALES TOTALS FOR EACH CITY");
        System.out.println("----------------------------------------");

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-20s R%.2f%n",
                    cities[i], cityTotals[i]);
        }

        System.out.println("----------------------------------------");
        System.out.printf("TOTAL SALES FOR CITIES: R%.2f%n",
                grandTotal);

        input.close();
    }
}
