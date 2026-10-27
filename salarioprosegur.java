/*1. La empresa Prosegur tiene problema para calcular el salario neto a pagar a un
empleado, desarrollar una solución algoritmo que permita calcular e imprimir el
salario total, salario neto y el 5% del salario total como retención en la fuente,
ingresando por teclado el valor de la hora y el número de horas trabajadas*/

import java.util.Scanner;
public class salarioprosegur { // La clase debe tener el mismo nombre del archivo.

    public static void main(String[] args) { // Metodo principal: aqui comienza el programa.

        // 1. CREAR EL SCANNER PARA LEER DATOS
        Scanner teclado = new Scanner(System.in);

        // 2. DECLARAR LAS VARIABLES
        final double RETENCION= 5;
        double salarioTotal,salarioNeto,valconretencion;
        double valorHoras,horasTrabajadas;

        // 3. SOLICITAR Y LEER LOS DATOS NOTA: DESCOMENTAR LA QUE SE VAYA A USAR
        System.out.print("Digite Valor Horas : ");
        //dinero = teclado.nextDouble(); // Para numeros reales / decimales (o dinero)
         valorHoras = teclado.nextDouble();    // Para numeros enteros (cantidades, horas, dias)
        // variable = teclado.nextLine();   // Para texto / cadenas de caracteres
         System.out.print("Digite Horas Trabajadas: ");
         horasTrabajadas = teclado.nextDouble(); 

        // 4. REALIZAR LOS CALCULOS

      salarioTotal= valorHoras * horasTrabajadas;
      valconretencion= salarioTotal* RETENCION/100;
      salarioNeto = salarioTotal-valconretencion;
     


       
        // 5. MOSTRAR LOS RESULTADOS
        System.out.println("\n--- SALARIO TOTAL ---");
        System.out.println("Salario Total: " + salarioTotal);

        System.out.println("\n--- RETENCION 5 % ---");
        System.out.println("Descuento Retencion: " + valconretencion);

        System.out.println("\n--- SALARIO NETO ---");
        System.out.println("Salario Neto: " + salarioNeto);

        // 6. CERRAR EL SCANNER AL FINALIZAR
        teclado.close();

    } // Fin del metodo main.

} // Fin de la clase.