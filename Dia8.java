package com.mx.curso.Unidad_3.Hacker;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dia8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        // Crear el mapa para almacenar la agenda (Clave: Nombre, Valor: Teléfono)
        Map<String, Integer> phoneBook = new HashMap<>();

        // Registrar los n contactos
        for (int i = 0; i < n; i++) {
            String name = scan.next();
            int phone = scan.nextInt();
            phoneBook.put(name, phone);
        }

        // Leer consultas hasta que ya no haya más líneas en la consola (EOF)
        while (scan.hasNext()) {
            String query = scan.next();
            if (phoneBook.containsKey(query)) {
                System.out.println(query + "=" + phoneBook.get(query));
            } else {
                System.out.println("Not found");
            }
        }
        scan.close();
    }
}
