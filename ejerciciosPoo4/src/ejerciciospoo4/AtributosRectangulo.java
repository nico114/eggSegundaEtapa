/*
 *Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo privado altura.
La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario.
También incluirá un método para calcular la superficie del rectángulo y un método para calcular el perímetro del rectángulo. 
Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura. 
Se deberán además definir los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.

 */
package ejerciciospoo4;

import java.util.Scanner;

/**
 *
 * @author thell
 */
public class AtributosRectangulo {
    private int base;
    private int alto;
    private int perimetroR;
    private int superficieR;

    public AtributosRectangulo() {
    }

    public AtributosRectangulo(int base, int alto, int perimetroR, int superficieR) {
        this.base = base;
        this.alto = alto;
        this.perimetroR = perimetroR;
        this.superficieR = superficieR;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getPerimetroR() {
        return perimetroR;
    }

    public void setPerimetroR(int perimetroR) {
        this.perimetroR = perimetroR;
    }

    public int getSuperficieR() {
        return superficieR;
    }

    public void setSuperficieR(int superficieR) {
        this.superficieR = superficieR;
    }
   
   public void armarRectangulo (){
       Scanner leer = new Scanner(System.in);
       System.out.println("ingrese la base del rectangulo");
       this.base=leer.nextInt();
      
       System.out.println("ingrese el alto del rectangulo");
       this.alto=leer.nextInt();
       
   }
   public void perimetro(){
       perimetroR=(this.base + this.alto) * 2;
       System.out.println("el perimetro de un rectangulo con base " + this.base + " y altura " + this.alto + " es " + perimetroR);
   }
   public void superficie(){
       superficieR=this.base*this.alto;
       System.out.println("la superficie de un rectangulo con base " + this.base + " y altura " + this.alto + " es " + superficieR);
   }
   
    
}
