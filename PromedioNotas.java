
import java.util.Scanner;

public class PromedioNotas {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double nota1, nota2, nota3;
        double promedio;

        System.out.print("Digite la primera nota: ");
        nota1 = teclado.nextDouble();

        System.out.print("Digite la segunda nota: ");
        nota2 = teclado.nextDouble();

        System.out.print("Digite la tercera nota: ");
        nota3 = teclado.nextDouble();

        promedio = (nota1 + nota2 + nota3) / 3;

        System.out.println();
        System.out.println("----- RESULTADOS -----");
        System.out.println("Primera nota: " + nota1);
        System.out.println("Segunda nota: " + nota2);
        System.out.println("Tercera nota: " + nota3);
        System.out.println("Promedio final: " + promedio);

        teclado.close();
    }
}
