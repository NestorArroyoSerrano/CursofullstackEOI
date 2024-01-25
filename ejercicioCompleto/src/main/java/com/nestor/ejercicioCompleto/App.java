package com.nestor.ejercicioCompleto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.nestor.entidades.Films;

public class App {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<Films> films = new ArrayList<>();

        boolean exit = false;
        while (!exit) {
            printMenu();
            int option = readOption();

            switch (option) {
                case 1:
                    // Opción 1: Coincidencia en películas
                    // Implementar la lógica para encontrar las películas con la coincidencia de personajes
                    break;
                case 2:
                    // Opción 2: Serializar y deserializar personajes
                    // Implementar la lógica para serializar y deserializar personajes
                    break;
                case 3:
                    // Opción 3: Obtener naves con mayor capacidad que el JSON
                    // Implementar la lógica para obtener las naves con mayor capacidad en una película
                    break;
                case 4:
                    // Opción 4: Transformar JSON a XML
                    // Implementar la lógica para transformar el JSON a XML
                    break;
                case 5:
                    // Opción 5: Leer XML y mostrar información
                    // Implementar la lógica para leer el XML y mostrar la información
                    break;
                case 0:
                    // Opción 0: Salir
                    exit = true;
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.out.println("Opción inválida, intenta de nuevo.");
                    break;
            }
        }
    }

    private static void printMenu() {
        // Implementar la lógica para imprimir el menú
    }

    private static int readOption() {
        // Implementar la lógica para leer la opción del usuario
        return 0;
    }
}