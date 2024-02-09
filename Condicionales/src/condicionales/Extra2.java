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
public class Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
        una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C,
        C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
        iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.*/
        

        int A=1;
        int B=2;
        int C=3;
        int D=4;
        int aux;
        
        System.out.println("Valores iniciales"); 
        System.out.println("A= " + A);
        System.out.println("B= " + B);
        System.out.println("C= " + C);
        System.out.println("D= " + D);
        
        aux =B;
        B = C;
        C = A;
        A = D;
        D = aux;
        
        System.out.println("Valores finales"); 
        System.out.println("A= " + A);
        System.out.println("B= " + B);
        System.out.println("C= " + C);
        System.out.println("D= " + D);
                

        
        
        
    }
    
}
