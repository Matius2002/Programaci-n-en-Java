/*
Ejercicio 3: Guillermo tiene N dólares, Luis tiene la mitad de lo que posee Guillermo. 
Juan tiene la mitad de lo que poseen Luis y Guillermo juntos. Hacer un programa que 
calcule e imprima la cantidad de dinero que tienen entre los tres.
 */
package ej3cantidaddinero;

import java.util.Scanner;

public class Ej3CantidadDinero {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     
     //Declaramos variables
     float guillermo, luis, juan, dineroTotal;
     
        //Pedimos datos
        System.out.print("Digite los dolares que tiene Guillermo: ");
        guillermo = input.nextFloat();
        
        //Calculo
        luis = guillermo / 2;
        juan = (guillermo + luis) / 2;
        dineroTotal = guillermo + luis + juan;
        
        //Imprimos el dinero total
        System.out.println("\nLa cantidad de dinero entre los 3 es: "+dineroTotal);
        
        
        
    }
    
}
