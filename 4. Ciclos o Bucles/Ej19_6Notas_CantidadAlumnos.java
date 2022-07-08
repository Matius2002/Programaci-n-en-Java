/*
Ejericicio 19: Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.
 */
package ej19_6notas_cantidadalumnos;

import javax.swing.JOptionPane;

public class Ej19_6Notas_CantidadAlumnos {

    public static void main(String[] args) {
        int aprobados=0,condicionados=0,suspensos=0;
        float nota;
        
        for(int i=1;i<=6;i++){
            do{
                nota = Float.parseFloat(JOptionPane.showInputDialog("Alumno "+i+"\nDigite la nota:"));
            }while(nota<0 || nota>10);//Nota debe estar entre 0 y 5
            
            
            if(nota == 4){
                condicionados++;
            }else if(nota>=5){
                aprobados++;
            }else{
                suspensos++;
            }
        }
        
        System.out.println("La cantidad de alumnos aprobados es: "+aprobados);
        System.out.println("La cantidad de alumnos condicionados es:"+condicionados);
        System.out.println("La cantidad de alumnos suspensos es: "+suspensos);
        
        
    }

}
