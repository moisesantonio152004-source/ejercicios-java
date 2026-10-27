/*Un programa que pida por teclado dos números enteros y muestre su suma,
resta, multiplicación, división y el resto (módulo) de la división*/
import java.util.Scanner;
public class Dosnumeros {

   public static void main(String[] args) {
   Scanner teclado = new Scanner(System.in);
   
    int num1;
    int num2;
      
    double suma,resta,multiplicacion,division,modulo;
    
        System.out.print("Digite NUMERO 1: ");
        num1 =  teclado.nextInt();

        System.out.print("Digite NUMERO 2: ");
        num2 =  teclado.nextInt();

  suma = num1 + num2;
  resta =num1 - num2; 
  multiplicacion = num1 * num2;
  
  System.out.println("Resultados de las operaciones:");
        System.out.println("El Resultado de la Suma ES : " + suma);
        System.out.println("El Resultado de la Resta ES : " + resta);
        System.out.println("El Resultado de la Multiplicacion ES : " + multiplicacion);
  
  if (num2 == 0) {

            System.out.println("No se puede dividir entre cero.");

        } else {

  division = (double) num1 / num2;
  modulo = num1 % num2;
   
   
        System.out.println("El Resultado de la Division ES :" + division);
        System.out.println("El Resultado del Modulo ES :" + modulo);
          teclado.close();            
   }
    }
}
