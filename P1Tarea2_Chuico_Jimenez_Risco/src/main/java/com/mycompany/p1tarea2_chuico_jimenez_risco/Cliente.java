package com.mycompany.p1tarea2_chuico_jimenez_risco;

import java.util.Scanner;
import java.io.*;

public class Cliente extends Restaurante {
    public String nombreUser;
    public String apellidoUser;
    public String numero_cedula;
    public String getNombreUser() {
        return this.nombreUser;
    }

    public String getApellidoUser() {
        return this.apellidoUser;
    }

    public String getNumeroCedula() {
        return this.numero_cedula;
    }

    public Cliente(String nombreUser, String apellidoUser, String numero_cedula,  int opcionUsuario) {
        super(opcionUsuario);
        this.nombreUser = nombreUser;
        this.apellidoUser = apellidoUser;
        this.numero_cedula = numero_cedula;

    }
      public void PagarcrearInfoCSV() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("=========== Creación de Info CSV ===========");
    System.out.print("Ingrese su nombre: ");
    nombreUser=scanner.nextLine();
    System.out.print("Ingrese su apellido: ");
    apellidoUser=scanner.nextLine();
    System.out.print("Ingrese su n de cedula: ");
    numero_cedula=scanner.nextLine();
    ArchivoCSV_Clientes.crearArchivoCSV("./", ",", nombreUser, apellidoUser, numero_cedula);
}
    
    public void verMenu (){
        System.out.print("**** Este archivo se imprime mediante txt ****");
        System.out.print("\n=======MENU========\n ");
        Menu a = new Menu();
        System.out.println(a.leerTXT( "Menu.txt"));
    }
}
