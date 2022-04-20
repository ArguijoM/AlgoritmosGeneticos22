/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionSimple;

import Objetos.Individuo;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Arguijo
 */
public class Seleccion {
    public static Individuo seleccionTorneo(ArrayList<Individuo> poblacion){
        Individuo mejor = poblacion.get(0);
        for(Individuo i:poblacion){
            if(i.getFitness()>mejor.getFitness()){
                mejor = i;
            }
        }
        return new Individuo(mejor.getGenotipo());
    }
    
      public static Individuo seleccionAleatoria(ArrayList<Individuo> poblacion){
          Random ran = new Random();
          int pos = ran.nextInt(poblacion.size());
              
        return new Individuo(poblacion.get(pos).getGenotipo());
    }
}

