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
public class Ejercicio8 {
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número entero
        System.out.print("Ingrese un número entero para calcular su factorial: ");
        int numero = scanner.nextInt();

        // Calcular y mostrar el factorial
        long factorial = calcularFactorial(numero);
        System.out.println("El factorial de " + numero + " es: " + factorial);

        // Cerrar el Scanner
        scanner.close();
    }

    // Función para calcular el factorial de un número
    public static long calcularFactorial(int n) {
        if (n < 0) {
            // Manejar el caso de números negativos (factorial no está definido)
            System.out.println("El factorial no está definido para números negativos.");
            return -1; // Valor de retorno indicando un error
        }

        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }

        return resultado;
    }
}