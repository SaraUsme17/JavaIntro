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
public class Extra16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
        las personas ingresadas por teclado e indique si son mayores o menores de edad.
        Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
        mostrando personas y frenar cuando el usuario ingrese la palabra “No”.*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas");
        int n = leer.nextInt();
        boolean respuesta;

        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese su nombre");
            String nombre = leer.next();
            System.out.println("Ingrese su edad");
            int edad = leer.nextInt();
            respuesta = mayores(nombre,edad);
            if(respuesta){
                System.out.println("La persona es mayor de edad"); 
            }else{
                System.out.println("La persona es menor de edad");
            
            }
            System.out.println("Quiere seguir mostrando personas");
            String sino = leer.next();
            sino = sino.toUpperCase();
            if(sino.equals("SI")){
                continue;
            }if(sino.equals("NO")){
                break;     
            }else{
                System.out.println("Opción inválida");
            }
        }
    }
    
    public static boolean mayores(String nombre, int edad){
        System.out.println("El nombre de la persona ingresada es "+ nombre);
        System.out.println("La edad de la persona ingresada es "+ edad);
        boolean mayorMenor = false;
       
        if(edad>18){
            mayorMenor = true;
        }
        
        return mayorMenor;
    
    }
}
