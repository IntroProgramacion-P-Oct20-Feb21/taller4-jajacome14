/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioscuatro;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
        // 1. Inicio
    public static void main(String[] args) {
        // Declaro la variables
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // 2. altura,d[0,n]
        double altura; 
        //3. base,d[0,n]
        double base;
        //4. area,d[0,n]
        double area;
        
        // Pido los datos por teclado - entradas
        // 5. << "Ingrese la altura del triángulo"
        System.out.println("Ingrese la altura del triángulo:");
        // 6. >> altura
        altura = entrada.nextDouble();
        // 7. <<"Ingrese la base del triángulo"
        System.out.println("Ingrese la base del triángulo:");
        // 8. >> base 
        base = entrada.nextDouble();
     
        // Proceso
        // 9. area <- (base*altura)/2
        area = (base * altura)/ 2;
        
        //Salida 
        //10. << "el área del triángulo es: "+ area
        System.out.printf("el área del triángulo es: %.2f\n",area);
    }  // 11. fin
    
}
