/*
Ejercicio 5: Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: 
-Si trabaja 40 horas o menos se le paga $16 por hora
-Si trabaja mas de 40 horas se le paga $16 por cada una de las primeras 40 horas y $20 por cada hora extra.
 */
package ej5salariosemanalobrero;

import javax.swing.JOptionPane;

public class Ej5SalarioSemanalObrero {

    public static void main(String[] args) {
        int horas,salarioSemanal;
        
        horas = Integer.parseInt(JOptionPane.showInputDialog("Digite las horas trabajadas: "));
        
        
        //Si es menor a 40 horas
        if(horas <= 40){
            salarioSemanal = horas * 16;//Salario normal
            JOptionPane.showMessageDialog(null,"El salario semanal del obrero es: "+salarioSemanal);
            
        }else{
            //Si es mayor a 40 horas
            salarioSemanal = (40 * 16) + ((horas -40)*20);//Salario normal + horas ex-tras
            JOptionPane.showMessageDialog(null,"El salario semanal del obrero es: "+salarioSemanal);
            
        }
        
    }

}
