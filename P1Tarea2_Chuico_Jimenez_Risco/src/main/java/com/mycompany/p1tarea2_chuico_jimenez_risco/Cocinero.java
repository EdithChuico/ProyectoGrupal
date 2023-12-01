package com.mycompany.p1tarea2_chuico_jimenez_risco;
import java.util.Scanner;
public class Cocinero extends Restaurante {
    Scanner scanner = new Scanner(System.in);
   public int entrada;
   public int segundo;
   public int postre;
   public int menuf;
   public String[] menu={"Ninguno","Sopa de pollo","Sopa de verduras","Crema de brocoli","Ninguna","Arroz con pollo","Carne apanada","Pollo apanado","Camaron apanado","Ninguna","Jugo de naranja","Jugo de limon","Coctel de frutas","Pinia colada"};//arreglo
   public String getMenu1(){
       return this.menu[entrada];
   }
   public String getMenu2(){
       return this.menu[segundo];
   }
   public String getMenu3(){
       return this.menu[postre];
   }

    public Cocinero(int entrada, int segundo, int postre, int menuf, String string, int opcionUsuario) {
        super(opcionUsuario);
        this.entrada = entrada;
        this.segundo = segundo;
        this.postre = postre;
        this.menuf = menuf;
    }
   
   public void tomarLaOrden(){
   do{ 
   
   System.out.print("   ===  Hola soy el chef del restaurant, aqui 1"
           + "tiene el menu del dia para que pueda ordenar lo que desee === \n");
   Menu a = new Menu ();
   System.out.print("**** Este archivo se imprime mediante txt ****");
     Cliente cliente = new Cliente("","","",1);
   cliente.verMenu();
   System.out.print("\nSeleccione la opcion que desee del menu de acuerdo al digito de cada uno\n");
   System.out.print("Desea algo de entrada? (Seleccione desde la opcion 0 hasta 3):\n");
   entrada = scanner.nextInt();
   while (entrada <0 || entrada>3){
      System.out.print("Opcion incorrecta, porfavor intente nuevamente: \n");
      entrada = scanner.nextInt();
   }
   System.out.print("Desea algo de segundo? (Seleccione desde la opcion 4 hasta 8):\n");
   segundo = scanner.nextInt();
   while (segundo <4 || segundo>8){
      System.out.print("Opcion incorrecta, porfavor intente nuevamente:\n ");
      segundo = scanner.nextInt();
   }
   System.out.print("Desea algo de postres o bebidas? (Seleccione desde la opcion 9 hasta 13):\n");
   postre = scanner.nextInt();
   while (postre <9 || postre>13){
      System.out.print("Opcion incorrecta, porfavor intente nuevamente: \n");
      postre = scanner.nextInt();
}
   System.out.println("Listo, su orden seria:\n" + "De entrada:" + menu[entrada] + "\nAcompaniado con: " + menu[segundo] + "\nY como postre o bebida: " + menu[postre]);
   System.out. println("Desea modificar la orden?\n" + "0: Si\n" + "1: No\n");
   menuf = scanner.nextInt();
   while (menuf <0 || menuf>1){
      System.out.print("Opcion incorrecta, porfavor intente nuevamente: \n");
      menuf = scanner.nextInt();
}
    }while(menuf!=1);
   System.out.print("Listo! En unos minutos su orden estara lista\n");
   }
    
}
