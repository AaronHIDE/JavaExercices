/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosjava;

import java.util.Scanner;

/**
 *
 * @author GERMAN OCHOA
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el rango
        System.out.print("Ingrese el valor mínimo del rango: ");
        int minimo = scanner.nextInt();

        System.out.print("Ingrese el valor máximo del rango: ");
        int maximo = scanner.nextInt();

        System.out.println("Números primos en el rango de " + minimo + " a " + maximo + ":");

        // Generar y mostrar los números primos en el rango
        generarPrimosEnRango(minimo, maximo);

        // Cerrar el Scanner
        scanner.close();
    }

    public static void generarPrimosEnRango(int minimo, int maximo) {
        for (int numero = minimo; numero <= maximo; numero++) {
            if (esPrimo(numero)) {
                System.out.print(numero + " ");
            }
        }
        System.out.println(); // Salto de línea después de mostrar los primos
    }

    public static boolean esPrimo(int numero) {
        // Si el número es menor o igual a 1, no es primo
        if (numero <= 1) {
            return false;
        }

        // Bucle desde 2 hasta la raíz cuadrada del número
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            // Si el número es divisible por i, no es primo
            if (numero % i == 0) {
                return false;
            }
        }

        // Si no se encontró ningún divisor, el número es primo
        return true;
    }

}
