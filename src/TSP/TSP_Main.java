/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TSP;

import Objetos.Individuo;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Arguijo
 */
public class TSP_Main {
    public static void main(String[] args){ 
        Matriz.matrizDistancias = new double[][]{{0,34,6,12},{34,0,40,8},{6,40,0,7},{12,8,7,0}};
        Objeto aux = new Objeto(new int[]{3,1,2,0});
        Objeto aux2 = new Objeto(new int[]{1,0,2,3});
        Objeto aux3 = new Objeto(new int[]{0,3,2,1});
        System.out.println(aux.getFitness());
        System.out.println(aux2.getFitness());
        System.out.println(aux3.getFitness());

       
    }
    
}
