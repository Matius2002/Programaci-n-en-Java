/* La sentencia if:

    if(condicion){
        Instruccion1;
    
    }else{
        Instruccion2;
    }
 */
package sentencia_if_else;

import javax.swing.JOptionPane;//Se importa la clase o librería

public class Sentencia_If_Else {

    public static void main(String[] args) {
        int numero, dato = 5;
        
        /*
        == : Igualdad
        != : Diferencia
        > : Mayor
        >= : Mayor o Igual
        < : Menor
        <= : Menor o Igual
        */
        
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        if(numero <= dato){
            JOptionPane.showMessageDialog(null,"El número es menor o 5");
        }
        else{
            JOptionPane.showMessageDialog(null,"El número es mayor a 5");
        }
                
        
    }
    
}
