package com.mx.curso.Unidad_3.Hacker;

import java.util.Scanner;

public class Dia9 {

    // Método recursivo para calcular el factorial
    public static int factorial(int n) {
        // Caso base: si n es menor o igual a 1, el factorial es 1
        if (n <= 1) {
            return 1;
        } else {
            // Caso recursivo
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int result = factorial(n);
        System.out.println(result);

        scan.close();
    }
}