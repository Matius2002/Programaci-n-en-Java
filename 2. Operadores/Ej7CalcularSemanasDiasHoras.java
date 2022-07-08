/*
Ejercicio 7: Construir un programa que, dado un numero total de horas, devuelva el numero de semanas, 
días y horas equivalentes. Por ejemplo, dado un total de 1000 horas debe mostrar 5 semanas, 6 días y 16 horas.
 */
package ej7calcularsemanasdiashoras;

import java.util.Scanner;

public class Ej7CalcularSemanasDiasHoras {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       //Declaramos las variables
       int semanas,dias,horas;
       
       //Pedimos las horas
        System.out.println("***Prgrama para calcular las semanas, dias y horas***");
        System.out.print("Digite el total de horas a calcular: ");
        horas = input.nextInt();
        
        //Calculo
        semanas = horas / 168;
        dias = horas%168 / 24;//Necesitamos el residuo de horas introducidas dividido en 1 semana y esto se divide entre un 1 dia.
        horas = horas%24;//Divicón de horas introduccidas a 24 horas que es un dia
        
        //Imprimimos el resultado
        System.out.println("Semanas: ["+semanas+"] Días: ["+dias+"] Horas: ["+horas+"]");
        
        
        
        
        
        
        
        
    }
    
}
