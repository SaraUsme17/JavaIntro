/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Extra21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
        adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
        desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por
        trabajos prácticos evaluativos y 2 por parciales.Primer trabajo práctico evaluativo 10%
        Segundo trabajo práctico evaluativo 15%
        Primer Integrador 25%
        Segundo integrador 50%
        Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
        programa los profesores necesitan obtener por pantalla la cantidad de aprobados y 
        desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
        igual al 7 de sus notas del curso.*/
        Scanner leer = new Scanner(System.in);
        int suma =0;
        int [][] matriz = new int[5][4];
        double [] vector = new double[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Alumno " + (i+1));
            for (int j = 0; j < 4; j++) {
                System.out.println("Ingrese la notas " + (j+1) + " del alumno "+ (i+1));
                matriz[i][j] = leer.nextInt();
            }
            
        }
        mostrar(matriz);
        calcular(matriz, vector);
        aprobados(vector);

    }
    
        public static void mostrar(int matriz[][]){
            System.out.println("La matriz ingresada es");
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println("");  
            }
        
    }
        
            public static void calcular(int matriz[][], double vector[]){
                double promedio=0;
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 4; j++) {
                        promedio = matriz[i][0]*0.1 + matriz[i][1]*0.15 + matriz[i][2]*0.25 + matriz[i][3]*0.5;

                }
                vector[i] = promedio;
                System.out.println(Arrays.toString(vector));
                
            }
        }   
            
            public static void aprobados(double vector[]){
                int contadorA =0;
                int contadorD =0;
                for (int i = 0; i < 5; i++) {
                    if(vector[i]>=7.0){
                    contadorA ++;
                    
                    }else{
                        contadorD ++;
                    
                    }
                }
            
                System.out.println("La cantidad de almunos aprobados es igual a " + contadorA);
                System.out.println("La cantidad de almunos desaprobados es igual a " + contadorD);
            }
}
 


