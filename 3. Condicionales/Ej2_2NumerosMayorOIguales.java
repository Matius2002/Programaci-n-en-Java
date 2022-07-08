/*
Ejercicio 2: Pedir dos números y decir cual es el mayor o si son iguales. 
 */
package ej2_2numerosmayoroiguales;

import javax.swing.JOptionPane;

public class Ej2_2NumerosMayorOIguales {

    public static void main(String[] args) {
        int num,num2;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer número: "));
        
        if(num > num2){
            JOptionPane.showMessageDialog(null, "El numero mayor o igual es: "+num);
        }
        else if(num2 > num){
            JOptionPane.showMessageDialog(null, "El numero mayor es: "+num2);
        }else{
            JOptionPane.showMessageDialog(null,"Ambos numeros son iguales");
        }
        
        
    }

}
