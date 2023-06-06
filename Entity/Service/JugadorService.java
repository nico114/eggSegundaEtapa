/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;


import Entity.Jugador;
import Entity.RevolverDeAgua;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author play_
 */
public class JugadorService {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Jugador> jugadores = new ArrayList<>();     
    
    public ArrayList<Jugador> crearJugador() {
        int deci;

        System.out.println("Ingrese la cantidad de jugadores como minimo 1 y max 6");
        deci = sc.nextInt();
        if (deci <= 0 || deci > 6) {
            deci = 6;
        }

        int i = 0;
        do {
            System.out.println("Ingrese el nombre del jugador");
            String nombre = sc.next();
            jugadores.add(new Jugador(nombre, i));
            i++;
        } while (i < deci);
        return jugadores;
    }

    public void disparo(RevolverDeAgua x, ArrayList<Jugador> players) {
        Boolean asd = true;
        do {
            for (Jugador e : players) {
                if (x.gatillar()) {
                    e.setMojado(Boolean.TRUE);
                    System.out.println("El jugador n° " + (e.getId() + 1) + ") " + e.getNombre() + " se mojó/murió");
                    System.out.println("Se terminó el juego");
                    asd = false;
                    break;
                } else {
                    System.out.println("Te salvaste :" + e.getNombre());
                    x.setPosicionActual(x.getPosicionActual() +1);
                    System.out.println(x.getPosicionActual());
                    System.out.println("bala: " +x.getPosicionBala());
                    x.siguienteTiro();
                }
            }

        } while (asd);

    }
}

