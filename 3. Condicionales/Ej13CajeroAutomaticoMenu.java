/*
Ejercicio 13: Hacer un programa que simule un cajero automático con un saldo inicial 
de 1000 Dólares, con el siguiente menú de opciones:
1. Ingresar dinero a la cuenta 
2. Retirar dinero de la cuenta
3. Salir
 */
package ej13cajeroautomaticomenu;

import javax.swing.JOptionPane;

public class Ej13CajeroAutomaticoMenu {

    public static void main(String[] args) {
        final float saldo_inicial = 1000;
        int opcion;
        float retiro, ingreso, saldoActual;

        opcion = Integer.parseInt(JOptionPane.showInputDialog("***Bienvevido al cajero automático***\n"
                + "Digite la opción a realizar (1,2,3)\n"
                + "1. Ingresar dinero a la cuenta\n"
                + "2. Retirar dinero de la cuenta\n"
                + "3. Salir"));

        switch (opcion) {
            case 1:
                ingreso = Float.parseFloat(JOptionPane.showInputDialog("Digite el dinero a ingresar a la cuenta"));
                saldoActual = saldo_inicial + ingreso;
                JOptionPane.showMessageDialog(null, "Su saldo es: " + saldoActual);
                break;
            case 2:
                retiro = Float.parseFloat(JOptionPane.showInputDialog("Digite el dinero a retirar:"));
                if (retiro > saldo_inicial) {
                    JOptionPane.showMessageDialog(null, "Error, retiro mayor al saldo de la cuenta");
                } else {
                    saldoActual = saldo_inicial - retiro;
                    JOptionPane.showMessageDialog(null, "Su saldo es: " + saldoActual);
                }
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Salida con exito");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Error, se equivoco de opción");
                break;
        }

    }
}
