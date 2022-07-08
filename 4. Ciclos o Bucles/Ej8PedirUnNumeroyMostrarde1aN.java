/*
Ejercicio 8: Pedir un número N, y mostrar todos los números del 1 al N.
 */
package ej8pedirunnumeroymostrarde1an;

import javax.swing.JOptionPane;

public class Ej8PedirUnNumeroyMostrarde1aN {

    public static void main(String[] args) {
      
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número:"));
        
        System.out.println("Números de 1 al "+numero);
        for(int i=1;i<=numero;i++){
            System.out.print(i+",");
            
        }
    }
    
}
