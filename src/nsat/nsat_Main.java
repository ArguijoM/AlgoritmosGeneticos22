/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsat;

import java.util.Arrays;

/**
 *
 * @author Alumno
 */
public class nsat_Main {
    public static void main(String[] args){ 
        Tokenizador.leerDatos();
        GeneticoNSAT gen = new GeneticoNSAT(1000000, 80, 0.3);
        gen.evolucionar();
        
        System.out.println();
    }
}
