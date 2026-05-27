package com.mx.curso.Unidad_3.Hacker;

import java.util.Scanner;

public class Dia6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Leer la cantidad de casos de prueba
        int T = scan.nextInt();
        scan.nextLine(); // Limpiar el buffer

        for (int i = 0; i < T; i++) {
            String S = scan.nextLine();

            StringBuilder pares = new StringBuilder();
            StringBuilder impares = new StringBuilder();

            // Recorrer la cadena carácter por carácter
            for (int j = 0; j < S.length(); j++) {
                if (j % 2 == 0) {
                    pares.append(S.charAt(j)); // Índice par
                } else {
                    impares.append(S.charAt(j)); // Índice impar
                }
            }

            // Imprimir ambos bloques separados por un espacio
            System.out.println(pares + " " + impares);
        }
        scan.close();
    }
}
