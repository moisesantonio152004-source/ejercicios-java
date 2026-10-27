import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    
        double lado1, lado2, lado3;
        double ladostriangulo,perimetro;

        System.out.print("Digite lado 1: ");
        lado1 = teclado.nextDouble();

        System.out.print("Digite lado 2: ");
        lado2 = teclado.nextDouble();

        System.out.print("Digite lado 3: ");
        lado3 = teclado.nextDouble();
        
  ladostriangulo = (lado1) + (lado2) + (lado3);
  perimetro= (lado2) * (lado3)/2;
System.out.println("\n--- PERIMETRO  ---");
        System.out.println("Perimetro Triangulo: " +ladostriangulo );
System.out.println("\n--- AREA TRIANGULO  ---");
        System.out.println("Area Triangulo: " +perimetro );

        teclado.close();
    }
}
