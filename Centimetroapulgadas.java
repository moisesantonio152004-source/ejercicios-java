import java.util.Scanner;


public class Centimetroapulgadas {

    public static void main(String[] args) {
        
     
    Scanner teclado = new Scanner(System.in);
    
    final double CENTIMETROS = 2.54;
    double pulgadas;
    
    System.out.print("Digite los Centimetos (#) a Convertir : ");
        pulgadas = teclado.nextDouble();
        
        pulgadas = (pulgadas)/(CENTIMETROS);
        
         System.out.println("Conversor de Centimetros a PULGADAS : " + pulgadas);       
     teclado.close();
    }
}
