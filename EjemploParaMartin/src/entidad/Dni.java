/*
 Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
 */
package entidad;

/**
 *
 * @author thell
 */
public class Dni {
    private Integer numero;
    private String serie;

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
        return "Dni{" + "numero=" + numero + ", serie=" + serie + '}';
    }
    
}
