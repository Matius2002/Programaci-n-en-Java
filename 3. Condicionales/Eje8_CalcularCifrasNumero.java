/*
Ejercicio 8: Pedir un numero entre 0 y 99999 y decir cuantas cifras tiene.
 */
package eje8_calcularcifrasnumero;

import javax.swing.JOptionPane;//Libreria

public class Eje8_CalcularCifrasNumero {

    public static void main(String[] args) { //Metodo principal Main
        int numero;//Dato de tipo entero
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entre 0 y 99999: ")); //Se pide el numero entre 0 a 99999
        
       if(numero < 10){ //Condición donde evalua cuantos digitos contiene el numero.
           JOptionPane.showMessageDialog(null, "Es de un digito. ");
       }else if(numero < 100){
           JOptionPane.showMessageDialog(null, "Es de dos digitos. ");
       }else if(numero < 1000){
           JOptionPane.showMessageDialog(null, "Es de tres digitos. ");
       }else if(numero <10000){
           JOptionPane.showMessageDialog(null, "Es de cuatro digitos. ");
       }else if(numero < 100000){
           JOptionPane.showMessageDialog(null, "Es de cinco digitos. ");
       }else{
           JOptionPane.showMessageDialog(null, "Es numero no esta en el rango. ");
       }
    }
    
}
