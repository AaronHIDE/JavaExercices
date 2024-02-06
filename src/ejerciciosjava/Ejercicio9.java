/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosjava;

import java.util.*;

/**
 *
 * @author GERMAN OCHOA
 */
public class Ejercicio9 {
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        // Crear una lista para almacenar los números
        ArrayList<Double> numeros = new ArrayList<>();
        
        // Solicitar al usuario que ingrese los números
        System.out.println("Ingresa los números uno por uno (ingresa una letra para terminar): ");
        while (scanner.hasNextDouble()) {
            double numero = scanner.nextDouble();
            numeros.add(numero);
        }
        
        // Solicitar al usuario que elija el tipo de ordenamiento
        System.out.print("¿Quieres ordenar los números en orden ascendente (asc) o descendente (desc)? ");
        String orden = scanner.next();
        
        // Ordenar la lista de números
        if (orden.equalsIgnoreCase("asc")) {
            Collections.sort(numeros);
        } else if (orden.equalsIgnoreCase("desc")) {
            Collections.sort(numeros, Collections.reverseOrder());
        } else {
            System.out.println("Opción de ordenamiento no válida.");
            return;
        }
        
        // Mostrar la lista de números ordenada
        System.out.println("Lista de números ordenada en orden " + orden + ": ");
        for (double numero : numeros) {
            System.out.print(numero + " ");
        }
        
        // Cerrar el scanner
        scanner.close();
        
    }
}
