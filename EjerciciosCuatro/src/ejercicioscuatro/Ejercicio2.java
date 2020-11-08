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
public class Ejercicio2 {
    // 1.Inicio
    public static void main(String[] args) {
        
        //  Declaro las varibles
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        //  2. hijo1, d[0,n]
        double gasto1;
        // 3. hijo2, d[0,n]
        double gasto2;
        // hijo3, d[0,n]
        double gasto3;
        // gastoTotal, d[0,n]
        double gastoTotal;
    
        //pido los datos por teclado- entradas
        //6. <<"Ingrese los gastos del primer hijo"
        System.out.println("Ingrese los gastos del hijo1:");
        // 7. >>hijo1
        gasto1 = entrada.nextDouble();
        //8. <<"Ingrese los gastos del segundo hijo"
        System.out.println("Ingrese los gastos del  hijo2:");
        //9. >>hijo2
        gasto2 = entrada.nextDouble();
        // 10. <<"Ingrese los gastos del tercer hijo"
        System.out.println("Ingrese los gastos del hijo3:");
        // 11. >>hijo3
        gasto3 = entrada.nextDouble();
        
        //proceso
        //12. gastoTotal <- hijo1 + hijo2 + hijo3
        gastoTotal = gasto1 + gasto2 + gasto3;
        // Salida
        //13. <<"El gasto total es " + gastoTotal
        System.out.printf("El gasto total es %.2f \n", gastoTotal);
       
    } // 14. Fin
}
