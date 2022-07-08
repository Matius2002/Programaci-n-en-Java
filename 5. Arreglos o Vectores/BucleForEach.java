/*
Bucle for each: El bucle mejorado
 */
package bucleforeach;

public class BucleForEach {

    public static void main(String[] args) {
        String[] nombres = {"Auron","Biyin","Juan","Ari","Willy","Fargan"};
        
        //Ciclo mejorado (for each)
        for(String i:nombres){
            System.out.println("Nombres: "+i);
        }
        
        
        
        /*Ciclo o Bucle de la forma normal
        for(int i=0;i<nombres.length;i++){
            System.out.println(nombres[i]);
        }*/
    }

}
