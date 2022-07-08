/*
Ejercicio 18: Hacer unas modificaciones al ejercicio anterior suponiendo que no se introduce el precio por litro. 
Solo existen tres productos con precios. 
1 - 0,6 $/litro
2 - 3 $/litro
3 - 1,25 e/litro
 */
package ej18empresadesinfectante;

import javax.swing.JOptionPane;

public class Ej18EmpresaDesinfectante {

    public static void main(String[] args) {
        //Declaramos variables
        int codigo, litros, litrosArticulo1 = 0, conteoMas600 = 0;
        float precioLitro=0, importeFactura, facturacionTotal = 0;

        //Ciclo para pedir las 5 facturas
        for (int i = 1; i <= 5; i++) {
            
            do {
                codigo = Integer.parseInt(JOptionPane.showInputDialog("Artículo N°" + i + "\nDigite el codig:"));
            } while (codigo < 1 || codigo > 3);//El codigo tiene que estar entre 1 y 3

            litros = Integer.parseInt(JOptionPane.showInputDialog("Artículo N°" + i + "\nDigite la cantidad de litros:"));
            
            switch(codigo){
                case 1: precioLitro = 0.6f;
                    break;
                case 2: precioLitro = 3f;
                    break;
                case 3: precioLitro =1.25f;
                    break;
            }

            //La ganacias por factura
            importeFactura = (float) litros * precioLitro;
            //La suma de todas las facturas, es decir, facturación total
            facturacionTotal += importeFactura;

            if (codigo == 1) {//Litros vendidos del artículo 1
                litrosArticulo1 += litros;//Suma iterativa
            }

            if (importeFactura > 600) {
                conteoMas600++;
            }
        }
        System.out.println("Resumen de ventas");
        System.out.println("Facturación total:" + facturacionTotal);
        System.out.println("La cantidad de litros vendidos del artículo 1:" + litrosArticulo1);
        System.out.println("Cantidad de facturas mayor a $600:" + conteoMas600);
    }

}
