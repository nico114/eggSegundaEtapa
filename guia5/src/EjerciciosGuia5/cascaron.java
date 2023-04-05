/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosGuia5;

/**
 *
 * @author thell
 */
public class cascaron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] arr = {1, 12, 123, 1234, 12345};
int[] counts = new int[5];

for (int i = 0; i < arr.length; i++) {
    int numDigits = String.valueOf(arr[i]).length();
    if (numDigits <= 5) {
        counts[numDigits - 1]++;
    }
}

for (int i = 0; i < counts.length; i++) {
    System.out.println("Number of " + (i + 1) + "-digit numbers: " + counts[i]);
    }
    
}
}