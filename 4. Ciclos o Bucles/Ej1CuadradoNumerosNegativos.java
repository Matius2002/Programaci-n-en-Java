/*
Ejercicio 1: Leer un número y mostrar su cuadrado, repetir su proceso hasta que se 
introduzca un número negativo.
 */
package ej1cuadradonumerosnegativos;

import java.nio.channels.SelectionKey;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ej1CuadradoNumerosNegativos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero, cuadrado;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número:"));
        
        while (numero >= 0){//Mientras sea 0 o positivo
            cuadrado = (int)Math.pow(numero, 2);//Sacar el cuadrodo del número
            JOptionPane.showMessageDialog(null,"El cuadrado es:"+cuadrado);//Imprimalo
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número:"));//Vuelva a preguntar el número, 
                                                                                        //Hasta que sea negativo sale del ciclo
        }
        
    }

}
