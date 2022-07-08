/*
Ejercicio 16: Pide un número (que debe estar entre 0 y 12) y mostrar la tabla de multiplicar de
dicho número.
 */
package ej16tablasdemultiplicar;

import javax.swing.JOptionPane;

public class Ej16TablasDeMultiplicar {

    public static void main(String[] args) {
     int numero;

     do{
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número entre 0 y 12:"));
     }while(numero<0 || numero>12);//Mientras el numero este entre 0 y 12 sale del ciclo
        
        System.out.println("La tabla de multiplicar del "+numero+" es: ");
        
        
        for(int i=1;i<=12;i++){//Ciclo para mostrar la multiplicación
            System.out.println(numero+" * "+i+" = "+numero*i);// Numero * Iteración = producto
                
        }
        
    
    }
    
}
