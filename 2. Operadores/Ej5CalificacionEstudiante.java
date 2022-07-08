/*
Ejercicio 5: La calificacion final de un estudiante de informática se calcula con base a las calificaciones 
de cuatro aspectos de su rendimiento académico: participación, primer examen parcial, segundo examen parcial 
y examen final. Sabiendo que las calificaciones anteriores entran a la calificación final con ponderaciones 
del 10%, 25%, 25% y 40%, hacer un programa que calcule e imprima la calificación final obtenida por un estudiante.
 */
package ej5calificacionestudiante;

import java.util.Scanner;//Libreria o clase 

public class Ej5CalificacionEstudiante {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float participacion,primerParcial,segundoParcial,tercerParcial,notaFinal;
        
        //Pedimos las notas y las almacenamos
        System.out.print("Digite la nota de la participación: ");
        participacion = input.nextFloat();
        System.out.print("Digite la nota del primer parcial: ");
        primerParcial = input.nextFloat();
        System.out.print("Digite la nota del segundo parcial: ");
        segundoParcial = input.nextFloat();
        System.out.print("Digite la nota del tercero parcial: ");
        tercerParcial = input.nextFloat();
        
        //Calculamos la nota final con los porcentajes 
        notaFinal = (participacion * 0.10f) +(primerParcial * 0.25f) + (segundoParcial * 0.25f) + (tercerParcial * 0.40f);
        
        //Mostramos la nota final del estudiante
        System.out.println("\nLa nota final es: "+notaFinal);
        
        
    }
    
}
