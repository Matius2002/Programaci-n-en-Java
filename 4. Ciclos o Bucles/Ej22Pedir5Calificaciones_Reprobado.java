/*
Ejericicio 22: Pedir 5 calificaciones de alumnos y decir al final si hay algún reprobado.
 */
package ej22pedir5calificaciones_reprobado;

import javax.swing.JOptionPane;

public class Ej22Pedir5Calificaciones_Reprobado {

    public static void main(String[] args) {
        float notas;
        boolean reprobado = false;
        
        for(int i=1;i<=5;i++){
            do{
            notas = Float.parseFloat(JOptionPane.showInputDialog("Alumno N°"+i+"\nDigite la nota:"));
            }while(notas<0 || notas>5);
            if(notas<3){
                reprobado = true;
            }
            
        }
        
        if(reprobado == true){
            System.out.println("Existe algún reprobado");
        }else{
            System.out.println("No hay ningún reprobado");
        }
    }

}
