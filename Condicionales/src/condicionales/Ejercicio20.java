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
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
        suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
        permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
        El programa deberá comprobar que los números introducidos son correctos, es decir,
        están entre el 1 y el 9.*/
        
        Scanner leer = new Scanner(System.in);
        int [][] matriz = new int[3][3];
        int [] vectorSumaF = new int[3];
        int [] vectorSumaC = new int[3];
        int sumaDP;
        int sumaDA;
        boolean resultadoFilas;
        boolean resultadoColumnas;

        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int num;
                do {
                System.out.println("Ingrese un número del 1 al 9 para la posicion " + i + "" + j + " de la matriz");
                num = leer.nextInt();
                if(num<1 || num>9){
                    System.out.println("El número ingresado no está entre 1 y 9");
                
                }else{
                    matriz[i][j] = num;
                }
            } while (num<1 || num>9);
                
        }
                        
        }
        
        mostrar(matriz);
        SumaFilas(matriz, vectorSumaF);
        SumaColumnas(matriz, vectorSumaC);
        sumaDP =SumaDiagonalP(matriz);
        sumaDA =SumaDiagonalAux(matriz);
        resultadoFilas = filas(vectorSumaF);
        resultadoColumnas = columnas(vectorSumaC);
        
        if((resultadoFilas == true) && (resultadoColumnas == true) && (sumaDP == sumaDA)){
        System.out.println("La matriz es mágica");
    
    }else{
            System.out.println("La matriz no es mágica");
        }
        

    }
    
        public static void mostrar(int matriz[][]){
            System.out.println("La matriz ingresada es");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println("");  
            }
        
    }
        
        public static void SumaFilas(int matriz[][], int vectorSumaF[]){
            int sumaFilas=0;
            
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                sumaFilas = sumaFilas + matriz[i][j];   
                    
                }
            vectorSumaF[i] = sumaFilas;
            sumaFilas =0;
            }
            
            System.out.println("El vector con la suma de las filas es igual a");
            System.out.println(Arrays.toString(vectorSumaF));   
    
    }
            public static void SumaColumnas(int matriz[][], int vectorSumaC[]){
            int sumaColumnas=0;
            
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                sumaColumnas = sumaColumnas + matriz[j][i];   
                    
                }
            vectorSumaC[i] = sumaColumnas;
            sumaColumnas =0;
            }
            
            System.out.println("El vector con la suma de las columnas es igual a");
            System.out.println(Arrays.toString(vectorSumaC));   
    
    }
            
            public static int SumaDiagonalP(int matriz[][]){
            int sumaDiagonalP=0;
            
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if(i==j){
                        sumaDiagonalP = sumaDiagonalP + matriz[i][j];   
                    }  
                }
            }
            
            System.out.println("La suma de la diagonal principal es igual a " + sumaDiagonalP);
            return sumaDiagonalP;
    
    }
            
            public static int SumaDiagonalAux(int matriz[][]){
            int sumaDiagonalAux=0;
            
            for (int i = 0; i < 3; i++) {
                sumaDiagonalAux = sumaDiagonalAux + matriz[i][3-i-1];

            }
            
            System.out.println("La suma de la diagonal auxiliar es igual a " + sumaDiagonalAux);
            return sumaDiagonalAux;
    
    }
            
            public static boolean filas(int vectorSumaF[]){
            boolean filas = true;
 
            for (int i = 0; i < 3; i++) {
                int posicionInicial = vectorSumaF[0]; 
                
                if(vectorSumaF[i] != posicionInicial){
                    filas = false;
                
                }
            }    
            return filas;

   
}
            public static boolean columnas(int vectorSumaC[]){
            boolean columnas = true;
 
            for (int i = 0; i < 3; i++) {
                int posicionInicial = vectorSumaC[0]; 
                
                if(vectorSumaC[i] != posicionInicial){
                    columnas = false;
                
                }
            } 
            return columnas;
}
            
}
