/*
Ejercicio 1: Hacer un programa que lea un número entero y muestre si el número es múltiplo de 10
 */
package multiplosde10;

import javax.swing.JOptionPane;

public class MultiplosDe10 {

    public static void main(String[] args) {
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        JOptionPane.showMessageDialog(null,(numero%10==0) ? "Es multiplo" : "No es multiplo");
    }
    
}
