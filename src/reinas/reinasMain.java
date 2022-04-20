/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reinas;

import java.util.Arrays;

/**
 *
 * @author Arguijo
 */
public class reinasMain {
     public static void main(String[] args){
         
        Individuo i = new Individuo(5);
        while(i.getFitness()!=0){
            i.actualizarIndividuo();
        }
         System.out.println(Arrays.toString(i.getGenotipo()));
         System.out.println(i.getFitness());
        
    }
    
}
