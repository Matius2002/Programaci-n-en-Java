/*
Ejercicio 10: Pedir 10 números y escribir la suma total.
 */
package ej10pedir10numerosysumatotal;

import javax.swing.JOptionPane;

public class Ej10Pedir10NumerosySumaTotal {

    public static void main(String[] args) {
      int numero,suma=0;
        for(int i=1;i<=10;i++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite el número "+i+":"));
            suma += numero;//Suma iterativa
        }
        System.out.println("La suma es: "+suma);
    }
    
}
