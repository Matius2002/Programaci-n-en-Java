/*
Ejercicio 5: Realizar un juego para adivinar un número. Para ello generar un número aleatorio entre 0-100
ir pidiendo números indicando "es mayor" o "es menor" según sea mayor o menor con respecto a N. El proceso 
termina cuando el usuario acierta y mostrar el números de intentos.
 */
package ej5_adivinarnumeroaleatorio;

import javax.swing.JOptionPane;

public class Ej5_AdivinarNumeroAleatorio {

    public static void main(String[] args) {
        int random = (int) (Math.random() * 100 + 0);//Generamos un número aleatorio entre 0 - 100
        int numero, contador = 0;//Variables para el número a digitar y el contador de los intentos

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite el número:"));
            if (numero > random) {//El número random es menor
                System.out.println("¡El número random es menor!");
            } else {//El número random es mayor
                System.out.println("¡El número random es mayor!");
            }
            contador++;//
        } while (numero != random);//El numero digitado tiene que ser diferente de random para volver a entrar
        
        System.out.println("\nFelicidades h  as ganado, el número random es:"+random+", en "+contador+" intentos");

    }

}
