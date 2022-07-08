//Operador de Incremento y Decremento
package operadorincrementodecremento;

public class OperadorIncrementoDecremento {

    public static void main(String[] args) {
       //Declaramos variables
       int numero = 10;
       int numero2 = 20;
       int x = 21, y;
       
       //Operador de incremento
       numero++;// numero += 1;
       
       //Opreador de decremento
       numero2--;//numero -= 1;
       
       //Operadores de incremento y decremento con asignación
       y = x++;//Primero asignamos y despues aumentamos - Sufijo
       //y = ++x;//Primero incrementamos y despues asignamos - Prefijo
       
       //Imprimimos el resultado por consola
        System.out.println("El número es: "+numero);
        System.out.println("El número es: "+numero2);
        System.out.println("**************************");
        System.out.println("El valor de Y es: "+y);
       // System.out.println("El valor de Y es: "+y);
        
    }
    
}
