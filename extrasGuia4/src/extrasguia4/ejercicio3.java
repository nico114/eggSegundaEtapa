/*
 Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro.
Después haremos otra función o procedimiento que imprima el vector.

 */
package extrasguia4;

/**
 *
 * @author thell
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int [] vector = new int[5];
        for (int i = 0; i < vector.length; i++) {
            vector[i]=(int) (Math.random()*10);
                    
        }
        for(int mostrar:vector){
            System.out.print("["+mostrar+"}");
        }
        System.out.println("");
    }
    
    
}
