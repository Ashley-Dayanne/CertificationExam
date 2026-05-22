package com.mx.curso.Unidad_3.Hacker;

import java.util.Scanner;

public class Dia1 {
    public static void main(String[] args) {

        // Variables por HackerRank
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        // 1. Declaration de variables
        int miEntero;
        double miDouble;
        String miString;

        System.out.println("Introduce un entero, un decimal y una frase:");

        // 2. Leer las variables desde la consola
        miEntero = scan.nextInt();
        miDouble = scan.nextDouble();
        scan.nextLine(); // Limpia el salto de línea residual
        miString = scan.nextLine();

        // 3. Imprimir los resultados
        System.out.println(i + miEntero);
        System.out.println(d + miDouble);
        System.out.println(s + miString);

        scan.close();
    }
}
