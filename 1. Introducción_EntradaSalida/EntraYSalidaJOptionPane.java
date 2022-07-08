
package entraysalidajoptionpane;
//Librerias
import javax.swing.JOptionPane;//Entrada y salida de datos


/*Nota:El JOptionPane.showInputDialog devuelve un String
*/
public class EntraYSalidaJOptionPane {

    public static void main(String[] args) {
        
        //Declaración de variables
        String nombre;
        int edad;
        char sexo;
        float altura;
        
        //Pedimos datos por la ventana emergente
        nombre = JOptionPane.showInputDialog("Digite su nombre: ");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Digite su edad: "));
        sexo = JOptionPane.showInputDialog("Digite su sexo con (M / F): ").charAt(0);
        altura = Float.parseFloat(JOptionPane.showInputDialog("Digite su altura: "));
        
        //Imprimos por la ventana emergente
        JOptionPane.showMessageDialog(null, "******Datos******");
        JOptionPane.showMessageDialog(null, "Su nombre es: "+nombre);
        JOptionPane.showMessageDialog(null, "Su edad es: "+edad);
        JOptionPane.showMessageDialog(null, "Su sexo es: "+sexo);
        JOptionPane.showMessageDialog(null, "Su altura es: "+altura);
        
    }
    
}
