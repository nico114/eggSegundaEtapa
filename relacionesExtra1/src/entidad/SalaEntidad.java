/*
 De Cine nos interesa conocer la película que se está reproduciendo, la
sala con los espectadores y el precio de la entrada
 */
package entidad;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author thell
 */
public class SalaEntidad {
 
   

    private EspectadorEntidad espectador;
private Integer num;
private Integer letra;
  
    public SalaEntidad() {
        espectador= new EspectadorEntidad();
    }

    public SalaEntidad(EspectadorEntidad espectador) {
        this.espectador = espectador;
    }

    public SalaEntidad(EspectadorEntidad espectador, Integer num, Integer letra) {
        this.espectador = espectador;
        this.num = num;
        this.letra = letra;
    }

    public ArrayList<ArrayList<Integer>> getPocicion() {
        return pocicion;
    }

    public void setPocicion(ArrayList<ArrayList<Integer>> pocicion) {
        this.pocicion = pocicion;
    }

  
  


    public EspectadorEntidad getEspectador() {
        return espectador;
    }

    public void setEspectador(EspectadorEntidad espectador) {
        this.espectador = espectador;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getLetra() {
        return letra;
    }

    public void setLetra(Integer letra) {
        this.letra = letra;
    }

  

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.pocicion);
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
        final SalaEntidad other = (SalaEntidad) obj;
        return Objects.equals(this.pocicion, other.pocicion);
    }

    @Override
    public String toString() {
        return "SalaEntidad{" + "pocicion=" + pocicion + '}';
    }
    
}
