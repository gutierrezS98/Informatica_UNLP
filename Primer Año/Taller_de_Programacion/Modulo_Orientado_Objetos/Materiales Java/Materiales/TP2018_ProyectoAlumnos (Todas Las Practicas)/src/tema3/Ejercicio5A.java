/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

import java.util.Scanner;

/**
 *
 * @author JuanC
 */
public class Ejercicio5A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        BalanzasV2 B=new BalanzasV2();
        B.iniciarCompra();
        System.out.print("Ingrese el peso: ");
        double pesoPorKilo=in.nextDouble();
        System.out.print("Ingrese descripcion: ");
        String descripcion=in.next();
        Producto P=new Producto();
        System.out.print("Ingrese precio: ");
        double precioPorKilo=in.nextDouble();
        while (pesoPorKilo!=0) {
            B.registrarProducto(P, precioPorKilo);
            System.out.println("Su monto a pagar hasta ahora: "+ B.devolverMontoAPagar());
            System.out.print("Ingrese el peso: ");
            pesoPorKilo=in.nextDouble();
            System.out.print("Ingrese la descripcion: ");
            descripcion=in.next();
            P=new Producto(pesoPorKilo,descripcion);
            System.out.print("Ingrese el precio: ");
            precioPorKilo=in.nextDouble();
        }
        System.out.println(B.devolverResumenDeCompra());
    }
    
}