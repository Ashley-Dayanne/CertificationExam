package com.mx.curso.Unidad_3.Hacker;

import java.util.Scanner;

public class Dia5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce el número para ver su tabla:");
        int n = scan.nextInt();

        // Bucle for del 1 al 10
        for (int i = 1; i <= 10; i++) {
            int resultado = n * i; [
            // Usamos printf para darle el formato exacto "n x i = resultado"
            System.out.printf("%d x %d = %d%n", n, i, resultado);
        }
        scan.close();
    }
}
