/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author play_
 */
public class RevolverDeAgua {
    private int posicionActual; 
    private int posicionBala;

    public RevolverDeAgua() {
        this.posicionActual = (int)(Math.random() *6);
        System.out.println(this.posicionActual + " Acá arranca la ronda"); //primer giro del tambor-
        this.posicionBala = (int)(Math.random() *6);
        System.out.println(this.posicionBala + " En esta posición esta la bala"); //aca esta la bala 
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionBala() {
        return posicionBala;
    }

    public void setPosicionBala(int posicionBala) {
        this.posicionBala = posicionBala;
    }

    @Override
    public String toString() {
        return "RevolverDeAgua{" + "posicionActual=" + posicionActual + ", posicionBala=" + posicionBala + '}';
    }
    
    public Boolean gatillar(){
        return posicionActual == posicionBala;
        
    }
    
    public int siguienteTiro(){
        if(this.posicionActual > 5){
           return this.posicionActual = 0;
        }
        
        return this.posicionActual +1;
    }
    
    
}
