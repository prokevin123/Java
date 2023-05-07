/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;
import java.lang.Integer;
/**
 *
 * @author kevin
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Teclado=new Scanner(System.in);
        float sumaPares=0, Pares = 0, n ,sumaImpares=0, Impares=0;
        float  mediaAritmetica = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el numero:");
            n=Teclado.nextInt();
            
            if(n%2==0){
            sumaPares+=n;
            Pares++;
        } 
        else {

            Impares++;
            sumaImpares+=n;            
        }
            mediaAritmetica=sumaImpares/Impares;
        }        
        System.out.println("La suma de los pares es: "+sumaPares );
        System.out.println("La cantidad de pares es: "+Pares);
        System.out.println("La media aritmetica es:"+mediaAritmetica);        
    }
    
}
