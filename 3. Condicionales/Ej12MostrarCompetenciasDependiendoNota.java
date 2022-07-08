/*
Ejercicio 12: Pedir una nota de 0 a 10 y mostrala de la forma: Insuficiente, suficiente, 
bien, notable y sobresaliente.
 */
package ej12mostrarcompetenciasdependiendonota;

import java.util.Scanner;

public class Ej12MostrarCompetenciasDependiendoNota {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nota;
        
        System.out.println("***Programa para mostrar el rendimiento academico***");
        System.out.print("Digite la nota entre 0 a 10:");
        nota = input.nextInt();
        
        switch(nota){
            case 0:
            case 1:
            case 2:
            case 4:
                System.out.println("\nNota Insuficiente");
                break;
            case 5:
                System.out.println("\nNota Suficiente");
                break;
            case 6:
                System.out.println("\nNota Bien");
                break;
            case 7:
            case 8:
                System.out.println("\nNota Notable");
                break;
            case 9:
            case 10:
                System.out.println("\nNota Sobresaliente");
                break;
            default:
                System.out.println("\nError, nota fuera del rango");
                
        }
            
        }
    }
    

