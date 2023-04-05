/*
 Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la matriz.
La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).

 */
package EjerciciosGuia5;



/**
 *
 * @author thell
 */
public class matrizTranspuesta {

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
        for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            
          matriz[i][j]= (1+i);
            System.out.print("[" + matriz[j][i] + "]");
        }
            System.out.println("");
            
   
        
        
        }
       
    }
}
    

