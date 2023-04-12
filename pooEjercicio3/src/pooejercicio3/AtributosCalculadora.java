/*
 * Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. A continuación, se deben crear los siguientes métodos:
Método constructor con todos los atributos pasados por parámetro.
Método constructor sin los atributos pasados por parámetro.
Métodos get y set.
Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
Método sumar(): calcular la suma de los números y devolver el resultado al main.
Método restar(): calcular la resta de los números y devolver el resultado al main
Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero,
el método devuelve 0 y se le informa al usuario el error. Si no, se hace la multiplicación y se devuelve el resultado al main
Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero,
el método devuelve 0 y se le informa al usuario el error se le informa al usuario. Si no, se hace la división y se devuelve el resultado al main.

 */
package pooejercicio3;

import java.util.Scanner;

/**
 *
 * @author thell
 */
public class AtributosCalculadora {
    private int num1;
    private int num2;
    private int resultado;

    public AtributosCalculadora() {
    }

  

   
public AtributosCalculadora(int num1, int num2, int resultado) {
        this.num1 = num1;
        this.num2 = num2;
        this.resultado = resultado;
}

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
  public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    public void numPrametro(){
        this.num1=10;
        this.num2=20;
        
    }
    public void crearOperacion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        this.num1=leer.nextInt();
        System.out.println("ingrese el segundo numero");
        this.num2=leer.nextInt();
        
    }
    
    public void sumar(){
        resultado=num1+num2;
        System.out.println("el resultado de la suma de " + this.num1 + " y " + this.num2 + " es " + this.resultado);
    }
    
    public void restar (){
        resultado=num1-num2;
       
          System.out.println("el resultado de la resta de " + this.num1 + " y " + this.num2 + " es " + this.resultado);
    }
    
    public void multiplica (){
        if(num1>0 && num2>0){
             resultado=num1*num2;
             System.out.println("el resultado de multiplicar " + this.num1 + " y " + this.num2 + " es " + this.resultado);
        }else{
            System.out.println( 0 + " error, vuelva a intentar");
        }
    }
        

     public void divide (){
        if(num1>0 && num2>0){
             resultado=num1/num2;
               System.out.println("el resultado de la division de " + this.num1 + " y " + this.num2 + " es " + this.resultado);
        }else{
            System.out.println( 0 + " error, vuelva a intentar");
        }
        
       
    
    }
    
    
}

