import java.util.Scanner;

public class Millas_metros {

    public static void main(String[] args) {
        
        
    Scanner teclado = new Scanner(System.in);
    
    final int MILLAS = 1852;
    double metros;
    
    System.out.print("Digite las millas a convertir: ");
        metros = teclado.nextDouble();
        
        metros = (MILLAS)*(metros);
        
         System.out.println("Conversor de millas nauticas a metros: " + metros);
         teclado.close();
    }
}
