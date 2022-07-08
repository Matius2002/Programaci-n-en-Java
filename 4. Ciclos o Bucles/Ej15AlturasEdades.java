/*
Ejercicio 15: Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la cantidad 
alumnos mayores a 18 años, y la cantidad de alumnos que miden más de 1.75

Nota: Para sacar a media se necesita sacar la suma total y se divide por la cantidad de intervalos
 */
package ej15alturasedades;

import javax.swing.JOptionPane;

public class Ej15AlturasEdades {

    public static void main(String[] args) {
        int edad,sumaEdad=0,contadorMayor18=0,contadorMayor175=0;   
        float altura,sumaAltura=0,mediaEdad,mediaAltura;
        
        System.out.println("Programa para carlular la media de las edades y alturas, cuantos hay mayores a 18 años  y 1.75 cm");
        for(int i=1;i<=5;i++){
            edad = Integer.parseInt(JOptionPane.showInputDialog("Alumno "+i+"\nDigite la edad:"));
            altura = Float.parseFloat(JOptionPane.showInputDialog("Alumno "+i+"\nDigite la altura:"));
            
            sumaEdad += edad;//suma iterativa de edades
            sumaAltura += altura;//suma iterativa de alturas
            
            if(edad>18){//Si la edad es mayor a 18
               contadorMayor18++;
            }
            
            if(altura>1.75){//Si la altura es mayor a 1.75
                contadorMayor175++;
            }
            
        }
        
        mediaEdad = (float) sumaEdad/5;
        mediaAltura = (float) sumaAltura/5;
        
        System.out.println("\nLa edad promedio es: "+mediaEdad);
        System.out.println("La estatura promedio es: "+mediaAltura);
        System.out.println("Alumnos mayores a 18 años: "+contadorMayor18);
        System.out.println("Alumnos mayores a 1.75 cm: "+contadorMayor175);
        
        
    }

}
