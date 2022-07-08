//Operadores Aritmeticos
package operadoresaritmeticos;
//Librerias
import java.util.Scanner;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//Clase Scanner(leer datos)
        
        //Decalramos variables
        float numero1,numero2,suma,resta,multiplicacion,division,resto;
        
        //Pedimos 2 numero para utlizar los operadores arimeticos
        System.out.print("Digite 2 números: ");
        numero1 = input.nextFloat();
        numero2 = input.nextFloat();
        
        //Hacemos operaciones
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        division = numero1 / numero2;
        resto = numero1 % numero2;
        
        //Imprimimos el resultado por consola
        System.out.println("\nLa suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multiplicacion);
        System.out.println("La división es: "+division);
        System.out.println("El resto es: "+resto);
        
        
        
    }
    
}
