/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionSimple;

import Objetos.Individuo;
import java.util.Random;
import java.util.Arrays;  

/**
 *
 * @author Arguijo
 */
public class Muta {
        public static void muta(Individuo i){
        //Necesitamos una posición para poder modificar
        Random ran = new Random();
        int pos = ran.nextInt(i.getGenotipo().length);
        
        if(i.getGenotipo()[pos]==0){
            i.getGenotipo()[pos]=1;
        }else{
            i.getGenotipo()[pos]=0;
        }
        //Actualizar el fenotipo y el fitness
        i.actualizar();
        //System.out.println("Muta: "+Arrays.toString(i.getGenotipo()));
        //System.out.println("Muta fenotipo: "+i.getFenotipo());
    }

    static boolean evaluarMuta(double probMuta) {
        return Math.random()<=probMuta;
    }
    
}
