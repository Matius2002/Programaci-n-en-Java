/*
Ejercicio 4: Pedir números hasta que se teclee un negativo, y mostrar cuántos números se han introducido.
 */
package ej4pedirnumeroshastaunnegativo;

import javax.swing.JOptionPane;

public class Ej4PedirNumerosHastaUnNegativo {

    public static void main(String[] args) {
        int numero,contador=0;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número:"));
        
        while(numero>=0){
            contador++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número:"));
        }
        JOptionPane.showMessageDialog(null,"La cantidad de números negativos son: "+contador);
    }
    
}
