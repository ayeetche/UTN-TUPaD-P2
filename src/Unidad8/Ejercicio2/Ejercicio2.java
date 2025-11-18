package Unidad8.Ejercicio2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa un número: ");
        int num1 = Integer.parseInt(input.nextLine());

        System.out.println("Ingresa otro número: ");
        int num2 = Integer.parseInt(input.nextLine());

        // Division
        try {
            int resultado = num1 / num2;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir por cero");
        }

        // Conversión de cadena a número
        System.out.println("Ingresa una palabra");
        String palabra = input.nextLine();

        try {
            int numero = Integer.parseInt(palabra);
            System.out.println(numero);
        } catch (NumberFormatException e) {
            System.out.println("No se puede convertir texto a número");
        }

        // Lectura de archivo
        // Leer un archivo de texto y mostrarlo. Manejar FileNotFoundException si
        // el archivo no existe.
        System.out.println("Ingresa la ruta del archivo:");
        String ruta = input.nextLine();

        File elArchivo = new File(ruta);
        try (BufferedReader br = new BufferedReader(new FileReader(elArchivo));) {
            System.out.println(br.readLine());
        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el archivo");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            throw new RuntimeException("Error inesperado en el catch");
        }

        // Excepción personalizada
        // Crear EdadInvalidaException. Lanzarla si la edad es menor a 0 o mayor
        // a 120. Capturarla y mostrar mensaje.
        System.out.println("Ingresa tu edad:");
        int edad = Integer.parseInt(input.nextLine());

        try {
            if (edad < 0 || edad > 120) {
                throw new EdadInvalidaException();
            }
        } catch (EdadInvalidaException e) {
            System.out.println("Edad invalida");
        }

        // Uso de try-with-resources
        // Leer un archivo con BufferedReader usando try-with-resources.
        // Manejar IOException correctamente.
        System.out.println("Ingresa la ruta del archivo:");
        String rutaArchivo = input.nextLine();
        File archivo = new File(rutaArchivo);
        try (BufferedReader br = new BufferedReader(new FileReader(archivo));) {
            System.out.println(br.readLine());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            throw new RuntimeException("Error inesperado en el catch");
        }
    }

}
