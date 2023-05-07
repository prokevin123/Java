/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Teclado=new Scanner(System.in);
        String nombre;
        int n1,n2,examen,promedio=0;
        int aprobados=0,reprobados=0;
        char continuar='s';
        while(continuar=='s' || continuar=='S'){
            System.out.println("Ingrese el nombre del aprendiz:");
            nombre=Teclado.next();
            System.out.println("Ingrese la nota 1 del estudiante "+nombre);
            n1=Teclado.nextInt();
            System.out.println("Ingrese la nota 2 del estudiante "+nombre);
            n2=Teclado.nextInt();
            System.out.println("Ingrese la nota del examen del estudiante "+nombre);
            examen=Teclado.nextInt();
            promedio=(n1+n2+examen)/3;
            System.out.println("El promedio del estudiante es: "+promedio);
            if (promedio>=60) {
                System.out.println("El estudiante "+nombre+" Aprobo con "+promedio);
                
                aprobados++;
            } else{
                System.out.println("El estudiante "+nombre+" Reprobo con: " +promedio);
                reprobados++;
            }
            System.out.println("¿Desea ingresar los datos de otro aprendiz? (S/N):");
            continuar=Teclado.next().charAt(0);
        }
        System.out.println("El número de aprendices que aprobaron fue: "+aprobados);
        System.out.println("El número de aprendices que reprobaron fue: "+reprobados);
    }
    
}
