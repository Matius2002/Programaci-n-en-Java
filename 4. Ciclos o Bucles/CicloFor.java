/*
Ciclo For
    
    for(variable de inicialización; condición; aumento o decremento){
        Instrucciones;

    }

 */
package ciclofor;

import java.util.Scanner;

public class CicloFor {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contador;
        
        System.out.print("Digite la cantidad de terminos: "); //19
        contador = teclado.nextInt();

        for (int i = 1; i <= contador; i+= 5) { // 1 <= 34 
            System.out.println(i);//Pasa a las instrucciones, es decir, a imprimir la varible
        }

    }

}
