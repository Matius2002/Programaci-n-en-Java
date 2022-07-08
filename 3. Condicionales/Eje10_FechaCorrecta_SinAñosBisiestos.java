/*
Ejercicio 10: Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. 
Con meses de 28, 30 y 31 días. Sin años bisiestos.
El mes de febrero tiene hasta un maximo de 28 dias 

 */
package eje10_fechacorrecta_sinañosbisiestos;

import javax.swing.JOptionPane;

public class Eje10_FechaCorrecta_SinAñosBisiestos {

    /*
    Nota: Operadores logicos
    && AND ambos tiene que cumplirse
    || OR Basta que tan solo 1 para que sea verdadera la expresión
        
     */
    public static void main(String[] args) {
        int dia, mes, año;

        dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el día: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el mes: "));
        año = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el año: "));

        if (año == 0) {//Si el usuario digita 0 en el año
            JOptionPane.showMessageDialog(null, "Fecha incorrecta, año incorrecto");
        } else if ((mes == 2) && (dia >= 1 && dia <= 28)) {//Solo febrero puede tener 28 dias en año bisiesto
            JOptionPane.showMessageDialog(null, "Fecha correcta");
        } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia>=1 && dia<=30)) { //Solo estos mesese pueden tener 30 días
            JOptionPane.showMessageDialog(null, "Fecha correcta");
        }else if((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia>=1 && dia<=31)){
            JOptionPane.showMessageDialog(null,"Fecha correcta");
        }else{
            JOptionPane.showMessageDialog(null,"Fecha incorrecta");
        }
    }

}
