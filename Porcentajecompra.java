/* Un programa que escribe el porcentaje descontado en una compra, introduciendo
por teclado el precio de la tarifa y el precio pagado*/
import java.util.Scanner;


public class Porcentajecompra {
  
      
 public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    double porcentaje,precio,precioTotal;
    
        System.out.print("Digite El Precio Del Articulo: ");
        precio = teclado.nextDouble();
        
        System.out.print("Digite El valor del  Descuento en % (Porcentaje): ");
        porcentaje = teclado.nextDouble();
        
        precioTotal = (precio)-(precio)*(porcentaje/100);
        
         System.out.println("PRECIO TOTAL : " + precioTotal);    
        
      teclado.close();  
    }
}
