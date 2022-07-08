/*
Ejercicio 6: Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos.
 */
package ej6numeroshasta0ymuestrelasuma;

import javax.swing.JOptionPane;

public class Ej6NumerosHasta0yMuestreLaSuma {

    public static void main(String[] args) {
       int numero,suma=0;//Variables
       
       numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número:"));//Pedimos número
       
       do{ 
          numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número:"));//Volvermos a pedir número
          suma += numero;//Suma iterativa
          
       }while(numero != 0);//Si es 0 sale del ciclo
       
       JOptionPane.showMessageDialog(null,"La suma de todos los números son: "+suma);//Se muestra la suma
    }
    
}
