/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosGuia5;

/**
 *
 * @author thell
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           // TODO code application logic here
        int vector[] = new int[100];
        Rellenar(vector);
        Imprimir(vector);
    }

    public static void Rellenar(int[] vec) {
        for (int i = 0; i < vec.length; i++) {
            vec[i] = i;
        }
    }
    
    public static void Imprimir(int[] vec) {
        for (int i = vec.length - 1; i >= 0; i--) {
            System.out.println("[" + vec[i] + "]");
        }
       
    }
    }
    

