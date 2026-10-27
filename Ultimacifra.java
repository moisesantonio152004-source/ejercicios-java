 //Un programa que obtiene la última cifra de un número introducido
import java.util.Scanner;

public class Ultimacifra {

    public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
     
           
    int ultima;
    final int DIVISOR = 10;
    
    
    System.out.print("Digite Numero para saber ultima cifra : ");
        ultima = teclado.nextInt();
        
        
  ultima = (ultima)%(DIVISOR);    
          
        System.out.println("La Ultima Cifra es : " + ultima);
        teclado.close();
    }
}
