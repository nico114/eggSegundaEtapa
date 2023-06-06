/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import Service.JugadorService;
import java.util.ArrayList;

/**
 *
 * @author play_
 */
public class Juego {
    JugadorService p = new JugadorService();
    RevolverDeAgua asd = new RevolverDeAgua();
   private ArrayList<Jugador> jugadores;
   private RevolverDeAgua arma;

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public void setArma(RevolverDeAgua arma) {
        this.arma = arma;
    }
    

    public Juego() {
    }
   //ArrayList<Jugador> lista, RevolverDeAgua armita
   public void llenarJuego(){
       setJugadores(p.crearJugador());
       setArma(asd);
   }
   
   public void ronda(){
       p.disparo(arma, jugadores);
   }
}
