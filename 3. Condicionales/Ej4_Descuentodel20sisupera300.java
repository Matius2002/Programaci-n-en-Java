/*
Ejercicio 4: En Exito se hace un 20% de descuento a los clientes cuya compra supere los $300. 
¿Cual sera la cantidad que pagará una persona por su compra? 
 */
package ej4_descuentodel20sisupera300;

import javax.swing.JOptionPane;

public class Ej4_Descuentodel20sisupera300 {

    public static void main(String[] args) {
        float compra,descuento;
        
        compra = Float.parseFloat(JOptionPane.showInputDialog("Digite el valor de la compra del usuario: "));
        
        
        
        if(compra > 300){
            descuento = (compra * 0.20f);
            compra -= descuento;
            JOptionPane.showMessageDialog(null,"Hay descuento!, su compra es de: "+compra);
        }
        else {
            JOptionPane.showMessageDialog(null,"Su compra es de: "+compra);
        }
        
        
        
    }
    
}
