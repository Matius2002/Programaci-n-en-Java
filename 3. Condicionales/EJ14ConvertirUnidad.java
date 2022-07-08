/*
Ejercicio 14: Hacer un programa que pase KG a otra unidad de medida de masa, mostrar 
en pantalla un menú con las opciones posibles.
 */
package ej14convertirunidad;

import javax.swing.JOptionPane;

public class EJ14ConvertirUnidad {

    public static void main(String[] args) {
        float medida;
        int opcion;
        
        medida = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad en kilogramos:"));
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu\n"
                + "1. Hectagramos\n"
                + "2. Decagramos\n"
                + "3. Gramos\n"
                + "4. Decigramos\n"
                + "5. Centigramos\n"
                + "6. Miligramos\n"));
        
        switch(opcion){
            case 1:
                medida *= 10;
                JOptionPane.showMessageDialog(null,"La nueva medida en Hectogramos es: "+medida);
                break;
            case 2: 
                medida *= 100;
                JOptionPane.showMessageDialog(null,"La nueva medida en Decagramos es: "+medida);
                break;
            case 3: 
                medida *= 1000;
                JOptionPane.showMessageDialog(null,"La nueva medida en Gramos es: "+medida);
                break;
            case 4:
                medida *= 10000;
                JOptionPane.showMessageDialog(null,"La nueva medida en Decigramos es: "+medida);
                break;
            case 5:
                medida *= 100000;
                JOptionPane.showMessageDialog(null,"La nueva medida en Centigramos es: "+medida);
                break;
            case 6:
                medida *= 1000000;
                JOptionPane.showMessageDialog(null,"La nueva medida en Miligramos es: "+medida);
                break;
            default: 
                JOptionPane.showMessageDialog(null,"Error, opción incorrecta");
                break;
        }
        
        
            
    }
    
}
