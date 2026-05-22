package com.mx.curso.Unidad_3.Hacker;

import java.util.Scanner;

public class Dia14 {

    static class Difference {
        private final int[] elements;
        public int maximumDifference;

        // Constructor
        public Difference(int[] elements) {
            this.elements = elements;
        }

        // Método para calcular la diferencia absoluta máxima
        public void computeDifference() {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            // Truco de optimización: la diferencia máxima siempre será el número más grande menos el más chico
            for (int element : elements) {
                if (element > max) max = element;
                if (element < min) min = element;
            }

            this.maximumDifference = Math.abs(max - min);
        }
    }

    public class dia14 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            sc.close();

            Difference difference = new Difference(a);
            difference.computeDifference();

            System.out.print(difference.maximumDifference);
        }
    }
}
