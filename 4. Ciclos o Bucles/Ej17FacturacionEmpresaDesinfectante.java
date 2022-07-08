/*
Ejercicio 17: Una empresa se dedidca a la venta de desinfectantes necesita un programa para gestionar las facturas. 
En cada factura figura: El código del artículo, la cantidad vendida en litros y el precio por litro. Se pide de 5 facturas 
introducidas: Facturación total, cantidad de litros vendidos del artículo 1 y cuantas facturas se emitieron de más de $600.
 */
package ej17facturacionempresadesinfectante;

import javax.swing.JOptionPane;

public class Ej17FacturacionEmpresaDesinfectante {

    public static void main(String[] args) {
        //Declaramos variables
        int codigo, litros, litrosArticulo1 = 0, conteoMas600 = 0;
        float precioLitro, importeFactura, facturacionTotal = 0;

        //Ciclo para pedir las 5 facturas
        for (int i = 1; i <= 5; i++) {
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Artículo N°" + i + "\nDigite el codig:"));
            litros = Integer.parseInt(JOptionPane.showInputDialog("Artículo N°" + i + "\nDigite la cantidad de litros:"));
            precioLitro = Float.parseFloat(JOptionPane.showInputDialog("Artículo N°" + i + "\nDigite el precio por litro:"));

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
        System.out.println("Facturación total:"+facturacionTotal);
        System.out.println("La cantidad de litros vendidos del artículo 1:"+litrosArticulo1);
        System.out.println("Cantidad de facturas mayor a $600:"+conteoMas600);
        
    }

}
