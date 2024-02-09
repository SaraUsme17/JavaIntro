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
public class Extra14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
        hijos. Escriba un programa que pida la cantidad de familias y para cada familia la
        cantidad de hijos para averiguar la media de edad de los hijos de todas las familias.*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de familias");
        int n = leer.nextInt();
        int suma = 0;
        int contador = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la cantidad de hijos para la familia "+ (i+1));
            int m = leer.nextInt();
            for (int j = 0; j < m; j++) {
                System.out.println("Ingrese la edad del hijo "+ (j+1));
                int edad = leer.nextInt();
                suma = suma + edad;
                contador++;
                
            }
            
        }
        double promedio = suma/contador;
        System.out.println("El promedio de las edades de todos los hijos de las familias es "+ promedio);
    }
    
}
