/*
 * Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario".
Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un empleado en función de su edad y salario actual.
El aumento salarial debe ser del 10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.

 */
package extrapoo5;

import java.util.Scanner;

/**
 *
 * @author thell
 */
public class atributoEmpleado {

    private String empleados;
    private int edad;
    private int salario;
    Scanner leer = new Scanner(System.in);
 
            
                   

    public atributoEmpleado() {
    }

    public atributoEmpleado(String empleados, int edad, int salario) {
        this.empleados = empleados;
        this.edad = edad;
        this.salario = salario;
    }

    public String getEmpleados() {
        return empleados;
    }

    public void setEmpleados(String empleados) {
        this.empleados = empleados;
    }

    public int getedad() {
        return edad;
    }

    public void setedad(int edad) {
        this.edad = edad;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void ingresoEmpleados() {

      
        int aumento;

            System.out.println("ingrese el nombre de su empleado");
            empleados = leer.nextLine();
            System.out.println("ingrese la edad de su empleado");
            edad = leer.nextInt();
            System.out.println("ingrese el salario del empleado");
            salario = leer.nextInt();
            if (edad<18) {
                System.out.println("el empleado es menor, la policia ira a su casa");
            
        }  else if (edad>65) {
                System.out.println("su empleado es muy viejo, jubilelo hdp");
            
        }else if (edad > 30 && edad>18) {
                aumento = (int) (salario * 0.1);

                System.out.println("el salario de " + empleados + " es " + salario + " al tener " + edad + " años subira un 10% y sera " + (salario + aumento));

            } else {
                aumento = (int) (salario * 0.05);

                System.out.println("el salario de " + empleados + " es " + salario + " al tener " + edad + " años subira un 5% y sera " + (salario + aumento));
            }
          
                
            
           

        }

    }


