/*
Ejercicio 13: Pedir 10 números. Mostrar la media de los números positivos, la media de los números 
negativos y la cantidad de ceros.
 */
package ej13mediapositivosnegativosnceros;

import javax.swing.JOptionPane;

public class Ej13MediaPositivosNegativosNCeros {

    public static void main(String[] args) {
        int numero, contadorPos = 0,  sumaPos = 0, sumaNeg = 0, contadorNeg = 0,contadorCeros = 0;
        float mediaPos = 0, mediaNeg = 0;
        
        System.out.println("Digite 10 numeros enteros");
        for (int i = 1; i <= 10; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite el número " + i + ":"));
            if (numero > 0) {
                sumaPos += numero;
                contadorPos++;
                
            } else if (numero < 0) {
                sumaNeg += numero;
                contadorNeg++;
                
            } else {
                contadorCeros++;
            }

        }
        
        //Condición para los positivos
        if(contadorPos==0){
            System.out.println("No existe la media de los positivos porque no se introdujo ninguno.");
        }else{
             mediaPos = sumaPos / contadorPos;
             System.out.println("\nLa media de los números positivos es: " + mediaPos);
        }
        
        //Condición para los negativos
        if(contadorNeg==0){
            System.out.println("No existe la media de los negativos porque no se introdujo ninguno.");
        }else{
             mediaNeg = sumaNeg / contadorNeg;
             System.out.println("La media de los números negativos es: " + mediaNeg);
        }
        
        //Condición para los ceros
        if(contadorCeros==0){
            System.out.println("No se introdujo ningun cero.");
        }else{
            System.out.println("La cantidad de ceros es: " + contadorCeros);
        }
        
       
       
        
        
       
        
    }

}
