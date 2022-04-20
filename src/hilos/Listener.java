/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author roban
 */
public class Listener implements ActionListener{

    private ClaseA entidad;
    private ClaseBFrame frame;

    public Listener(ClaseA entidad,ClaseBFrame frame) {
        this.entidad = entidad;
        this.frame = frame;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
       
        String texto = this.frame.getjTextFieldMensaje().getText();
        
       this.entidad.setMensaje(texto);
    }
    
}
