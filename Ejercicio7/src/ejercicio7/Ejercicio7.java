/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Teclado=new Scanner(System.in);
        System.out.println("Ingrese el numero de dia:");
        int num=Teclado.nextInt();
        if(num==1){
            System.out.println("Dia lunes");
        }
        else if(num==2){
            System.out.println("Dia Martes");
        }
        else if(num==3){
            System.out.println("Dia Miercoles");
        }
        else if(num==4){
            System.out.println("Dia Jueves");
        }
        else if(num==5){
            System.out.println("Dia Viernes");
        }
        else if(num==6){
            System.out.println("Dia Sabado");
        }
        else if(num==7){
            System.out.println("Dia Domingo");
        }
        else{
            System.out.println("Dia No exixte");
        }
        
    }
    
}
