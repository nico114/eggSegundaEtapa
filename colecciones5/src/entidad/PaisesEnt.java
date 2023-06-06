/*
 *Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
package entidad;

import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author thell
 */
public class PaisesEnt {

    private String pais;

    public PaisesEnt() {
    }

    public PaisesEnt(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public static Comparator<PaisesEnt> comparaPais = new Comparator<PaisesEnt>() {
        @Override

        public int compare(PaisesEnt p1, PaisesEnt p2) {
            return p1.getPais().compareToIgnoreCase(p2.getPais());

        }
    };

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.pais);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PaisesEnt other = (PaisesEnt) obj;
        return Objects.equals(this.pais, other.pais);
    }

    @Override
    public String toString() {
        return "PaisesEnt{" + "pais=" + pais + '}';
    }

}