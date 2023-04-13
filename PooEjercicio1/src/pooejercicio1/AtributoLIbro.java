/*
 *  Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas,
y un constructor con todos los atributos pasados por parámetro y un constructor vacío.
Crear un método para cargar un libro pidiendo los datos al usuario y luego informar mediante otro método el número de ISBN
, el título, el autor del libro y el número de páginas.
 */
package pooejercicio1;

import java.util.Scanner;

/**
 *
 * @author thell
 */
public class AtributoLIbro {
    
    public int ISBN;
    public String titulo;
    public String autor;
    public int numPaginas;

    public AtributoLIbro() {
    }

    public AtributoLIbro(int ISBN, String titulo, String autor, int numPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }
     public void datosLibro (){
     
        Scanner leer = new Scanner(System.in);
         System.out.println("ingrese el ISBN");
         this.ISBN = leer.nextInt();
         System.out.println("ingrese el titulo del libro");
         this.titulo = leer.next(autor);
         System.out.println("ingrese el autor del libro");
         this.autor= leer.next();
         System.out.println("ingrese el numero de paginas");
         this.numPaginas= leer.nextInt();
     }

}
    
   
    
    
    
    
    

