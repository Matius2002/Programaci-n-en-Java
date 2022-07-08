/*
Ejercicio 9: Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. 
Suponiendo que todos los meses son de 30 días. 
 */
package eje9_fechacorrecta;

import javax.swing.JOptionPane;

public class Eje9_FechaCorrecta {

    public static void main(String[] args) {
        int dia, mes, año;

        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el día: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes: "));
        año = Integer.parseInt(JOptionPane.showInputDialog("Digite el año: "));

        //Día vale 1 hasta 30 
        if ((dia >= 1) && (dia <= 30)) {
            if((mes>=1) && (mes<=12)){
                if(año != 0){
                    JOptionPane.showMessageDialog(null,"Fecha correcta");
                }else{
                    JOptionPane.showMessageDialog(null,"Fecha incorrecta, año incorrecta");
                }
            }else {
                JOptionPane.showMessageDialog(null, "Fecha incorrecta, mes incorrecto");
            }  
        } else {
            JOptionPane.showMessageDialog(null, "Fecha incorrecta, día incorrecto");

        }

    }
}
