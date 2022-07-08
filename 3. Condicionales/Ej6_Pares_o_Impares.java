/*
Ejercicio 6: Hacer un programa que tome 2 números y diga si ambos son pares o impares
 */
package ej6_pares_o_impares;

import javax.swing.JOptionPane;

public class Ej6_Pares_o_Impares {

    public static void main(String[] args) {
       int num,num2;
       
       JOptionPane.showMessageDialog(null,"Programa para ver si ambos número son pares o impares");
       num = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer número: "));
       num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo número: "));
       
       if ((num%2== 0) && (num2%2== 0)) {
           JOptionPane.showMessageDialog(null,"Ambos números son pares");
           
       }else if((num%2==1) && (num2%2==1)){
           JOptionPane.showMessageDialog(null,"Ambos números son impares");
       }else{
           JOptionPane.showMessageDialog(null,"Los números son diferentes");
       }
    }

}
