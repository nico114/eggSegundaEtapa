/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadEquipo;

import EntidadJugadores.Jugadores;
import java.util.ArrayList;

/**
 *
 * @author thell
 */
public class Equipo {
  private  String nombre;
   private String ciudad;
    private ArrayList<Jugadores>jugadores;

    public Equipo() {
    }

    public Equipo(String nombre, String ciudad, ArrayList<Jugadores> jugadores) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.jugadores = jugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public ArrayList<Jugadores> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugadores> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + ", ciudad=" + ciudad + ", jugadores=" + jugadores + '}';
    }
    
}
