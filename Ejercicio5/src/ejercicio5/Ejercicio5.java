/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Teclado=new Scanner(System.in);
        int n ,factorial=1;
        for (int i = 0; i < 1; i++) {
            System.out.println("Ingresa el numero:");
            n=Teclado.nextInt();
            for (int j = 1; j <= n; j++) {
                factorial*=j;
            }
            System.out.println(""+factorial);
        }
        
        }
    }


