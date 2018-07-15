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
public class Tarjeta {
    
    Scanner lr = new Scanner(System.in);
        
    String Propietario;
    int Saldo;
    boolean Descuento;
    int Pasajeros;
    int Boleto;
    int Carga;
    
    public void CargarSaldo(){
        System.out.println("¿Cúanto desea cargar?: ");
        Carga = lr.nextInt();
        Saldo=Saldo+Carga;
        System.out.println("Usted a cargado: $"+ Carga + "\nSu saldo actual es: $" + Saldo);
        
    }
    
    public void PagarBoleto(){
        Boleto=10;
        System.out.println("¿Cúantos boletos desea pagar?: ");
        Pasajeros = lr.nextInt();
        
        if(Descuento==true){
            Boleto=Boleto-((Boleto*30)/100);
            
        }
        
        if(Boleto*Pasajeros>Saldo){
            System.out.println("Ud. No tiene saldo suficiente");
        }else{
            Saldo=Saldo-(Boleto*Pasajeros);
            if(Descuento==true){
                System.out.println("Se le aplica un descuento del 30%");
            }
            System.out.println("Ud. ha pagado " + Pasajeros + " boletos descontandosele $" + (Boleto*Pasajeros) + ".\nSaldo actual: $" + Saldo);
        }
    }
    
    public void VerSaldo(){
        System.out.println("El saldo de su tarjeta SUBE es: $" + Saldo);
    }
    
    public void VerDescuento(){
        if(Descuento==true){
            System.out.println("Ud. tiene un 30% de descuento en su tarjeta SUBE.");
        }else{
            System.out.println("Ud. NO tiene ningún descuento habilitado.");        
        }
    }
    
    public void VerPropietario(){
        System.out.println("Propietario de la tarjeta SUBE: "+Propietario);
    }
    
    
}
