/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;

import java.util.Arrays;

/**
 *
 * @author user
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*15. Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
        muestre por pantalla en orden descendente.*/
        
        int vector[] = new int[100];
        for (int i = 0; i <= 99; i++) {
            vector[i] = i;
            
        }
        
//        for (int i = 99; i >= 0; i--) {
//            System.out.print(vector[i] + ",");
//        }

        System.out.println(Arrays.toString(vector)); //MANERA DE IMPRIMIR UN VECTOR SIN USAR UN FOR
    }
    
}
