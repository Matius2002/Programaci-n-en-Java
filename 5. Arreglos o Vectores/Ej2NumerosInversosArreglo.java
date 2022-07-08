/*
Ejercicio 2: Leer 5 números, guardarlos en un arreglo y mostrarlos en orden inverso al introducido
 */
package ej2numerosinversosarreglo;

import java.util.Scanner;//Librería Scanner

public class Ej2NumerosInversosArreglo {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      float[] numeros = new float[5];
      
        System.out.println("Guardamos los números en el arreglo");
        for(int i=0;i<5;i++){
            System.out.print((i+1)+". Digite un número:");
            numeros[i] = input.nextFloat();
        }
        
        System.out.println("\nMostramos los números del arreglo");
        for(int i=4;i>=0;i--){
            System.out.println(numeros[i]);
        }
    }

}
