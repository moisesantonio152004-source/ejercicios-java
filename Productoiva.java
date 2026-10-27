
/*Un programa que reciba por teclado el precio de un artículo y calcule cual es el
valor pagado por el iva de ese artículo*/ 
import java.util.Scanner;

public class Productoiva {


public static void main(String[] args) {
    
Scanner teclado = new Scanner(System.in);
 final int IVA = 19;
 double producto;
    
System.out.print("Digite El Precio Del producto: ");
producto = teclado.nextDouble();
           
       
    producto = (producto)*(IVA)/100+(producto);
    
    System.out.println("valor del producto IVA incluido: " + producto );
 teclado.close();
    }
}
