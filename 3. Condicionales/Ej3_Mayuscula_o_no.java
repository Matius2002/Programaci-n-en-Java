/*
Ejercicio 3: Hacer un programa que lea un carácter por teclado y compruebe si es una letra mayúscula 
 */
package ej3_mayuscula_o_no;

import javax.swing.JOptionPane;

public class Ej3_Mayuscula_o_no {
/*Nota: Character es una clase y isUpperCase es un método que determina si esta en 
mayuscula la letra*/
    
    public static void main(String[] args) {
       char letra;
       
       letra = JOptionPane.showInputDialog("Digite un letra: ").charAt(0);
       
       if(Character.isUpperCase(letra)){
           JOptionPane.showMessageDialog(null,"Es mayuscula la letra");
       }else{
           JOptionPane.showMessageDialog(null,"Es minuscula la letra");
       }
        
    }
    
}
