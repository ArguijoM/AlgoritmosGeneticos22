/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TSP;

import Objetos.Herramientas;

/**
 *
 * @author Arguijo
 */
public class Objeto {

    private int[] genotipo;
    private int fitness;

    //Ciudad inicial, número de ciudades
    public Objeto(int ci, int nc) {
        this.genotipo = Herramientas.generarRutaValida(ci, nc);
        calcularFitness();
    }
    
    public Objeto(int[] gen) {
        this.genotipo = gen;
        calcularFitness();
    }
    
   private void calcularFitness() {
      for(int i=0; i<this.genotipo.length-1; i++){
          this.fitness += Matriz.matrizDistancias[this.genotipo[i]][this.genotipo[i+1]];
      }
      this.fitness +=Matriz.matrizDistancias[this.genotipo[this.genotipo.length-1]][this.genotipo[0]];
    }

    public int[] getGenotipo() {
        return genotipo;
    }

    public int getFitness() {
        return fitness;
    }

   
   
}
