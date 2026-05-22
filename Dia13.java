package com.mx.curso.Unidad_3.Hacker;

import java.util.Scanner;

public class Dia13 {

    abstract static class Book {
        String title;
        String author;

        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        abstract void display();
    }

    // Clase MyBook que implementa la clase abstracta Book
    class MyBook extends Book {
        private int price;

        // Constructor
        public MyBook(String title, String author, int price) {
            super(title, author);
            this.price = price;
        }

        // Implementación obligatoria del método abstracto display
        @Override
        void display() {
            System.out.println("Title: " + this.title);
            System.out.println("Author: " + this.author);
            System.out.println("Price: " + this.price);
        }
    }

    public class dia13 {
        public void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String title = scanner.nextLine();
            String author = scanner.nextLine();
            int price = scanner.nextInt();
            scanner.close();

            Book book = new MyBook(title, author, price);
            book.display();
        }
    }
}

