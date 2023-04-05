/*
 *Los profesores del curso de programación de Egg necesitan llevar un registro de las notas adquiridas por sus 10 alumnos
para luego obtener una cantidad de aprobados y desaprobados.
Durante el período de cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales.
Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo.
Al final del programa los profesores necesitan obtener por pantalla la cantidad de aprobados y desaprobados,
teniendo en cuenta que solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.

 */
package extrasguia4;

import java.util.Scanner;

/**
 *
 * @author thell
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int [] vecNotas=new int[10];
        for (int i = 0; i < vecNotas.length; i++) {
            System.out.println("por favor ingrese las notas del alumno " +(i+1));
            vecNotas[i]=leer.nextInt();
        }
        int aux=0;
        for(int mostrarNotas:vecNotas){
            aux++;
            if (mostrarNotas>=7) {
                System.out.println("la nota de el alumno " + aux + " es: " + mostrarNotas + " aprobo"  );
                
            }else{
            System.out.println("la nota de el alumno " + aux + " es: " + mostrarNotas + " desaprobo"  );
        }
       
    }
    
}
}
