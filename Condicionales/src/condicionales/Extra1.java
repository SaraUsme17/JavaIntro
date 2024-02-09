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
public class Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
        usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.*/
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los minutos");
        int minutos = leer.nextInt();
        
        int horas = minutos/60;
        int dias = horas/24;
        horas = horas % 24; /*El propósito de esta operación es asegurarse de que horas esté en el rango de 0 a 23. 
        Si la división de horas entre 24 produce un residuo mayor o igual a 24, se obtiene el residuo correcto reducido 
        dentro del rango válido de horas de 0 a 23.*/
        System.out.println("Los minutos ingresados equivalen a " + dias + " días " + " con " + horas + " horas" );              
    }
    
}
