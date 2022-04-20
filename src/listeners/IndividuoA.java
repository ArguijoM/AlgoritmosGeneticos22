/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listeners;

import gui.JFrameIndividuoA;
import gui.JFramePrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import nsat.GeneticoNSAT;

/**
 *
 * @author Arguijo
 */
public class IndividuoA{
    private int numGen, tamPob;
    private double probMuta;

    public IndividuoA(String numGen, String tamPob, String probMuta) {
        this.numGen = Integer.parseInt(numGen);
        this.tamPob = Integer.parseInt(tamPob);
        this.probMuta = Double.parseDouble(probMuta);
        crearGenetico();
    }

    public void crearGenetico() {
        GeneticoNSAT gen = new GeneticoNSAT(numGen, tamPob, probMuta);
        JFrameIndividuoA a = new JFrameIndividuoA(gen);
        a.setVisible(true);
    }
    
}
