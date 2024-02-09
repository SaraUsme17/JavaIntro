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
public class Extra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Leer la altura de N personas y determinar el promedio de estaturas que se encuentran
        por debajo de 1.60 mts. y el promedio de estaturas en general.*/
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas");
        int n = leer.nextInt();
        double contador = 0.0;
        double contadormenos = 0.0;
        int n1=0;

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la altura en metros - Persona "+ (i+1));
            double altura = leer.nextDouble();
            contador = contador + altura; 
            if(altura<1.60){
                contadormenos = contadormenos + altura; 
                n1 = n1+1;
            }
            
            }
        double promedioGeneral = contador/n;
        double promedioMenor = contadormenos/n1;
        System.out.println("El promedio de las estaturas que se encuentrann por debajo de 1.60 mts es igual a "+ promedioMenor);
        System.out.println("El promedio general es igual a "+ promedioGeneral);   
        }
        
}
