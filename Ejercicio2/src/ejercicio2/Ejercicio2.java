/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.math.BigInteger;

/**
 *
 * @author kevin
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int suma=0;
        BigInteger producto=BigInteger.valueOf(1);
        for (int i = 20; i <= 400; i+=2) {
            suma+=i;
            producto = producto.multiply(BigInteger.valueOf(i));
            System.out.println(""+i);
        }
        System.out.println("El total es: "+suma);
        System.out.println("El producto es: " + producto);
    }
    
}