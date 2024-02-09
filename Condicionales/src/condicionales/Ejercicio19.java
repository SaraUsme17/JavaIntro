/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que
        una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada
        de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
        denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).*/
        

        int[][] matriz = new int[3][3];
        int[][] matrizT = new int[3][3];
        boolean resultado;
        
        llenar(matriz);
        mostrar(matriz);
        transpuesta(matrizT, matriz);
        mostrarT(matrizT);
        resultado =comparar(matriz,matrizT);
        
        if(resultado==true){
            System.out.println("La matriz es antisimétrica"); 
        }else{
            System.out.println("La matriz no es antisimétrica"); 
        }  
        
    }
    
    public static void llenar(int[][] matriz){
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                Scanner leer = new Scanner(System.in);
                System.out.println("Ingrese un número del 1 al 9 para la posicion " + i + "" + j + " de la matriz");
                int num = leer.nextInt();
                matriz[i][j] = num;

            }
            
        } 
    }
    
        public static void mostrar(int[][] matriz){
            
        System.out.println("La matriz orginial es");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(matriz[i][j] + "  ");

            }
            System.out.println("");
            
        } 
    }
        
    public static void transpuesta(int matrizT[][], int matriz[][]){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizT[j][i] = matriz[i][j];
            }
            
        } 
    
    
    }    
    
    public static void mostrarT(int[][] matrizT){
        System.out.println("");    
        System.out.println("La matriz transpuesta es");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(matrizT[i][j] + "  ");

            }
            System.out.println("");
            
        } 
    }
    
        public static boolean comparar(int[][] matriz, int[][] matrizT){
            boolean comparacion = false;
            
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if(matriz[i][j] == -1*matrizT[i][j]){
                       comparacion = true;
                    
                    }
            }          
        } 
        return comparacion;
    }
}


