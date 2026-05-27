package com.mx.curso.Unidad_3.Hacker;

import java.util.Scanner;

public class Dia4 {
    private int age; // Variable de instancia

    // Constructor
    public Dia4 (int initialAge) {
        if (initialAge < 0) {
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        } else {
            this.age = initialAge;
        }
    }

    // Método para evaluar la edad [cite: 122]
    public void amIOld() {
        if (this.age < 13) {
            System.out.println("You are young.");
        } else if (this.age < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }
    }

    // Método que incrementa la edad
    public void yearPasses() {
        this.age++;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce cantidad de casos de prueba:");
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Dia12.Person p = new Dia12.Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses(); // Pasan 3 años
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}
