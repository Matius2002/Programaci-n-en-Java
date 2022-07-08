/*
Ejercicio 21: Pedir 10 números, y mostrar al final si se ha introducido alguno negativo
 */
package ejpedir10numeros_negativo;

import javax.swing.JOptionPane;

public class EjPedir10Numeros_Negativo {

    public static void main(String[] args) {
        //Declaramos variables
        int numero;
        boolean negativos = false;
        
        //Ciclo para pedir los 10 números
        for (int i = 1; i <= 10; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("N°" + i + "\nDigite un número:"));

            if (numero < 0) {//Si el número digitado es menor a 0 es negativo y entra al condicional
                negativos = true;//Pasamos a la variable a verdadero
            }

        }
        
        //Si la varible es verdadero esto quiere decir que si al menos un negativo
        if(negativos == true){
            System.out.println("Existe al menos un número negativo");//Muestra el mensaje
        }else{//Caso contrario
            System.out.println("No existe ningún negativo");//Muestra el mensaje
        }
    }

   
}

