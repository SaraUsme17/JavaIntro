/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej11;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class JavaIntroEj11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
        en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
        reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
        vocales acentuadas) se mantienen sin cambios.*/
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        System.out.println("la longitud es " + frase.length());
        
        String retorno = unir(frase);
        System.out.println("La frase es: " + retorno);
    }
    
    public static String unir(String frase){
        String fraseConvertida="";
        String letra = "";
        for (int i = 0; i < frase.length(); i++) {
            letra = frase.substring(i,i+1);
            switch(letra){
                case "a":
                    fraseConvertida = fraseConvertida.concat("@");
                    break;
                case "e":
                    fraseConvertida = fraseConvertida.concat("#");
                    break;
                case "i":
                    fraseConvertida = fraseConvertida.concat("$");
                    break;
                case "o":
                    fraseConvertida = fraseConvertida.concat("%");
                    break;
                case "u":
                    fraseConvertida = fraseConvertida.concat("*");
                    break;
                default:
                    fraseConvertida = fraseConvertida.concat(letra);
            } 
            
            
        }
        return fraseConvertida; 
        
        
    }
    
}
