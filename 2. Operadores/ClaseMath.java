//Clase Math
//Math.metodo(parametros) Donde método sera uno de los siguientes y parámetros aquellos que tengamos que usar. Un método puede estar sobreescrito para distintos tipos de datos.
package clasemath;

public class ClaseMath {
//Nota: Yo puedo hacer la conversión que quiera. Ejemplo "int raiz = (int)Math.sqrt(9);
    
    public static void main(String[] args) {
        
        //Clase Math
        double numero1 = Math.abs(2);//Devuelve el valor absoluto de un número
        double numero2 = Math.acos(2);//Devuelve el arco coseno de un angulo en radianes
        double numero3 = Math.asin(2);//Devuelve el arco seno de un ángulo en radianes
        double numero4 = Math.atan(2);//Devuelve el arco tangente entre PI/2 y PI/2
        double numero5 = Math.atan2(3, 4);//Devuelve el arco tangente entre PI y PI
        double numero6 = Math.ceil(2);//Devuelve el entero mas cercano por arriba
        double numero7 = Math.floor(2);//Devuelve el entero mas cercano por debajo
        double numero8 = Math.round(2);//Devuelve el entero mas cercano 
        double numero9 = Math.cos(2);//Devuelve el coseno de un angulo
        double numero10 = Math.sin(2);//Devuelve el seno de un angulo
        double numero11 = Math.tan(2);//Devuelve la tangente de un angulo
        double numero12 = Math.exp(2);//Devuelve el exponencial de un número
        double numero13 = Math.log(2);//Devuelve el logaritmo natural  en base e de un número
        double numero14 = Math.max(2, 3);//Devuelve el mayor entre dos valores
        double numero15 = Math.min(3, 2);//Devuelve el menor entre dos valores
        double numero16 = Math.random();//Devuelve un número aleatorio entre 0 y 1. Se pueden cambiar el rango de generación.
        double numero17 = Math.sqrt(2);//Devuelve la raíz cuadrada de un número.
        double numero18 = Math.pow(3, 4);//Devuelve un número elevado a un exponente.
  
        //Imprimimos por pantalla
        System.out.println(numero1);
        
       
    }
    
}
