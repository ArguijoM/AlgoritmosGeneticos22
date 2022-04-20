/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 * @author roban
 */
public class ClaseA implements Runnable{
        private int n;
        private String mensaje;

    public ClaseA(int n, String mensaje) {
        this.mensaje = mensaje;
        this.n = n;
    }
                
       
    public void imprimir(){
           
        for(int x=0;x<this.getN();x++){
            
           System.out.println(x+": "+this.getMensaje()+"--"+this.getN());
        }

    }

    /**
     * @return the n
     */
    public int getN() {
        return n;
    }

    /**
     * @param n the n to set
     */
    public void setN(int n) {
        this.n = n;
    }

    /**
     * @return the mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * @param mensaje the mensaje to set
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public void run() {
        imprimir();
        imprimir();
    }
    
}
