/*
 *Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
 */
package ObjetoDni;

import ObjetoPersona.Persona;

/**
 *
 * @author thell
 */
public class Dni {
    private Integer numero;
    private String serie;
    private Persona Persona;

    public Persona getPersona() {
        return Persona;
    }

    public void setPersona(Persona Persona) {
        this.Persona = Persona;
    }
    public Dni() {
    }

    public Dni(Integer numero, String serie) {
        this.numero = numero;
        this.serie = serie;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    @Override
    public String toString() {
        return "Dni{" + "numero=" + numero + ", serie=" + serie + ", Persona=" + Persona + '}';
    }
    
}
