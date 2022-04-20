/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionSimple;

import Objetos.Herramientas;
import Objetos.Individuo;
import java.util.ArrayList;

/**
 *
 * @author Arguijo
 */
public class GeneticoSimple {
    private int tamanoPoblacion;
    private int numGeneraciones;
    private double pobMuta;
    private ArrayList<Individuo> poblacion;

    public GeneticoSimple(int tamanoPoblacion, int numGeneraciones, double pobMuta) {
        this.tamanoPoblacion = tamanoPoblacion;
        this.numGeneraciones = numGeneraciones;
        this.pobMuta = pobMuta;
        this.poblacion = new ArrayList<>();
        generarPoblacionInicial();
    }
    
    public void evolucionar(){
        ArrayList<Individuo> pobAux;
        int[] mascara  = Herramientas.generarArreglo(24);
        // Someter a la población a un proceso evolutivo
        for(int g=0; g<this.numGeneraciones;g++){
            //Crear una población nueva
            pobAux = new ArrayList<>();
            for(int i=0;i<this.tamanoPoblacion;i++){
                //Muestreo y/o selección
                    //TORNEO
                Individuo madre = Seleccion.seleccionTorneo(this.poblacion);
                Individuo padre = Seleccion.seleccionAleatoria(this.poblacion);
                //Cruza
                Individuo hijo = Cruza.cruzaMascara(madre, padre, mascara);
                //Evaluar la posibilidad de muta
                if(Muta.evaluarMuta(this.pobMuta)){
                    Muta.muta(hijo);
                }
                //Agregar al hijo a la poblacion Auxiliar
                pobAux.add(hijo);
                
            }
            //Se tiene qye actualizar la población
            actualizarPoblacion(pobAux);
            Individuo mejor = Seleccion.seleccionTorneo(this.poblacion);
            System.out.println("g: "+" f: "+mejor.getFenotipo());//16,777215
        }
    }

    private void generarPoblacionInicial() {
        for(int x=0; x<this.tamanoPoblacion;x++){
            this.poblacion.add(new Individuo());
        }
    }

    private void actualizarPoblacion(ArrayList<Individuo> pobAux) {
        this.poblacion = new ArrayList<>();
        for(Individuo i:pobAux){
            this.poblacion.add(new Individuo(i.getGenotipo()));
        }
    }
    
    
}
