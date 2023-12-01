
package com.mycompany.p1tarea2_chuico_jimenez_risco;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivosCSV {
    public static void leerArchivoCSV() {
   final String DELIMITER = ",";

        try (BufferedReader br = new BufferedReader(new FileReader("DatosCliente.csv"))) {
            String line;
            // Lee la primera línea que contiene los encabezados
            line = br.readLine();
            System.out.println(line);

            // Lee el resto del archivo
            while ((line = br.readLine()) != null) {
                String[] datos = line.split(DELIMITER);
                // Puedes imprimir o manejar los datos según tus necesidades
                for (String dato : datos) {
                    System.out.print(dato + "\t");
                }
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("El archivo CSV aún no ha sido creado.");
        } 
}}
