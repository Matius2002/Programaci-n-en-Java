/*
Ciclo While

While (condicion){   
    Instrucciones;

    }   
 */
package ciclowhile;

import java.util.Scanner;

public class CicloWhile {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int i=1,contador;

        System.out.print("Digite la cantidad de números que quiere por pantalla:");
        contador = input.nextInt();
        
        System.out.println("");
        while (i<=contador){ //Mientra el 1 sea menor o igual al numero que se digito imprima el valor de i
            System.out.println(i);
            i+= 2;//Aumentamos el valor de i y se vuelve a repetir el ciclo hasta que no se cumpla
        }
    }
}
