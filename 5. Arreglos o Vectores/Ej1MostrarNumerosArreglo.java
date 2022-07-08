/*
Ejercicio 1: Leer 5 números, guardarlos en un arreglo y mostrarlos en el mismo orden introduccido.
 */
package ej1mostrarnumerosarreglo;

import java.util.Scanner;

public class Ej1MostrarNumerosArreglo {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       float[] numeros = new float[5];
       
        System.out.println("Guardamos los números del arreglo");
       for(int i=0;i<5;i++){
           System.out.print((i+1)+". Digite un número:");
           numeros[i] = input.nextFloat();
       }
       
        System.out.println("\nMostramos los números del arreglo:");
        for(Float i:numeros){
            System.out.println(i);
        }
       

    }

}
