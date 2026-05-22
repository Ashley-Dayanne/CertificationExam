package com.mx.curso.Unidad_3.Hacker;

import java.util.Scanner;

public class Dia12 {

    static class Person {
        protected String firstName;
        protected String lastName;
        protected int idNumber;

        // Constructor de la clase base
        public Person(int idNumber) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.idNumber = idNumber;
        }

        public void printPerson() {
            System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
        }
    }

    static class Student extends Person {
        private final int[] testScores;

        // Constructor de Student usando 'super' para heredar de Person
        public Student(String firstName, String lastName, int idNumber, int[] testScores) {
            super(idNumber);
            this.testScores = testScores;
        }

        // Método para calcular la letra del promedio
        public char calculate() {
            int sum = 0;
            for (int score : testScores) {
                sum += score;
            }
            int average = sum / testScores.length;

            if (average >= 90 && average <= 100) return 'O';
            else if (average >= 80 && average < 90) return 'E';
            else if (average >= 70 && average < 80) return 'A';
            else if (average >= 55 && average < 70) return 'P';
            else if (average >= 40 && average < 55) return 'D';
            else return 'T';
        }
    }

    public static class dia12 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String firstName = scan.next();
            String lastName = scan.next();
            int id = scan.nextInt();
            int numScores = scan.nextInt();
            int[] testScores = new int[numScores];
            for (int i = 0; i < numScores; i++) {
                testScores[i] = scan.nextInt();
            }
            scan.close();

            Student s = new Student(firstName, lastName, id, testScores);
            s.printPerson();
            System.out.println("Grade: " + s.calculate());
        }
    }
}