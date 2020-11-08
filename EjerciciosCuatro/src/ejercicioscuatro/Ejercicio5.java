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
public class Ejercicio5 {
    // 1. Inicio
    public static void main(String[] args) {
        // Declaro las variables
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // 2.  montoPrestamo, d[0,n]
        double montoPrestamo;
        // 3.  interesMensual, d[0,n]
        double interesMensual;

        // 4. totalMensual, d[0,n]
        double totalMensual;
        
        // Pido los datos por teclado- entradas
        // 5. << "Ingrese el monto del prestamo"
        System.out.println("Ingrese el monto del prestamo");
        // 6. >> montoPrestamo
        montoPrestamo = entrada.nextDouble();
        //7. << "Ingrese el interes mensual a cobrar"
        System.out.println("Ingrese el interes mensual a cobrar");
        // 8. >> interesMensual
        interesMensual = entrada.nextDouble();
        // Proceso
        //9. montoMensual <-- montoPestamo/12+ interesMensual
      totalMensual = montoPrestamo/12+interesMensual;
      
       
       // Salidas
       //10. << "El valor mensual a pagar es: " + totalMensual
        System.out.printf("El valor mensual a pagar es: %.2f\n", totalMensual);

    } //11 Fin
    
}
