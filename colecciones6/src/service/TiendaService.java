/*
 *Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package service;

import entidad.TiendaEnt;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author thell
 */
public class TiendaService {

    private Scanner leer;
    private HashMap<String, TiendaEnt> mapaProducto;//mapa vacio

    public TiendaService() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.mapaProducto = new HashMap<>();
    }

    public void menu() {
        int selec;
        do {
            System.out.println("--------Menu--------");
            System.out.println("--------1: Agregar Producto--------");
            System.out.println("--------2: Modificar Precio--------");
            System.out.println("--------3: Eliminar Producto--------");
            System.out.println("--------4: Imprimir Stock--------");
            System.out.println("--------5: Salir--------");

            selec = leer.nextInt();

            switch (selec) {
                case 1 -> {
                    String res;
                    do {
                                 agregarProducto();
                        System.out.println("Desea agregar otro Producto: S/N");
                        res = leer.next().toUpperCase();

                    } while (res.equals("S"));
                }

                case 2 -> {
                    String res;
                    do {
                           modificarPrecio();
                        System.out.println("Desea modificar el precio del Producto: S/N");
                        res = leer.next().toUpperCase();
                    } while (res.equals("S"));
                    
                }

                case 3 -> {
                    String res;
                    do {
                           eliminarProducto();
                        System.out.println("Desea eliminar un  Producto: S/N");
                        res = leer.next().toUpperCase();
                    } while (res.equals("S"));
                }

                case 4 -> {
                    String res;
                    do {
                        imprimirStock();
                        System.out.println("Desea eliminar el stock de productos: S/N");
                        res = leer.next().toUpperCase();
                    } while (res.equals("S"));

                }


            }
        } while (selec != 5);
    } //cierra menu
    
    public void agregarProducto() {
               
        System.out.println("Introduzca el nombre del producto");
        String nombreIngresado = leer.next();
        nombreIngresado = nombreIngresado.toUpperCase();
        System.out.println("Introduzca el precio del producto");
        Integer precio = leer.nextInt();
     

        mapaProducto.put(nombreIngresado,  new TiendaEnt(nombreIngresado, precio));
//         // Te este modo agrego elementos a un mapa. Observar que el primer termino se corresponde a la KEY
//        nuevoMapa.put(dniIngresado,new PersonaHashMap(dniIngresado, nombreIngresado, apellidoIngresado));      
        System.out.println("Se cargo el producto" );

        System.out.println(mapaProducto.toString());
    }
    public void modificarPrecio(){
   
        System.out.println("ingrese el nombre del producto para cambiar precio");
          String nombre = leer.next();
        if(mapaProducto.containsKey(nombre.toUpperCase())){
            System.out.println("ingrese el nuevo precio");
            Integer precioNuevo=leer.nextInt();
   
            TiendaEnt aux = mapaProducto.get(nombre.toUpperCase());
            aux.setPrecio(precioNuevo);
            System.out.println("se cambio el precio Exitosamente, su producto : " +nombre.toUpperCase() + " ahora vale " + precioNuevo + "$" );
            
        }else{
            System.out.println("No se encuentra");
        }
        
    }
 public void eliminarProducto(){
        System.out.println("Ingrese el NOMBRE del producto a Eliminar");
        String nombre = leer.next();
        if(mapaProducto.containsKey(nombre.toUpperCase())){
            
            mapaProducto.remove(nombre.toUpperCase());
            System.out.println("Borrado Exitosamente");
            
        }else{
            System.out.println("No se encuentra");
        }
 }
public void imprimirStock(){

    for (Map.Entry<String, TiendaEnt> stockEntry : mapaProducto.entrySet()) {
        Object key = stockEntry.getKey();
        Object val = stockEntry.getValue();
        System.out.println("el producto: " + key + " vale " + val+ "$");
    }
   
   

   
        
    }
 }
//cierra tiendaservice
