/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author Arguijo
 */
public class Individuo {
    //Función fitness a trabajar es "2X"
    private int[] genotipo;
    private int fenotipo;
    private int fitness;
    
    //Constructor aleatorio
    public Individuo(){ 
        this.genotipo = Herramientas.generarArreglo(24);
        calcularFenotipo();
        calcularFitness();
    }

    //Creación aleatoria
    public Individuo(int[] genotipo) {
        this.genotipo = genotipo.clone();
        //Hacer los cálculos de fenotipos/fitness
        calcularFenotipo();
        calcularFitness();
    }
    
    

    /**
     * @return the genotipo
     */
    public int[] getGenotipo() {
        return genotipo;
    }

    /**
     * @return the fenotipo
     */
    public int getFenotipo() {
        return fenotipo;
    }

    /**
     * @return the fitness
     */
    public int getFitness() {
        return fitness;
    }

    private void calcularFenotipo() {
        int exp =0;
        int valDec=0;
          for (int i = this.genotipo.length - 1; i >= 0; i--) {
            if (this.genotipo[i] == 1) {
                valDec += (int) Math.pow((double) 2, (double) exp);
            }
            exp++;
        }
        this.fenotipo = valDec;
    }

    private void calcularFitness() {
        //La función fitness es "2x"
        this.fitness = 2*(this.fenotipo);
    }
    
    public void actualizar(){
        calcularFenotipo();
        calcularFitness();
    }


    
}
