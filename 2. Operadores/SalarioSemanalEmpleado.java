/*
Ejercicio 2: Hacer un programa que calcule e imrpima el salario semanal de un empleado 
a partir de sus horas semanales trabajadas y de su salario por hora.
 */
package salariosemanalempleado;

import java.util.Scanner;

public class SalarioSemanalEmpleado {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Declaramos variables
        final float SalarioHora = 4.500f;
        float SalarioSemanal;
        int HorasTrabajadas;
        
        //Ingresamos las horas trabajadas
        System.out.print("Digite las horas trabajadas en la empresa: ");
        HorasTrabajadas = input.nextInt();
        
        //Operacion
        SalarioSemanal = HorasTrabajadas * SalarioHora;
        
        //Imprimimos el salario semanal del trabajador
        System.out.println("\nEl salario semanal es: "+SalarioSemanal);
        
        
        
        
        
    }
    
}
