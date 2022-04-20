/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TSP;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author Arguijo
 */
public class Matriz {
    public static double matrizDistancias [][];
     public static void cargarDistancias()  {
        FileReader archivos = null;
        try {
            String cadena;
            JFileChooser file = new JFileChooser();
            file.showOpenDialog(file);
            //abrimos el archivo seleccionado
            File abre = file.getSelectedFile();
            archivos = new FileReader(abre);
            BufferedReader lee = new BufferedReader(archivos);
            ArrayList<ArrayList<Double>> Matriz = new ArrayList();
            if (abre != null) {
                int i=0;
                
                
                
                while ((cadena = lee.readLine()) != null) {
                    String[] datos = cadena.split(",");
                    
                    ArrayList<Double> c = new ArrayList();
                    for (int j = 0; j < datos.length; j++) {
                        c.add(Double.parseDouble(datos[j])); 
                        
                        
                    }
                    Matriz.add(c); 
                    
                    i++;
                }
                lee.close();
                
            }   matrizDistancias = new double[Matriz.size()][Matriz.size()];
            for (int i = 0; i < Matriz.size(); i++) {
                for (int j = 0; j < Matriz.get(0).size(); j++) {
                    matrizDistancias[i][j] = Matriz.get(i).get(j);
                }
                 
            }
        } catch (FileNotFoundException ex) {            
           
        } catch (IOException ex) {
          
        } finally {
            try {
                archivos.close();
            } catch (IOException ex) {
               
            }
        }
        
        
        
    }
}
