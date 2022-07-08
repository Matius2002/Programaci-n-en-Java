/*
Ejercicio 4: Una compañía de venta de carros usados, paga a su personal de ventas 
un salario de &1000 mensuales, mas una comisión de &150 por cada carro vendido, 
más el 5% del valor de la venta por carro. Cada mes el capturista de la empresa 
ingresa en la computadora los datos pertinentes. Hacer un programa 
que calcule e imprima el salario mensual de un vendedor dado.
 */
package ej4salariomensualvendedor;

import java.util.Scanner;

public class Ej4SalarioMensualVendedor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Declaramos variables
        final int salarioBase = 1000;
        float salarioMensual,ventaCarro;
        int carrosVendidos;
        
        //Pedimos datos
        System.out.print("Digite el numero de carros vendidos en el mes: ");
        carrosVendidos = input.nextInt();
        
        System.out.print("Digite el valor de la venta de cada carro: ");
        ventaCarro = input.nextFloat();
        
        //Calculo
        salarioMensual = salarioBase + (carrosVendidos * 150) + (0.05f * ventaCarro * carrosVendidos);
        
        System.out.println("\nEl salario del empleado es: "+salarioMensual);
        
        
        
        
        
        
    }
    
}
