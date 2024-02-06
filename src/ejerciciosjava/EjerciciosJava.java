/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosjava;

import java.util.Scanner;

/**
 *
 * @author GERMAN OCHOA
 */
public class EjerciciosJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero que quieras sumar");
        double numero1 = scanner.nextDouble();
        
        System.out.println("Ingrese el segundo numero que quieras sumar");
        double numero2 = scanner.nextDouble();
        
  
        double resultado = numero1 + numero2;
        
        System.out.println("El resultado de la suma: " + numero1 + " y altura: " + numero2);
        System.out.println("");
        System.out.println("Es: " + resultado);
        
    }
    
}
