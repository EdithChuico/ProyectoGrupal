package com.mycompany.p1tarea2_chuico_jimenez_risco;

import java.util.Scanner;
import java.io.*;

public class Restaurante {
       // String nombreUser;
    public int opcionUsuario;
    public Restaurante( int opcionUsuario) {
           this.opcionUsuario = opcionUsuario;
    }

    
    public void Acciones (){
        Scanner scanner= new Scanner(System.in);
        Cliente cliente = new Cliente("","","",1);
        Cajero cajero = new Cajero("","" ,"","","",1);
        do {
            System.out.print("============Usuario============= ");
            System.out.print("\nQue desea hacer?");
            System.out.print("\n1. Observar el menu de comida" + "\n2. Hacer la orden y pagar"+"\n3. Leer datos del cliente guardados en CSV"+"\n4. Salir del restaurante");
            System.out.println("\nEscoja una opcion: ");
            opcionUsuario = scanner.nextInt();
            while (opcionUsuario != 1 && opcionUsuario != 2 && opcionUsuario != 3 && opcionUsuario != 3) {
                System.out.println("Ingrese solo una opcion valida: ");
                opcionUsuario = scanner.nextInt();
            }
            switch (opcionUsuario){
                case 1:
                    cliente.verMenu();
                    break;
                case 2:
                    Cocinero cocinero = new Cocinero(1,1,1,1,"",1);
                    cocinero.tomarLaOrden();
                    cliente.PagarcrearInfoCSV();
                    cajero.Cobro();
                    Factura factura = new Factura();
                    factura.imprimir(cliente, cocinero, cajero);
                    break;
                case 3:
                    leerArchivoCSV();
                    break;
                case 4:
                    System.out.print("Saliendo ");
                    break;
                default:
            }
    }while (opcionUsuario != 4);
}
    private static void leerArchivoCSV() {
        LeerArchivosCSV.leerArchivoCSV();
    }
    public class Menu {
    public String leerTXT(String direccion){//direccion del archivo
        String texto = "";
        
        try {
            BufferedReader bf = new BufferedReader (new FileReader ("Menu.txt"));
            String linea;
            while ((linea = bf.readLine()) != null) {
                System.out.println(linea);
            }   
        }catch (IOException e){
            System.err.println("No se encontro el archivo");
        }
        return texto;
    }
}
    public  void guardarMenu (){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Menu.txt"))) {
            writer.write("Menu\n");
            writer.write("ENTRADAS\n");
            writer.write("0= Ninguno\n");
            writer.write("1 = Sopa de pollo ($ 1,50)\n");
            writer.write("2 = Sopa de verduras ($ 1,50)\n");
            writer.write("3 = Crema de brocoli ($ 2,50)\n");
            writer.write("SEGUNDO\n");
            writer.write("4 = Ninguna \n");
            writer.write("5 = Arroz con pollo ($ 1,50)\n");
            writer.write("6 = Carne apanada ($ 2,00)\n");
            writer.write("7 = Pollo apanado ($ 2,00)\n");
            writer.write("8 = Camaron apanado ($ 2,50)\n");
            writer.write("POSTRES Y BEBIDAS\n");
            writer.write("9 = Ninguna\n");
            writer.write("10 = Jugo de naranja ($ 0,50)\n");
            writer.write("11 = Jugo de limon ($ 0,50)\n");
            writer.write("12 = Coctel de frutas ($ 3,00)\n");
            writer.write("13 = Pinia colada ($ 5,00)\n");
            System.out.println("Datos guardados en el archivo.");
        } catch (IOException e) {
            e.printStackTrace();
        }  
    }
}
