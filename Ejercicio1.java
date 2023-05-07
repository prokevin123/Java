/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Teclado=new Scanner(System.in);
        int n, suma=0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingresa el numero:");
            n=Teclado.nextInt();
            suma+=n;
        }
        System.out.println("el total es: "+suma);
    }
    
}
