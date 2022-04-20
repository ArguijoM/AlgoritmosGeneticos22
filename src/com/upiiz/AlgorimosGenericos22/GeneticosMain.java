/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upiiz.AlgorimosGenericos22;

import Objetos.Herramientas;
import Objetos.Individuo;
import funcionSimple.Cruza;
import funcionSimple.GeneticoSimple;
import funcionSimple.Muta;
import funcionSimple.Seleccion;
import java.util.ArrayList;
import java.util.Arrays;  
import nsat.GeneticoNSAT;
import nsat.Tokenizador;

/**
 *
 * @author Arguijo
 */
public class GeneticosMain {
    public static void main(String[] args){
       Tokenizador.leerDatos();

        GeneticoNSAT gen = new GeneticoNSAT(1000000, 90, 0.50);
        gen.evolucionar();
        
        System.out.println();
        
    }
}
