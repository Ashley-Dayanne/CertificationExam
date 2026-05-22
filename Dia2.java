package com.mx.curso.Unidad_3.Hacker;

import java.util.Scanner;

public class Dia2 {

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        // Calcular la propina y el impuesto
        double tip = meal_cost * tip_percent / 100.0;
        double tax = meal_cost * tax_percent / 100.0;

        // Sumar
        double total_cost = meal_cost + tip + tax;

        // Redondear al entero más cercano
        int final_cost = (int) Math.round(total_cost);

        System.out.println(final_cost);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce costo de comida, % de propina y % de impuesto:");

        double meal_cost = scan.nextDouble(); [cite: 58]
        int tip_percent = scan.nextInt(); [cite: 59]
        int tax_percent = scan.nextInt(); [cite: 60]

        solve(meal_cost, tip_percent, tax_percent);
        scan.close();
    }
}