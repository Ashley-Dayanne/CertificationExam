package com.mx.curso.Unidad_3.Hacker;

import java.util.Scanner;

public class Dia3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un número N:");
        int N = scan.nextInt();

        // Evaluar las condiciones solicitadas
        if (N % 2 != 0) {
            // Si es impar
            System.out.println("Weird");
        } else {
            // Si es par, revisamos los rangos
            if (N >= 2 && N <= 5) {
                System.out.println("Not Weird");
            } else if (N >= 6 && N <= 20) {
                System.out.println("Weird");
            } else if (N > 20) {
                System.out.println("Not Weird");
            }
        }
        scan.close();
    }
}
