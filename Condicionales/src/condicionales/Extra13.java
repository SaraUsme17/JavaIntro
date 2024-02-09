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
public class Extra13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Crear un programa que dibuje una escalera de números, donde cada línea de números
        comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
        usuario al comenzar.*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la altura de la escalera");
        int n = leer.nextInt();
        String cadena ="";
        
        for (int i = 1; i < n+1; i++) {
            cadena = cadena + Integer.toString(i);
            System.out.println(cadena);
            
        }
    }
    
}
