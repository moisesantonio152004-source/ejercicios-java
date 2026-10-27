/*desarrollar un algoritmo que calcule e imprima el perímetro y el área de un
rectángulo dada la longitud de dos de sus lados*/
import java.util.Scanner;
public class Perimetroarearectangulo {

    public static void main(String[] args) {
        
Scanner teclado = new Scanner(System.in);

   double largo,ancho;
   double perimetro,area;
   
     System.out.print("Digite el LARGO : ");
     largo  = teclado.nextDouble();
  
     System.out.print("Digite el ANCHO : ");
     ancho  = teclado.nextDouble();
        
     
 perimetro = 2* (largo + ancho);         
 area = largo * ancho;     
         
         
     System.out.println("El PERIMETRO del RECTANGULO es : " + perimetro); 
     System.out.println("El AREA del RECTANGULO es : " + area);
     
teclado.close(); 
    }
}
