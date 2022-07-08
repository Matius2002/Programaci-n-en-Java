/*
Ejercicio 8: Hacer un programa que  calcule y muestre por pantalla las raices de la ecuación 
de segundo grado de coeficientes reales (Ecuacion de segundo grado o cuadratica)
 */
package ej8_ecuacionsegundogrado;

import java.util.Scanner;

public class Ej8_EcuacionSegundoGrado {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       //Declaramos variables
       double a,b,c,resX,resY;
       
       //Pedimos los datos
        System.out.println("***Programa para calcular la Ecuación cuadratica***");
        System.out.print("Digite el valor de A: ");
        a = input.nextDouble();
        System.out.print("Digite el valor de B: ");
        b = input.nextDouble();
        System.out.print("Digite el valor de D: ");
        c = input.nextDouble();
        
        resX =
        resY = - b - Math.sqrt(Math.pow(b, 2)- (4*a*c)) / (2*a);
        
        //Mostramos la Ecuación cuadratica
        System.out.println("\nLa raiz1 es: "+resX);
        System.out.println("La raiz2 es: "+resY);
    }
    
}
