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
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero entero: ");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo numero entero: ");
        int num2 = scanner.nextInt();

        // Calcular y mostrar el MCD
        int mcd = calcularMCD(num1, num2);
        System.out.println("El MCD de " + num1 + " y " + num2 + " es: " + mcd);

        // Cerrar el Scanner
        scanner.close();

    }

    // Función para calcular el MCD utilizando el algoritmo de Euclides
    public static int calcularMCD(int a, int b) {
        // Aplicar el algoritmo de Euclides
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        // El MCD es el último valor no nulo de 'b'
        return a;
    }

}
