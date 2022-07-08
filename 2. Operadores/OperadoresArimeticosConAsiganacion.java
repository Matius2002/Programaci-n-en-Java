//Operadores Aritmeticos combinados con Asiganción
package operadoresaritmeticosconasiganacion;
//Librerias o Clases
import java.util.Scanner;

public class OperadoresArimeticosConAsiganacion {

    //Clase Main
    public static void main(String[] args) {
       //Declaramos variables
       int numero1 = 10;
       float numero2 = 10.2f ;
       short numero3 = 8;
       byte numero4 = 12;
       
       //Operadores con Asignación
       numero1 += 10;//numero1 = numero1 + 10;
       numero2 -= 2;//numero2 = numero2 - 2;
       numero3 *= 2;//numero3 = numero3 * 2;
       numero4 %= 2;//numero4 = numero4 % 2;
       
        //Muestra los resultados por pantalla
        System.out.println("El número es: "+numero1);
        System.out.println("El seundo número es: "+numero2);
        System.out.println("El tercer número es: "+numero3);
        System.out.println("El cuarto número es: "+numero4);
       
        
    }

}
