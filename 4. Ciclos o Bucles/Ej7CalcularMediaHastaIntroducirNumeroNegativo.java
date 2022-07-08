/*
Ejercicio 7: Pedir números hasta que se introdusca uno negativo, y calcular la media.
 */
package ej7calcularmediahastaintroducirnumeronegativo;

import javax.swing.JOptionPane;

public class Ej7CalcularMediaHastaIntroducirNumeroNegativo {

    public static void main(String[] args) {
        int numero, suma = 0, contador = 0;
        float media;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número:"));

        while (numero >= 0) {//Si es negativo sale del ciclo
            suma += numero;//Suma iterativa
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número:"));
            contador++;
        }

        if (contador == 0) {
            System.out.println("Error, la divición entre 0 no existe");
        } else {
            media = suma / contador;
            JOptionPane.showMessageDialog(null, "La media es: " + media);
        }

    }
}
