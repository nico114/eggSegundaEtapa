/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplorelaciones2;

import EntidadEquipo.Equipo;
import EntidadJugadores.Jugadores;
import java.util.Scanner;

/**
 *
 * @author thell
 */
public class EjemploRelaciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");    
        Equipo team=new Equipo();
        Jugadores player=new Jugadores();
     
    
        team.getJugadores();
        String rta;
    
      
            System.out.println("ingrese el nombre del equipo");
            team.setNombre(leer.nextLine());
            System.out.println("ingrese la ciudad");
            team.setCiudad(leer.nextLine());
            do {      System.out.println("ingrese el nombre del jugador");   
            player.setNombre(leer.nextLine());
            do {      System.out.println("ingrese el apellido del jugador");   
            player.setApellido(leer.nextLine());
            do {      System.out.println("ingrese el numero del jugador");   
            player.setNumero(leer.nextInt());
            do {      System.out.println("ingrese la posicion del jugador");   
            player.setPosicion(leer.nextLine());
                System.out.println("desea ingresar otro jugador");
                rta=leer.hasNextLine();
            } while (rta.equalsIgnoreCase("n"));
             team.setJugadores(player());
                System.out.println(team.toString());
    }
    
}
