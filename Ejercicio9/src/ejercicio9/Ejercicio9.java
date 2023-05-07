/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Teclado=new Scanner(System.in);
        
        int horasNormales, horasExtras,pagoNormales=0,pagoExtra=0,Total;
        String Nombre;
        
        System.out.println("Cunatas horas normales trabajo:");
        horasNormales=Teclado.nextInt();
        pagoNormales=horasNormales*80000;
        
        System.out.println("Cunatas horas extras trabajo: ");
        horasExtras=Teclado.nextInt();
        if(horasExtras<15){
            pagoExtra=horasExtras*120000;
        }
        else{
            pagoExtra=horasExtras*100000;
        }
        
        Total=pagoNormales+pagoExtra;        
        System.out.println("Ingrese el nombre del trabajador:");
        
        Nombre=Teclado.next();        
        System.out.println("El trabajador "+Nombre+" gana "+Total);
    }
    
}
