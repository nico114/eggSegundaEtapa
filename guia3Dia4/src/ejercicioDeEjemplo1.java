
import java.util.Scanner;

//Implementar un programa que le pida dos números enteros al usuario
//y determine si ambos o alguno de ellos es mayor a 25.

public class ejercicioDeEjemplo1 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("escriba dos numeros enteros");
        int num1= leer.nextInt();
        int num2= leer.nextInt();
        if (num1>25 && num2 >25) 
        { System.out.println("ambos numero son mayor a 25 " );
            
                
          
        }
        else { 
            if (num1>25)
            {
                System.out.println("es mayor a 25 " + num1);
                
            }
            else {
                if (num2>25)
                        {
                            System.out.println("es mayor a 25 " +num2);
                        }
                else{
                    System.out.println("no son mayores a 25");
                
                  
                }
            }        
        
     
      
        
    }
    
}
}