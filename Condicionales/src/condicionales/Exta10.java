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
public class Exta10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Realice un programa para que el usuario adivine el resultado de una multiplicación entre
        dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
        si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
        al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
        utilizar la función Math.random() de Java.*/
        Scanner leer = new Scanner(System.in);
        int num1 = (int) (Math.random()*(10+1));
        int num2 = (int) (Math.random()*(10+1));
        System.out.println(num1);
        
        System.out.println(num2);
         int adivinar;
        
        int multiplicacion = num1*num2;
        System.out.println("Multiplicacion " + multiplicacion);
        
        do {
            System.out.println("Adivine el resultado de la multiplicación");
            adivinar = leer.nextInt();
            if(adivinar == multiplicacion){
                System.out.println("La respuesta es correcta");
            }else{
                System.out.println("La respuesta es incorrecta");
            }
        } while (adivinar !=multiplicacion);
        
        

    }
    
}
