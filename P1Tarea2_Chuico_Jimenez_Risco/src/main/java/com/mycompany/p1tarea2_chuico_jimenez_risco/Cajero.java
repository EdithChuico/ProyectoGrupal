package com.mycompany.p1tarea2_chuico_jimenez_risco;

import java.util.Scanner;

public class Cajero extends Cliente{
    public String TipodePago;
    public String FormadePago;
    public Cajero(String TipodePago, String FormadePago, String nombreUser, String apellidoUser, String numero_cedula, int opcionUsuario) {
        super(nombreUser, apellidoUser, numero_cedula, opcionUsuario);
        this.TipodePago = TipodePago;
        this.FormadePago = FormadePago;
    }
    public String getPago(){
        return FormadePago;
    }
    
    public void Cobro(){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("===================================");
         System.out.println("\nCajero: Como desea pagar? (Datos o Consumidor final)");
         TipodePago=scanner.nextLine().trim();
         while (!TipodePago.equalsIgnoreCase("Datos") && !TipodePago.equalsIgnoreCase("Consumidor Final")){
             System.out.print("Ingrese un mensaje valido (Datos o Consumidor final)");
             TipodePago=scanner.nextLine().trim();
         }
         if(TipodePago.equalsIgnoreCase("Datos")){
         }
         System.out.print("\nCajero: Indique porfavor la forma de pago (Tarjeta o En efectivo)");
         FormadePago=scanner.nextLine().trim();
         while (!FormadePago.equalsIgnoreCase("Tarjeta") && !FormadePago.equalsIgnoreCase("En efectivo")){
             System.out.print("Ingrese un mensaje valido (Tarjeta o En efectivo)");
             FormadePago=scanner.nextLine().trim();
         }
         if (FormadePago.equalsIgnoreCase("Tarjeta")) {
         System.out.println("\nCajero: Deme su tarjeta porfavor, para realizar el cobro ");
         System.out.println("\n Tarjeta entregado ");
         } else {
         System.out.println("\nCajero: Listo, ayudeme con el dinero porfavor para realizar el cobro ");
         System.out.println("\n Dinero entregado");
         
         System.out.println("\nCajero: Espere su factura por favor ");
         
    }
}
}
