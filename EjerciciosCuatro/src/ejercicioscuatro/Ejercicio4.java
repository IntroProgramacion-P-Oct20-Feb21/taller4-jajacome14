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

public class Ejercicio4 {
    // 1. Inicio
    public static void main(String[] args) {
        
         // Declaro variables
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // 2. costoTeclado, d[0,n]
        double costoTeclado;
        // 3. costoCpu, d[0,n]
        double costoCpu;
        //4. costoPantalla, d[0,n]
        double costoPantalla;
        // 5. costoRaton, d[0,n]
        double costoRaton;
        //6. costoTotal, d[0,n]
        double costoTotal;
        
        // Pido los datos por teclado - entradas
        // 7. <<"Ingrese el costo del teclado"
        System.out.println("Ingrese el costo del teclado:");
        //8. >> costoTeclado
        costoTeclado =entrada.nextDouble();
        // 9. <<"Ingrese costo del CPU"
        System.out.println("Ingrese el costo del CPU;");
        // 10.  >> costoCpu
        costoCpu = entrada.nextDouble();
        // 11. << "Ingrese el costo de la pantalla"
        System.out.println("Ingrese el costo de la pantalla:");
        // 12. >> costoPantalla
        costoPantalla = entrada.nextDouble();
        // 13. << "Ingrese el costo del ratón"
        System.out.println("Ingrese el costo del ratón:");
        // 14. >> costoRaton
        costoRaton = entrada.nextDouble();
        
        //Proceso
        // costoTotal <-- costoTeclado + costoCpu + costoPantalla + costoRaton
        costoTotal = costoTeclado + costoCpu + costoPantalla + costoRaton;
        
        // Salida
        // 16. << "El costo total a pagar por la computadora es: " + costoTotal
        System.out.printf("El costo total a pagar por la computadora es:%.2f\n",
                costoTotal);
    } // 17. Fin
}
