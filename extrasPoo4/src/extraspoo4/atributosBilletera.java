/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad de dinero del saldo de la cuenta.
Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.

 */
package extraspoo4;

import java.util.Scanner;

/**
 *
 * @author thell
 */
public class atributosBilletera {
 Scanner leer = new Scanner(System.in);
  
    private String titular;
    private String contraseña;
    private String logIn;
    private String logIn2;
    private int ingeso;
    private String aux;
    private String aux2;
    private int dinero=0;
    public atributosBilletera() {
    }

    public atributosBilletera(int saldo, String titular, String contraseña, String logIn, String logIn2, int ingeso, String aux, String aux2) {
      
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

    public int getIngeso() {
        return ingeso;
    }

    public void setIngeso(int ingeso) {
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

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }
    

  
    


    public void crearCuenta() {
       
        System.out.println("ingrese un usuario");
        this.titular = leer.next();
        System.out.println("ingrese una contraseña");
        this.contraseña = leer.next();
        System.out.println("cuenta creada");
       
    }

   public void ingresarCuenta() {
       String check1;
       String check2;
       
      do{ 
       System.out.println("ingrese usuario ");

       check1=leer.next();
       
       System.out.println("ingrese contraseña");
       check2=leer.next();
       

      }while(!check2.equals(contraseña) && !check1.equals(titular));
       
 
       

           
     
            System.out.println("bienvenido " + titular);
        }
       

    
    public void ingresarDinero(){
         
        System.out.println("desea ingresar dinero, ingrese y para continuar");
        aux=leer.next();
        if ("y".equalsIgnoreCase(aux)) {
            System.out.println("ingrese un monto");
           this.ingeso=leer.nextInt();
            
        }
    }

    public void retirarDinero() {
      
        System.out.println("desea retirar dinero? y para continuar");
        aux2=leer.next();
        if ("y".equalsIgnoreCase(aux2)) {
            System.out.println("su saldo es " + ingeso + " cuanto dinero desea retirar?");
          dinero=leer.nextInt();
          
        } if (ingeso<dinero) {
                System.out.println("saldo insuficiente");
      
              }else{
            
                System.out.println("usted retiro " + dinero );
                System.out.println("su saldo disponible es " + (ingeso-dinero));
            

    }

}
}
