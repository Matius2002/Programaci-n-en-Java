//Paquete
package entraysalidadedatosporconsola;

//Librerias
import java.util.Scanner;//Lee datos


/* Nota: El método next guarda una cadena hasta llegar al primer espacio
El nextLine guarda una cadena completa*/
public class EntraYSalidaDeDatosPorConsola {

    public static void main(String[] args) {
       //Calse Scanner
       Scanner input = new Scanner(System.in);//in es input
       
       //Declaramos variables
       String nombre;
       byte edad;
       float altura;
       char sexo;
       
       //Pedimos los datos por consola
       System.out.print("Digite su edad: ");
       edad = input.nextByte();
       
       System.out.print("Digite su altura: ");
       altura = input.nextFloat();

       input.nextLine();
       
       System.out.print("Digite su nombre completo: ");
       nombre = input.nextLine();

       System.out.print("Digite su sexo con un caracter (M o F): ");
       sexo = input.next().charAt(0);

       //Imprimimos los datos por consola
       System.out.println("\nSu edad es: "+edad);
       System.out.println("Su altura es: "+altura);      
       System.out.println("Su nombre es: "+nombre); 
       System.out.println("El sexo es: "+sexo);
       
       
    }
    
}
