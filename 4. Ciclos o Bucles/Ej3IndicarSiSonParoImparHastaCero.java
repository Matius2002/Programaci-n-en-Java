/*
Ejercicio 3: Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.
 */
package ej3indicarsisonparoimparhastacero;

import javax.swing.JOptionPane;

public class Ej3IndicarSiSonParoImparHastaCero {

    public static void main(String[] args) {
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número:"));

        while (numero != 0) {
            if (numero % 2 == 0) {
                JOptionPane.showMessageDialog(null, "El número " + numero + " es par");
            } else {
                JOptionPane.showMessageDialog(null, "El número " + numero + " es impar");
            }
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número:"));
        }

    }

}
