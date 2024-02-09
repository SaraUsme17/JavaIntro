/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosietesegmentos;

/**
 *
 * @author user
 */
public class EjercicioSieteSegmentos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            int movements = Solve(3,"123");
            System.out.println(movements);
     
    }     
    
    public static int Solve(int length, String N){
        
        
        int [][] matriz = {
            {1, 1, 1, 1, 1, 1, 0},
            {0, 1, 1, 0, 0, 0, 0},
            {1, 1, 0, 1, 1, 0, 1},
            {1, 1, 1, 1, 0, 0, 1},
            {0, 1, 1, 0, 0, 1, 1},
            {1, 0, 1, 1, 0, 1, 1},
            {0, 0, 1, 1, 1, 1, 1},
            {1, 1, 1, 0, 0, 0, 0},
            {1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 0, 0, 1, 1}};
    
        int [] switchStates = {0, 0, 0, 0, 0, 0, 0};
        int movements = 0;
        
        for (int i = 0; i < length; i++) {
//            char[] chars = N.toCharArray();
//            char digit = chars[i];
        char digitChar = N.charAt(i);
        int digit = Character.getNumericValue(digitChar);
        int [] toRepresent = matriz[digit];
        
            for (int j = 0; j < toRepresent.length; j++) {
                if(toRepresent[j] != switchStates[j]){
                    movements = movements +1;
                switchStates[j] = toRepresent[j];
                }
                
            }      
        }
                
        
        return movements;
    
    }
   
    
    
}
