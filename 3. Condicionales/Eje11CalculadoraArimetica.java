/*
Ejercicio 11: Construir un programa que simule el funcionamiento de una calculadora que pueda 
realizar las cuatro operaciones aritméticas basicas (suma,resta,multiplicación,división) con
valores numéricos enteros. El usuario debe especificar la operación con el primer carácter del primer parámetro
de la línea de comandos: S o s para la suma, R o r para la resta, P,p M o m para el producto y D o d para la división.
*/
package eje11.calculadoraarimetica;

import javax.swing.JOptionPane;

public class Eje11CalculadoraArimetica {

    public static void main(String[] args) {
        int num,num2,suma,resta,multi,divi;
        char operacion;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer número: "));
        
        operacion = JOptionPane.showInputDialog("Digite la operación que desea realizar: ").charAt(0);
        
        //Evaluamos la variable "operación" que es la letra que digito el usuario.
        switch(operacion){//Si digito la letra s o S entra a este condicional
            case 's':
            case 'S':
                suma = num + num2;
                JOptionPane.showMessageDialog(null,"La suma es: "+suma);
                break;
            case 'r'://Si digito la letra r o R entra a este condicional
            case 'R':
                resta = num - num2;
                JOptionPane.showMessageDialog(null,"La resta es: "+resta);
                break;
            case 'p'://Si digito la letra p, P, m o M entra a este condicional
            case 'P':
            case 'm':
            case 'M':
                multi = num * num2;
                JOptionPane.showMessageDialog(null,"La multiplicación es: "+multi);
                break;
            case 'd'://Si digito la letra d o D entra a este condicional
            case 'D':
                divi = num / num2;
                JOptionPane.showMessageDialog(null,"La división es: "+divi);
                break;
            default: JOptionPane.showMessageDialog(null,"Error, se equivoco de operación");//Caso por si ejercuta una letra que no es.
        }
        
    }
    
}
