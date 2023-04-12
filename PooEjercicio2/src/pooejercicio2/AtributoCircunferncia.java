/*
 * Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

 */
package pooejercicio2;

import java.util.Scanner;

/**
 *
 * @author thell
 */
public class AtributoCircunferncia {
    
    private double area;
    private double radio;
    private double perimetro;
    public AtributoCircunferncia(double area, double perimetro) {
        this.area = area;
        this.perimetro = perimetro;
    }
   

    public AtributoCircunferncia(double radio) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el area");
        this.radio = leer.nextDouble();
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public void area (){
        this.area=Math.PI*Math.pow(radio, 2);
        
    }
    public void perimetro(){
        this.perimetro=2*Math.PI*2;
    }

  
    
    
    
    
    
    
}
