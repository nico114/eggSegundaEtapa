/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import java.util.ArrayList;

/**
 *
 * @author thell
 */
public class Perros {
       private String raza;
private ArrayList<String> mascotas; // Lista de mascotas

    public Perros() {
    }

    public Perros(String raza, ArrayList<String> mascotas) {
        this.raza = raza;
        this.mascotas = mascotas;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public ArrayList<String> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<String> mascotas) {
        this.mascotas = mascotas;
    }

    @Override
    public String toString() {
        return "Perros{" + "raza=" + raza + ", mascotas=" + mascotas + '}';
    }

}
