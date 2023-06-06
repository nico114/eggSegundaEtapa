/*
 * del espectador, nos interesa saber su
nombre, edad y el dinero que tiene disponible.
 */
package entidad;

/**
 *
 * @author thell
 */
public class EspectadorEntidad {
    String nombre;
    Integer edad;
    Integer dineroDisponible;

    public EspectadorEntidad(String nombre, Integer edad, Integer dineroDisponible) {
        this.nombre = nombre;
        this.edad = edad;
        this.dineroDisponible = dineroDisponible;
    }

    public EspectadorEntidad() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDineroDisponible() {
        return dineroDisponible;
    }

    public void setDineroDisponible(Integer dineroDisponible) {
        this.dineroDisponible = dineroDisponible;
    }

    @Override
    public String toString() {
        return "EspectadorEntidad{" + "nombre=" + nombre + ", edad=" + edad + ", dineroDisponible=" + dineroDisponible + '}';
    }
    
}
