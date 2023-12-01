package com.mycompany.p1tarea2_chuico_jimenez_risco;

import java.io.*;

public class ArchivoCSV_Clientes {
    public static void crearArchivoCSV(String delim, String... info) {
        final String NEXT_LINE = "\n";
        try {
            // Ruta relativa al directorio del proyecto
            String file = "DatosCliente.csv";
            FileWriter fw = new FileWriter(file, true);

            // Encabezado del archivo CSV
            fw.append("Nombre").append(delim+ "\n");
            fw.append("Apellido").append(delim);
            fw.append("Cedula").append(delim);
           /* fw.append("Orden").append(delim);
            fw.append("Tipo de Pago").append(delim);
            fw.append("Forma de Pago").append(NEXT_LINE);*/

            // Información del usuario
            for (String value : info) {
                fw.append(value).append(delim);
            }
            fw.append(NEXT_LINE);

            fw.flush();
            fw.close();
            System.out.println("Archivo CSV creado con éxito en: " + file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }  
}
