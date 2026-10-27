import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double nota1, nota2, nota3;
        double notaFinal;

        System.out.print("Digite la nota 1: ");
        nota1 = teclado.nextDouble();

        System.out.print("Digite la nota 2: ");
        nota2 = teclado.nextDouble();

        System.out.print("Digite la nota 3: ");
        nota3 = teclado.nextDouble();

        notaFinal = (nota1 * 0.20)
                  + (nota2 * 0.20)
                  + (nota3 * 0.60);

        System.out.println("\n--- RESULTADO FINAL ---");
        System.out.println("Nota final: " + notaFinal);

        teclado.close();
    }
}
