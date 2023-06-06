/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package entidad;

/**
 *
 * @author thell
 */
public enum posicionesEnum {
    A("a"), B("b"),C("c"),D("d"),E("E"),F("F");
    
private  String nombre;

    private posicionesEnum(String nombre) {
        this.nombre = nombre;
    }

    private posicionesEnum() {
    }

    public static posicionesEnum getA() {
        return A;
    }

    public static posicionesEnum getB() {
        return B;
    }

    public static posicionesEnum getC() {
        return C;
    }

    public static posicionesEnum getD() {
        return D;
    }

    public static posicionesEnum getE() {
        return E;
    }

    public static posicionesEnum getF() {
        return F;
    }
    
    
}
