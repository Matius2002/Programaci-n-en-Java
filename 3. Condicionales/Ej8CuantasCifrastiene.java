/*
Ejercicio 8: Pedir un número entre 0 y 99,999 y decir cuantas cifras tiene 
 */
package ej8cuantascifrastiene;

import javax.swing.JOptionPane;

public class Ej8CuantasCifrastiene {

    public static void main(String[] args) {
      int numero;
      
      numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número entre 0-99,999: "));
      
      if((numero >= 0) && (numero <= 9)){
          JOptionPane.showMessageDialog(null,"El número es de 1 cifra");
      }else if((numero >= 10) && (numero <= 99)){
          JOptionPane.showMessageDialog(null,"El número es de 2 cifras");
      }else if((numero >= 100) && (numero <= 999)){
          JOptionPane.showMessageDialog(null,"El número es de 3 cifras");
      }else if((numero >= 1000) && (numero <= 9999)){
          JOptionPane.showMessageDialog(null,"El número es de 4 cifras");
      }else if((numero >= 10000) && (numero <= 99999)){
          JOptionPane.showMessageDialog(null,"El número es de 5 cifras");
      }
    }
    
}
