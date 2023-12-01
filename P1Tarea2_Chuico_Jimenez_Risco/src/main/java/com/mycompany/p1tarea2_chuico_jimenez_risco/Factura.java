
package com.mycompany.p1tarea2_chuico_jimenez_risco;
//Imports JSON
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import org.json.simple.JSONObject;
//
public class Factura extends P1Tarea2_Chuico_Jimenez_Risco {

    public void imprimir(Cliente cliente, Cocinero cocinero, Cajero cajero) {
    System.out.println("             Don Kamaron            ");
    System.out.println("====================================");
    System.out.println("Ciente: "+cliente.getNombreUser()+" "+cliente.getApellidoUser());
    System.out.println("Identificacion: "+cliente.getNumeroCedula());
    System.out.println("Forma de pago: "+cajero.getPago());
    System.out.println("====================================");
    System.out.println("Descripcion       Precio      Cantidad");
    System.out.println((cocinero.getMenu1())+"     1.50      1 ");
    System.out.println((cocinero.getMenu2())+"     2.50      1 ");
    System.out.println((cocinero.getMenu3())+"     0.50      1 ");
        System.out.println("====================================");
    System.out.println("Total= 4.50 USD");
    //Guardado en archivo.jsona
    JSONObject facturaJSON = new JSONObject();
        facturaJSON.put("Cliente", cliente.getNombreUser() + " " + cliente.getApellidoUser());
        facturaJSON.put("Identificacion", cliente.getNumeroCedula());
        facturaJSON.put("FormaPago", cajero.getPago());
        
    JSONObject productos = new JSONObject();
        productos.put(cocinero.getMenu1(), 1.50);
        productos.put(cocinero.getMenu2(), 2.50);
        productos.put(cocinero.getMenu3(), 0.50);
        
        facturaJSON.put("Productos", productos);
        facturaJSON.put("Total",4.50);
        
        String archivoFactura = "C:\\Users\\Personal\\OneDrive\\Escritorio\\Proyecto1\\Factura.json";
        try (FileWriter file = new FileWriter(archivoFactura)) {
            file.write(facturaJSON.toJSONString());
            System.out.println("Se ha guardado la factura en el archivo JSON correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
