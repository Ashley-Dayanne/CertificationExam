package com.mx.curso.Unidad_3.Hacker;

import java.util.Scanner;

public class Dia11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[6][6];

        // Llenar la matriz de 6x6
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        // Inicializamos con el valor mínimo posible para un reloj de arena
        // (7 elementos * -9, que es el valor mínimo permitido en los constraints)
        int maxHourglassSum = -63;

        // Recorrer la matriz cuidando no salirnos de los límites del reloj (hasta índice 4)
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // Calcular la suma del reloj de arena actual
                int currentSum = arr[i][j] + arr[i][j+1] + arr[i][j+2] // Línea superior
                        + arr[i+1][j+1]               // Centro
                        + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2]; // Línea inferior

                // Si encontramos una suma mayor, actualizamos el máximo
                if (currentSum > maxHourglassSum) {
                    maxHourglassSum = currentSum;
                }
            }
        }

        System.out.println(maxHourglassSum);
        scan.close();
    }
}
