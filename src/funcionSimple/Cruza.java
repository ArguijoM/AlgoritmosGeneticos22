/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionSimple;

import Objetos.Individuo;
import java.util.Random;

/**
 *
 * @author Arguijo
 */
public class Cruza {
    
    // metodo de cruza en base a mascara, y retorna el mejor
    public static Individuo cruzaMascara (Individuo m, Individuo p, int[] mascara){
        int[] g1  = new int[m.getGenotipo().length];
        int[] g2  = new int[m.getGenotipo().length];
        // recorriendo la mascara
        for(int x=0; x<mascara.length;x++){
            // copias genotípicas en los genes de los hijos
            if(mascara[x]==1){
                g1[x]= m.getGenotipo()[x];
                g2[x]= p.getGenotipo()[x];
            } else{
                g1[x]= p.getGenotipo()[x];
                g2[x]= m.getGenotipo()[x];
            }
        }
        Individuo h1 = new Individuo(g1);
        Individuo h2 = new Individuo(g2);
        if(h1.getFitness()>h2.getFitness())return h1;
        
        return h2;
        
    }
    
    
}
