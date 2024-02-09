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
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*14. Crea una aplicación que a través de una función nos convierta una cantidad de euros
        introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
        función tendrá como parámetros, la cantidad de euros y la moneda a converir que será    
        una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
        (void).*/
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros que deseas convertir");
        int euros = leer.nextInt();
        System.out.println("Ingrese a que moneda desea convertir los euros ingresados: DOLARES, YENES O LIBRAS");
        String moneda = leer.next();
        cambioMoneda(euros,moneda);

    }
    
    
            
    public static void cambioMoneda(int euros,String moneda ){
        if(moneda.equals("DOLARES")){
            double cambio = euros * 1.28611;
            System.out.println(euros + " euros son equivalente a " + cambio + " $");
        }
        
        if(moneda.equals("LIBRAS")){
            double cambio = euros* 0.86;
            System.out.println(euros + " euros son equivalente a " + cambio + " libras");
 
        }
        
        if(moneda.equals("YENES")){
            double cambio = euros *129.852;
            System.out.println(euros + " euros son equivalente a " + cambio + " yenes");
        
        }
        
        
    }
}
