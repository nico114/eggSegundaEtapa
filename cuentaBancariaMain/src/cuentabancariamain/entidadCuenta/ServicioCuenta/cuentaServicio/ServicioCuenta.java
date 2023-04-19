/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentabancariamain.entidadCuenta.ServicioCuenta.cuentaServicio;

import cuentabancariamain.entidadCuenta.ServicioCuenta.entidadCuenta;
import java.util.Scanner;

/**
 *
 * @author thell
 */
public class ServicioCuenta {

    entidadCuenta banco = new entidadCuenta();
    Scanner leer = new Scanner(System.in);

    public entidadCuenta crearCuenta() {

        System.out.println("ingrese un usuario");
        banco.setTitular(leer.next());
        System.out.println("ingrese una contraseña");
        banco.setContraseña(leer.next());
        System.out.println("cuenta creada");

        return banco;

    }

    public void  validarCuenta() {
 String check1;
 String check2;
        do {
            System.out.println("ingrese usuario ");

            check1 = leer.next();

            System.out.println("ingrese contraseña");
            check2 = leer.next();

        } while (!check2.equals(banco.getContraseña()) && !check1.equals(banco.getTitular()));

        System.out.println("bienvenido " + banco.getTitular());
        
        
    }

    public void  ingresoDinero() {
String aux;
String consulta;
double total=0;
        System.out.println("desea ingresar dinero, ingrese y para continuar");
        aux = leer.next();
        if ("y".equalsIgnoreCase(aux)) {
            System.out.println("ingrese un monto");
            banco.setIngeso(leer.nextInt());
            total+=banco.getIngeso();

        }
        System.out.println("desea consultar su saldo?, y para confirmar");
       consulta=leer.next();
        if ("y".equalsIgnoreCase(consulta)) {
            System.out.println("su saldo es: " +total);
            
            
        }
        
    }

    

    public void retiroDinero() {
       
        double porcentaje;

        System.out.println("desea retirar dinero? y para continuar, r para extraccion rapida");
        String aux2 = leer.next();
        porcentaje=banco.getIngeso()*0.2;
        if ("r".equalsIgnoreCase(aux2) && porcentaje> banco.getIngeso()){
            System.out.println("usted retiro el 20% de su saldo " + porcentaje);
        } else {
            System.out.println("imposible realizar operacion");
            
        }
            
        if ("y".equalsIgnoreCase(aux2)) {
            System.out.println("su saldo es " + banco.getIngeso() + " cuanto dinero desea retirar?");
            banco.setDinero(leer.nextInt());

        }
        if (banco.getIngeso() < banco.getDinero()) {
            System.out.println("saldo insuficiente");

        } else {

            System.out.println("usted retiro " + banco.getDinero());
            System.out.println("su saldo disponible es " + (banco.getIngeso() - banco.getDinero()));

        }

    }
    public void datos(){
        String vDatos;
        System.out.println("quiere consultarsus datos?, y para continuar");
        vDatos=leer.next();
        if ("y".equalsIgnoreCase(vDatos)) {
            System.out.println(banco);
        }
        
    }
   

}
