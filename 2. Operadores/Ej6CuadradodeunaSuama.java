/*
Ejercicio 6: Hacer un programa que calcule el cuadrado de una suma (a+b)^2 = a^2 + b^2 + 2*a*b
 */
package ej6cuadradodeunasuama;

import java.util.Scanner;

public class Ej6CuadradodeunaSuama {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       //Declaramos variables
       double a,b,cuadradoSuma;
       
       //Pedimos los valores
        System.out.println("***Programa para calcular el cuadrado de una suma***");
        System.out.print("Digite el valor de a: ");
        a = input.nextFloat();
        System.out.print("Digite el valor de a: ");
        b = input.nextFloat();
        
        //Calculo
        cuadradoSuma = Math.pow(a, 2) + Math.pow(b, 2) + (2 * a * b);
        
        System.out.println("\nEl resultado es: "+cuadradoSuma);
        
        
    }
    
}
