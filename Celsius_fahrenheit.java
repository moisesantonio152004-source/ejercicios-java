import java.util.Scanner;

public class Celsius_fahrenheit {

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    double celsius;
    
        System.out.print("Digite los grados Celsius: ");
        celsius = teclado.nextDouble();
        
        celsius = (celsius *1.8)+(32);
        
         System.out.println("Conversor a Grados Fahrenheit: " + celsius);

       teclado.close();
    }
}
