/*
Ejercicio 12: Pedir un número y calcular su factorial. N!= 1*2*3...*N
 */
package ej12factorialnumero;

import javax.swing.JOptionPane;

public class Ej12FactorialNumero {

    public static void main(String[] args) {
       int numero;
       long factorial=1;

       numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número:"));
       
       for(int i=1;i<=numero;i++){
           factorial *=i; 
           
       }
        System.out.println("El factorial es: "+factorial);
    }

}
