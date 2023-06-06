/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guiacolecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

/**
 *
 * @author thell
 */
public class GuiaColecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Integer> edad = new ArrayList();
        int n1 = 20;
        int n2 = 25;
        int n3 = 30;
        int n4 = 10;
        int n5 = 15;
        int n6 = 40;
        edad.add(n1);
        edad.add(n2);
        edad.add(n3);
        edad.add(n4);
        edad.add(n5);
        edad.add(n6);

        System.out.println(edad);
      edad.remove(4);
        System.out.println(edad);

        TreeSet<String> nombre = new TreeSet();
        String name1 = "nico";
        String name2 = "luis";
        String name3 = "fer";
        String name4 = "fito";
        String name5 = "flor";
        String name6 = "faby";
        nombre.add(name1 + " " + name2 + " " + name3 + " " + name4 + " " + name5 + " " + name6);
        System.out.println(nombre);
        nombre.remove(name4);
        System.out.println(nombre);

        HashMap<Integer, String> personas = new HashMap();
        personas.put(n1, name1);
        personas.put(n2, name2);
        personas.put(n3, name3);
        personas.put(n4, name4);
        personas.put(n5, name5);
        personas.put(n6, name6);
        System.out.println(personas);
        personas.remove(n5);
        System.out.println(personas);

    }

}
