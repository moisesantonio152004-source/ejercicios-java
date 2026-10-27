//Desarrollar un algoritmo que dado el radio de un círculo calcule e imprima el área
import java.util.Scanner;

public class Radiocirculo {

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
   
     System.out.print("Digite el radio del circulo : ");
        double radio = teclado.nextDouble();
  
   final double PI = 3.1416;
   
   double area;
       
               
  area = (PI)*(radio)*(radio);
       
     System.out.println("El Area del Circulo es : " + area);
     
teclado.close();
    }
}
