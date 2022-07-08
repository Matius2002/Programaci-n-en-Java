/*
Ejericicio 11: Diseñar un programa que muestre el producto de los 10 primeros números impares.
 */
package ej11productodelos10numerosimpares;

import javax.swing.JOptionPane;

public class Ej11Productodelos10NumerosImpares {

    public static void main(String[] args) {
        long producto=1;

        for (int i = 1; i <= 20; i+=2) {
            producto *= i;    
         
        }
        System.out.println("El producto es:" + producto);
    }
}
