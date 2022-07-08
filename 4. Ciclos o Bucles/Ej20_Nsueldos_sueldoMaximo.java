/*
Ejercicio 20: Pedir un número N, introducir N sueldos, y mostrar el sueldo maximo.
 */
package ej20_nsueldos_sueldomaximo;

import javax.swing.JOptionPane;

public class Ej20_Nsueldos_sueldoMaximo {

    public static void main(String[] args) {
        int numero;
        float sueldo,sueldoMaximo=0;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número:"));
        for(int i=1;i<=numero;i++){
            sueldo = Float.parseFloat(JOptionPane.showInputDialog("Digite el sueldo "+i+":"));
            
            //120 560 241
            if(sueldo> sueldoMaximo){
                sueldoMaximo = sueldo;//Le asignamos el sueldo maximo a la variable
                
            }
        }
        
        System.out.println("El sueldo maximo es: "+sueldoMaximo);

    }

}
