/*
 * Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un método "calcular_area" que calcule y devuelva el área del rectángulo.
Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados de 4 y 6 y imprime el área del rectángulo.

 */
package extrapoo6;

/**
 *
 * @author thell
 */
public class ObjetoRectangulo1 {

    private int lado3;
    private int lado4;

    public int getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    public int getLado4() {
        return lado4;
    }

    public void setLado4(int lado4) {
        this.lado4 = lado4;
    }

    public ObjetoRectangulo1(int lado3, int lado4) {
        this.lado3 = lado3 ;
        this.lado4 = lado3;
    }

    public ObjetoRectangulo1() {
    }

}
