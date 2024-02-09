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
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*12. Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
        dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
        fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que
        ser X y el último tiene que ser una O.*/
        
        Scanner leer = new Scanner(System.in);
        String cadena;
        int correcto = 0;
        int incorrecto = 0;
        
        do {
            
        System.out.println("Ingrese una cadena");
        cadena = leer.next();
        if(cadena.length() == 5 && cadena.substring(0,1).equals("X") && cadena.substring(4,5).equals("O")){
            correcto ++;
        
        }else{
            incorrecto = incorrecto +1;
        }
            
        } while (!cadena.equals("&&&&&"));
        
        
        System.out.println("La cantidad de ingresos correctos es igual a " + correcto);
        System.out.println("La cantidad de ingresos incorrectos es igual a " + (incorrecto-1));
    }
    
}
