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
public class Ejercicio5 {
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.print("Ingrese el numero que quieras saber su raiz cuadrada: ");
        int numero = scanner.nextInt();

        // Calcular la raiz cuadrada del numero
        double raiz = numero * 0.2;
        
        System.out.println("La raiz cuadrada de " + numero + " es igual a: " + raiz);
        
    }
    
}
