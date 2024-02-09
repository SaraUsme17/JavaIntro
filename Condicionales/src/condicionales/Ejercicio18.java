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
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
        traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se
        obtiene cambiando sus filas por columnas (o viceversa).*/
        
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int[][] matrizT = new int[4][4];
        llenar(matriz);
        mostrar(matriz);
        transpuesta(matrizT, matriz);
        mostrarT(matrizT);
        
        
        
    }
    
    public static void llenar(int[][] matriz){
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int)(Math.random()*99+1);
            }
            
        } 
    }
    
        public static void mostrar(int[][] matriz){
            
        System.out.println("La matriz orginial es");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                System.out.print(matriz[i][j] + "  ");

            }
            System.out.println("");
            
        } 
    }
        
    public static void transpuesta(int matrizT[][], int matriz[][]){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizT[j][i] = matriz[i][j];
            }
            
        } 
    
    
    }    
    
    public static void mostrarT(int[][] matrizT){
        System.out.println("");    
        System.out.println("La matriz transpuesta es");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                System.out.print(matrizT[i][j] + "  ");

            }
            System.out.println("");
            
        } 
    }
}
