package com.mx.curso.Unidad_3.Hacker;

import java.util.Scanner;

public class Dia7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Leer el tamaño del arreglo
        int n = scan.nextInt();
        int[] arr = new int[n];

        // Llenar el arreglo con los datos de la consola
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        // Recorrer el arreglo al revés (empezando desde n - 1 hasta 0)
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        scan.close();
    }
}
