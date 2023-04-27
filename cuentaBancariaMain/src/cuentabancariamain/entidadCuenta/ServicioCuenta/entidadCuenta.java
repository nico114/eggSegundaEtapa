/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentabancariamain.entidadCuenta.ServicioCuenta;

/**
 *
 * @author thell
 */
public class entidadCuenta {
       private String titular;
    private String contraseña;
    private String logIn;
    private String logIn2;
    private double ingeso;
    private String aux;
    private String aux2;
    private double dinero=0;
    public entidadCuenta() {
    }

    public entidadCuenta(String titular, String contraseña, String logIn, String logIn2, double ingeso, String aux, String aux2) {
        this.titular = titular;
        this.contraseña = contraseña;
        this.logIn = logIn;
        this.logIn2 = logIn2;
        this.ingeso = ingeso;
        this.aux = aux;
        this.aux2 = aux2;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getLogIn() {
        return logIn;
    }

    public void setLogIn(String logIn) {
        this.logIn = logIn;
    }

    public String getLogIn2() {
        return logIn2;
    }

    public void setLogIn2(String logIn2) {
        this.logIn2 = logIn2;
    }

    public double getIngeso() {
        return ingeso;
    }

    public void setIngeso(double ingeso) {
        this.ingeso = ingeso;
    }

    public String getAux() {
        return aux;
    }

    public void setAux(String aux) {
        this.aux = aux;
    }

    public String getAux2() {
        return aux2;
    }

    public void setAux2(String aux2) {
        this.aux2 = aux2;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "sus datos son: " + "titular:" + titular + ", contraseña=" + contraseña + ", dinero ingresado "  + ingeso + ", dinero disponible " + dinero ;
    }

    

   
  

  


}
