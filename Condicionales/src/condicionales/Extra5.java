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
public class Extra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Una obra social tiene tres clases de socios:
        o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
        todos los tipos de tratamientos.
        o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento
        para los mismos tratamientos que los socios del tipo A.
        o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
        tratamientos.
        o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
        real que represente el costo del tratamiento (previo al descuento)*/
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una opción: A, B ó C");
        String letra = leer.next();
        letra = letra.toUpperCase();
        int tratamiento;
        int descuento;
        int valor;
        
        switch(letra){
            case "A":
            System.out.println("Ingrese el valor del tratamiento");
            tratamiento = leer.nextInt();
            descuento = (tratamiento*50)/100;
            valor = tratamiento - descuento; 
            System.out.println("El valor total a pagar después del descuento es $" + valor);
            break;
        case "B":
            System.out.println("Ingrese el valor del tratamiento");
            tratamiento = leer.nextInt();
            descuento = (tratamiento*35)/100;
            valor = tratamiento - descuento; 
            System.out.println("El valor total a pagar después del descuento es $" + valor);
            break;
        case "C":
            System.out.println("Ingrese el valor del tratamiento");
            tratamiento = leer.nextInt();
            System.out.println("El valor a pagar es $" + tratamiento + " porque este tipo de socio no recibe descuentos ");
            break;
        default:
            System.out.println("Opción inválida");
        }
                    
    }
    
}
