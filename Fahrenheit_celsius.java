import java.util.Scanner;

public class Fahrenheit_celsius {

    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);
    
    double fahrenheit;
    
        System.out.print("Digite los grados Fahrenheit: ");
        fahrenheit = teclado.nextDouble();
        
        fahrenheit = (fahrenheit -32)/(1.8);
        
         System.out.println("Conversor a Grados celsius: " + fahrenheit);

     teclado.close();          
    }
}
