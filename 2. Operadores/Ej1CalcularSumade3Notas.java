/*
Ejercicio 1: Hacer un programa que calcule e imprima la suma de tres calificaciones.
*/
package ej1calcularsumade3notas;
//Librerias o Clases
import java.util.Scanner;

public class Ej1CalcularSumade3Notas {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       //Declaramos variables
       float num,num2,num3,suma;
       
       //Pedimos los notas y las guardamos en las varibles
        System.out.println("***Digite las 3 notas de Bases de Datos***");
        System.out.print("Digite la primera nota: ");
        num = input.nextFloat();
        System.out.print("Digite la primera nota: ");
        num2 = input.nextFloat();
        System.out.print("Digite la primera nota: ");
        num3 = input.nextFloat();
        
        //Suma de las notas
        suma = num + num2 + num3;
        
        
        //Imprimimos el resultado de las notas
        System.out.println("\nLa suma de las 3 notas es: "+suma);
        
        
    }
    
}
