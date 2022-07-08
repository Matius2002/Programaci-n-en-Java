/*
Ejercicio 14: Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores a $1000.
 */
package ej14sueldossumamayoresa1000;

import javax.swing.JOptionPane;

public class Ej14SueldosSumaMayoresA1000 {

    public static void main(String[] args) {
        float sueldo, suma=0;
        int contador=0;
        
        System.out.println("Pedir 10 sueldos");
        for(int i=1;i<=10;i++){
            sueldo = Float.parseFloat(JOptionPane.showInputDialog("Digite el "+i+" sueldo:"));

            if(sueldo>1000){
                contador++;
            }
            
            suma += sueldo;//Suma iterativa
        }
        System.out.println("\nLa suma de todos los sueldos es: "+suma);
        System.out.println("Sueldos mayores a 1000: "+contador);
    }
    
}

        



