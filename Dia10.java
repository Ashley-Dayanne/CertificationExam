package com.mx.curso.Unidad_3.Hacker;

import java.util.Scanner;

public class Dia10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        // Convertir el número entero a su representación binaria en String
        String binaryString = Integer.toBinaryString(n);

        int maxConsecutivos = 0;
        int contadorActual = 0;

        // Recorrer el string binario para contar los '1' seguidos
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') {
                contadorActual++;
                // Si el conteo actual supera al récord máximo anterior, lo actualizamos
                if (contadorActual > maxConsecutivos) {
                    maxConsecutivos = contadorActual;
                }
            } else {
                // Al encontrar un '0', la racha de '1's consecutivos se rompe y vuelve a 0
                contadorActual = 0;
            }
        }

        System.out.println(maxConsecutivos);
        scan.close();
    }
}
