/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Teclado=new Scanner(System.in);
        int n=0, suma=0 ;
        while(n!=9999){
            System.out.println("Ingresa el numero:");
            n=Teclado.nextInt();
            if(n!=9999){
                suma+=n;
            }
        }
        System.out.println("la suma es: "+suma );        
    }
    
}
