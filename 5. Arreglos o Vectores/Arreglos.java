/*
Arreglos o Vectores
 */
package arreglos;

public class Arreglos {
//Nota : Existe 2 formas de llenar un arreglo N°1 o N°2
    public static void main(String[] args) {
        int[] numeros = {4,12,23};//N°2
      //int[] numeros = new int[3];
        
        /* N°1 LLenamos el arreglo de forma manual
        numeros[0] = 4;
        numeros[1] = 12;
        numeros[2] = 23;*/
        
        for(int i=0;i<3;i++){
            System.out.println(numeros[i]);
        }

    }

}
