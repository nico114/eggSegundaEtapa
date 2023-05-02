/*
 *Realizar una clase llamada ParDeNumeros que tenga como atributos dos números reales con los cuales se realizarán diferentes operaciones matemáticas.
La clase debe tener un constructor vacío, getters y setters.  En el constructor vacío se usará el Math.random para generar los dos números.
 */
package parDeNumerosEntidad;

/**
 *
 * @author thell
 */
public class parDeNumEntidad {
    double num1;
    double num2;

    public parDeNumEntidad() {
        this.num1=Math.random()*10                                  ;
        this.num2=Math.random()*10;
        
    }

    public parDeNumEntidad(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

  
}
