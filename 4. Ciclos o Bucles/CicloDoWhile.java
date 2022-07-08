/*
Ciclo While (Mientras)

while (condicion){
    instrucciones;
   
    }

Nota: Primero se ejecuta y despues evalua la condición
"Es bueno para los menus"
 */
package ciclodowhile;

import java.util.Scanner;

public class CicloDoWhile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1,contador;
        
        System.out.print("Digite la cantidad de terminos: ");
        contador = input.nextInt();
        
        System.out.println("");
        do {
            
            System.out.println(i);
            i++;
        } while (i<=contador);

    }

}
