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
public class Ejercicio3 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la temperatura en grados Celsius
        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();

        // Calcular la temperatura en grados Fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;

        // Mostrar el resultado
        System.out.println("La temperatura en grados Fahrenheit es: " + fahrenheit);
        
    }
    
}
