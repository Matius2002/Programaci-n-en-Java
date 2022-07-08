/*
Ejercicio 7: Pedir 3 números y mostrarlos ordenados de mayor a menor.
 */
package ej7mayoramenor;

import javax.swing.JOptionPane;

public class Ej7MayoraMenor {

    public static void main(String[] args) {
        int num, num2, num3;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo número: "));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite el tercer número: "));

        //Condicion para el primer número
        if ((num > num2) && (num2 > num3)) {
            JOptionPane.showMessageDialog(null, "Orden: [" + num + "] [" + num2 + "] [" + num3 + "]");
        } else if ((num > num3) && (num3 > num2)) {
            JOptionPane.showMessageDialog(null, "Orden: [" + num + "] [" + num3 + "] [" + num2 + "]");
        } else if ((num2 > num) && (num > num3)) {                                                      //Condicion para el segundo número
            JOptionPane.showMessageDialog(null, "Orden: [" + num2 + "] [" + num + "] [" + num3 + "]");
        } else if ((num2 > num3) && (num3 > num)) {
            JOptionPane.showMessageDialog(null, "Orden: [" + num2 + "] [" + num3 + "] [" + num + "]");
        } else if ((num3 > num) && (num > num2)) {                                                      //Condicion para el tercer número
            JOptionPane.showMessageDialog(null, "Orden: [" + num3 + "] [" + num + "] [" + num2 + "]");
        } else if ((num3 > num2) && (num2 > num)) {
            JOptionPane.showMessageDialog(null, "Orden: [" + num3 + "] [" + num2 + "] [" + num + "]");
        }

    }

}
