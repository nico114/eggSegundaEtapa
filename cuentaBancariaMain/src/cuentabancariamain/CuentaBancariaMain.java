/*
 * 
 */
package cuentabancariamain;

import cuentabancariamain.entidadCuenta.ServicioCuenta.cuentaServicio.ServicioCuenta;

/**
 *
 * @author thell
 */
public class CuentaBancariaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioCuenta banco1 = new ServicioCuenta();
        banco1.crearCuenta();
       banco1.validarCuenta();
       banco1.ingresoDinero();
       banco1.retiroDinero();
       banco1.datos();
    }
    
}
