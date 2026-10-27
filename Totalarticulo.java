/* Se desea saber cuál es el valor total para pagar de un artículo, sabiendo su valor
por unidad y la cantidad de artículos a llevar. Desarrollar un programa  */
import java.util.Scanner;

public class Totalarticulo {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
   
   
        int precio,cantidad,precioTotal;
   
        System.out.print("Digite El Precio Del Articulo: ");
        precio = teclado.nextInt();
        
        System.out.print("Digite La CANTIDAD : ");
        cantidad = teclado.nextInt();
        
        // AQUI VA LA OPERACION ARITMETICA 
  precioTotal = (precio) * (cantidad);
        
System.out.println("PRECIO TOTAL : " + precioTotal);
teclado.close();
    }
}
