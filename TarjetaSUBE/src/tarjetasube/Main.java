/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarjetasube;
import java.util.Scanner;

/**
 *
 * @author Andrés Martín Bottero
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner lr = new Scanner(System.in);
        
        Tarjeta SUBE0 = new Tarjeta();
        Tarjeta SUBE1 = new Tarjeta();
        Tarjeta SUBE2 = new Tarjeta();
        
        SUBE1.Propietario="Juan Perez";
        SUBE1.Saldo=1000;
        SUBE1.Descuento=true;
                
        SUBE2.Propietario="Pepe Argento";
        SUBE2.Saldo=500;
        SUBE2.Descuento=false;
        
        //MENU INCIAL
        int ROpcion;
        do{
            System.out.println("Solo hay dos usuarios registrados.\nIngrese con cual tarjeta desea utilizar.\n1)"
            + SUBE1.Propietario + "\n2)"+ SUBE2.Propietario);
            ROpcion= lr.nextInt();           
        }while(ROpcion==0 || ROpcion>2);
        
        switch(ROpcion){
            case 1: SUBE0.Propietario=SUBE1.Propietario;
                    SUBE0.Saldo=SUBE1.Saldo;
                    SUBE0.Descuento=SUBE1.Descuento; break;
            case 2: SUBE0.Propietario=SUBE2.Propietario;
                    SUBE0.Saldo=SUBE2.Saldo;
                    SUBE0.Descuento=SUBE2.Descuento; break;
        }
        //MENU PRINCIPAL
        do{
            System.out.print("BIENVENIDO AL PROGRAMA DE GESTION DE SU TARJETA SUBE\n"
                    + "1)Ver Saldo\n"
                    + "2)Leer Propietario\n"
                    + "3)Ver si tiene descuento\n"
                    + "4)Pagar Boleto\n"
                    + "5)Cargar Saldo\n"
                    + "6)Ver información completa de la Tarjeta\n"
                    + "0)Salir\nIngrese opción: ");
            ROpcion= lr.nextInt();
            System.out.println(" ");  
            
            switch (ROpcion){
                case 0: System.out.println("Gracias por su visita " + SUBE0.Propietario + "! Bye"); break;
                case 1: SUBE0.VerSaldo(); break;
                case 2: SUBE0.VerPropietario(); break;
                case 3: SUBE0.VerDescuento(); break;
                case 4: SUBE0.PagarBoleto(); break;
                case 5: SUBE0.CargarSaldo(); break;
                case 6: SUBE0.VerPropietario(); SUBE0.VerDescuento();SUBE0.VerSaldo(); break;
                
                default: System.out.println("No ingreso ninguna opción válida."); break;
                
            }
            
            System.out.println(" ");
        
        }while(ROpcion!=0);
        
    }
    
}
