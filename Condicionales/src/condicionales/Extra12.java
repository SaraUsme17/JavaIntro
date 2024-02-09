/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;

/**
 *
 * @author user
 */
public class Extra12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-
        0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.*/
        int [][] matriz = new int [8][3];
        
        
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    String digitos = i + "-" + j + "-" + k;
                    String resultado = digitos.replace("3", "E");
                    System.out.println(resultado);
   
                    }
                    
                }
                
            }
            
        }
    }
    

