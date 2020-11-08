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
public class Ejercicio3 {
    //1. Inicio
    public static void main(String[] args) {
        // declarando variables
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        //2. costoMinuto, d[0,n]
        double costoMinuto;
        //3. minutosConsumidos, d[0,n]
        double minutosConsumidos;
        //4. valorPagar, d[0,n]
        double valorPlanilla ;
        
        // Pido datos por teclado- entradas
        // 5. <<"Ingrese el costo por minuto"
        System.out.println("Ingrese el costo por minuto consumido");
        // 6. >>costoMinuto
        costoMinuto = entrada.nextDouble();
        // 7. <<"Ingrese los minutos consumidos al mes"
        System.out.println("Ingrese los minutos consumidos al mes");
        // 8. >>minutosConsumidos
        minutosConsumidos = entrada.nextDouble();
        
        // Proceso
        // 9. valorPagar <- costoMinutos * minutosConsumidos
        valorPlanilla = costoMinuto * minutosConsumidos;
        
        // Salida
        // 10. <<"El monto a pagar es "  + valorPagar 
        System.out.printf("El monto a pagar es: %.2f\n", valorPlanilla);
       
    } // 11. Fin
}
