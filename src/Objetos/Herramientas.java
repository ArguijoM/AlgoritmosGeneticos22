/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Arguijo
 */
public class Herramientas {
    //Arreglos con datos binarios
    public static int[] generarArreglo(int n){
        int [] aux = new int[n];
        Random r = new Random();
        for(int x=0; x<n; x++){
            //Rellenamos de forma aleatoria con '0' y '1'
            aux[x] = r.nextInt(2);
        }
        return aux;
    }
    
    public static int[] generarMascaraSinglePoint(int n, int p){
        int [] aux = new int[n];
        for(int x=0; x<p; x++){
            aux[x] = 1;
        }
        for(int x=p; x<n; x++){
            aux[x] = 0;
        }
        return aux;
    }
    public static int[] generarMascaraTwoPoint(int tam, int p1, int p2){
        int [] aux = new int[tam];
        for(int x=0; x<p1; x++){
            aux[x] = 0;
        }
        for(int x=p1; x<=p2; x++){
            aux[x] = 1;
        }
        for(int x=(p2+1); x<tam; x++){
            aux[x] = 0;
        }
        return aux;
    }
    public static int[] generarMascaraRandom(int n){
        int [] aux = new int[n];
        Random r = new Random();
        for(int x=0; x<n; x++){
            //Rellenamos de forma aleatoria con '0' y '1'
            aux[x] = r.nextInt(2);
        }
        return aux;
    }
    
    public static int[] generarRutaValida(int ci, int nc){
        int cont = 0;
        int num = (int)(Math.random()*nc);
        int [] aux = new int[nc];
        //Relleno mi matriz con 0
        for(int i=0; i< nc; i++){
            aux[i]=-1;           
        }
        //Comienzo con el relleno del arreglo
        aux[0] = ci;
        while(cont<nc-1){
            if(num!=ci){
                for(int j=1;j<nc;j++){
                    if(num==aux[j]){
                        num = (int)(Math.random()*nc);
                        break;
                    }else if(j==nc-1){
                        aux[cont+1]=num;
                        cont++;
                    }              
                }
            }
            else{
                num = (int)(Math.random()*nc);
            }
        }
        return aux;
    }
    
}
