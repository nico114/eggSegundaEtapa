/*
 * Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta,
pero cambiada de signo. Es decir, A es antisimétrica si A = -AT.
La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).

 */
package EjerciciosGuia5;

/**
 *
 * @author thell
 */
public class matrizSuma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          // int[] [] matriz=   {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
       int[][] matriz=new int[4][4];
        for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            
          matriz[i][j]= (1+i);
            System.out.print("[" + matriz[i][j] + "]");
        }
            System.out.println("");
            
   
        
        
        }
        System.out.println("************************************");
        System.out.println(" ");
        
        for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            
          matriz[i][j]= ((i+1));
            System.out.print("[" + ((matriz[j][i] )*-1)+ "]");
        }
            System.out.println("");
            
   
        
        
        }
    }
    
}
