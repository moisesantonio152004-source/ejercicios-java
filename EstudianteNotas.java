/*Un estudiante de Ingeniería de Sistemas del SENA tiene tres cortes de notas en
una asignatura con valor de 0.0 a 5.0, el primer y segundo corte vale un 20% y el
tercer corte vale 60%. Desarrollar una solución algorítmica que permita saber que
nota se debe sacar como mínimo en el 60% si conozco los primeros 20%. Tener en
cuenta que para superar una asignatura debe ser igual o mayor a 3.0. */



import java.util.Scanner;

public class EstudianteNotas { // La clase debe tener el mismo nombre del archivo.

    public static void main(String[] args) { // Metodo principal: aqui comienza el programa.

        // 1. CREAR EL SCANNER PARA LEER DATOS
        Scanner teclado = new Scanner(System.in);

        // 2. DECLARAR LAS VARIABLES
        double nota1,nota2;
        double notaFinal,notaRequerida;
        

        // 3. SOLICITAR Y LEER LOS DATOS NOTA: DESCOMENTAR LA QUE SE VAYA A USAR
        System.out.print("Digite PRIMERA NOTA : ");
          nota1= teclado.nextDouble(); // Para numeros reales / decimales (o dinero)

          System.out.print("Digite SEGUNDA NOTA : ");
          nota2= teclado.nextDouble(); 

        
        // variable = teclado.nextInt();    // Para numeros enteros (cantidades, horas, dias)
        // variable = teclado.nextLine();   // Para texto / cadenas de caracteres

        // 4. REALIZAR LOS CALCULOS

       notaFinal = (nota1*20/100 + nota2*20/100);
       notaRequerida = (3.0 - notaFinal) /0.60 ;
       


        // 5. MOSTRAR LOS RESULTADOS
        System.out.println("\n--- NOTA FINAL---");
        System.out.println("Nota Final: " + notaFinal);

        System.out.println("\n--- NOTA REQUERIDA---");
        System.out.println("Nota Requerida: " + notaRequerida);

       
        
       
        // 6. CERRAR EL SCANNER AL FINALIZAR
        teclado.close();

    } // Fin del metodo main.

} // Fin de la clase.