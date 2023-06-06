/*
 *Vamos a usar la clase Date que ya existe en Java. Crearemos la clase FechaService, en paquete Servicios, que tenga los siguientes métodos:
Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. Luego los pase por parámetro a un nuevo objeto Date. 
El método debe retornar el objeto Date. Ejemplo GregorianCalendar: Date GregorianCalendar = new Date(anio, mes, dia);
Método fechaActual que cree un objeto GregorianCalendar con el día actual. Para esto usaremos el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date.
Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario).
Si necesiten acá tienen más información en clase Date: Documentacion Oracle
 */
package servicioDate;

import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author thell
 */
public class ServicioDate {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");    
    GregorianCalendar GregorianCalendar = new GregorianCalendar();
    public GregorianCalendar fechaNacimiento(){
      
         
         System.out.println("ingrese el dia de nacimiento");
      int dia = leer.nextInt();
      GregorianCalendar.set(dia, dia);
        System.out.println("ingrese el mes de nacimiento");
        int mes = leer.nextInt();
        GregorianCalendar.set(mes, mes);
        System.out.println("ingrese el anio de nacimiento");
        int anio=leer.nextInt();
        GregorianCalendar.set(anio, anio);
        System.out.println("usted nacio el : " + GregorianCalendar.get(dia)+"/" + GregorianCalendar.get(mes) +"/"+GregorianCalendar.get(anio));
        return GregorianCalendar;
    }
    public  GregorianCalendar fechaActual(){
       GregorianCalendar fechaReal;
        fechaReal= new GregorianCalendar() ;
        System.out.println("la fecha actual es: " + fechaReal);
        return new GregorianCalendar();
    }
//    Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario).

//    public  int diferencia(){
//     
//        int edad=GregorianCalendar.get(anio))-fechaActual().get(fechaActual());
//      
//        System.out.println("su edad es: " + edad);
//       
//        return edad;
    }
    
    
    
    
    
    
    
            

