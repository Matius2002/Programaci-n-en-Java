/*
Ejercicio 2: Leer un número e indicar si es positivo o negativo. El proceso se repetirá 
hasta que se introduzca un 0.
 */
package ej2numerospositivosnegativoshastacero;

import javax.swing.JOptionPane;

public class Ej2NumerosPositivosNegativosHastaCero {

    public static void main(String[] args) {
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número:"));
        
        while(numero != 0){
            if(numero>0){
                JOptionPane.showMessageDialog(null,"El número "+numero+" es positivo");
            }else{ 
                JOptionPane.showMessageDialog(null,"El número "+numero+" es negativo");
            }
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número:"));
        }

    }

}
