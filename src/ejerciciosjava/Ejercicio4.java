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
public class Ejercicio4 {
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.print("Ingrese un numero: ");
        int numero = scanner.nextInt();

        // Verificar si el número es par o impar
        if (numero %2 == 0) {
            System.out.println(numero + " es un numero par.");
        } else {
            System.out.println(numero + " es un numero impar.");
        }
        
    }
    
}
