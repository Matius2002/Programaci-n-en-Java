/*
Ejercicio 3: Leer 5 números por teclado, almacenarlos en un arreglo y acontinuación realizar la media de los números 
positivos,la media de los negativos y contar el número de los ceros. 

Nota: Variables para sacar la media = conteo=0 + suma=0 + media;
int conteo=0
Float suma=0,media;
 */
package ej3medposnegceros;

import java.util.Scanner;

public class Ej3MedPosNegCeros {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      float[] numeros = new float[5];
      float sumaPositivos=0,sumaNegativos=0,promedioPositivos,promedioNegativos;
      int contadorPositivos=0,contadorNegativos=0,contadorCeros=0;
      
        System.out.println("Guardamos los números en el arreglo");
      for(int i=0;i<5;i++){
          System.out.print((i+1)+". Digite un número:");
          numeros[i] = input.nextFloat();
          
          if(numeros[i] == 0){
              contadorCeros++;
          }else if(numeros[i] > 0){
              sumaPositivos += numeros[i];
              contadorPositivos++;
          }else if(numeros[i] < 0){
              sumaNegativos += numeros[i];
              contadorNegativos++;
          }
      }
      
        System.out.println("\nMostramos el promedio de los números");
      //Condición para los positivos
      if(contadorPositivos == 0){
          System.out.println("Error, no se pudo sacar el promedio de los positivos");
      }else{
          promedioPositivos = sumaPositivos / contadorPositivos;
          System.out.println("El promedio de los postivos es: "+promedioPositivos);
      }
      
      //Condición para los negativos
      if(contadorNegativos == 0){
          System.out.println("Error, no se pudo sacar el promedio de los negativos");
      }else{
          promedioNegativos = sumaNegativos / contadorNegativos;
          System.out.println("El promedio de los postivos es: "+promedioNegativos);
      }
      
        System.out.println("La cantidad de ceros es: "+contadorCeros);
      
    }
}
