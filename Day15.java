package com.mx.curso.Unidad_3.Hacker;

import java.util.Scanner;

public class Dia15 {

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public class dia15 {

        // Método para insertar un nodo al final de la lista enlazada
        public static Node insert(Node head, int data) {
            // Caso 1: Si la lista está vacía, el nuevo nodo se convierte en la cabeza (head)
            if (head == null) {
                return new Node(data);
            }

            // Caso 2: Si ya tiene elementos, recorremos la lista hasta llegar al último nodo
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }

            // Conectamos el último nodo con el nuevo nodo creado
            current.next = new Node(data);

            return head;
        }

        public static void display(Node head) {
            Node start = head;
            while (start != null) {
                System.out.print(start.data + " ");
                start = start.next;
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Node head = null;
            int N = sc.nextInt();

            while (N-- > 0) {
                int ele = sc.nextInt();
                head = insert(head, ele);
            }
            display(head);
            sc.close();
        }
    }
}
