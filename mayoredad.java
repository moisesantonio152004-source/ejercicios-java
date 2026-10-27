import java.util.Scanner;

public class mayoredad { // La clase debe tener el mismo nombre del archivo.

    public static void main(String[] args) { // Metodo principal: aqui comienza el programa.

        // 1. CREAR EL SCANNER PARA LEER DATOS
        Scanner teclado = new Scanner(System.in);

        // 2. DECLARAR LAS VARIABLES
        int edad;

        // 3. SOLICITAR Y LEER LOS DATOS NOTA: DESCOMENTAR LA QUE SE VAYA A USAR
        System.out.print("ESCRIBA SU EDAD : ");
        // variable = teclado.nextDouble(); // Para numeros reales / decimales (o dinero)
         edad = teclado.nextInt();    // Para numeros enteros (cantidades, horas, dias)
        // variable = teclado.nextLine();   // Para texto / cadenas de caracteres

        // 4. REALIZAR LOS CALCULOS
       

        if (edad>=18) {
        System.out.println("\n--- ES MAYOR DE EDAD ---");
        System.out.println("Mayor de edad: " + edad);
            
        }

        else
            { System.out.println("\n---  ES MENOR DE EDAD ---");
        System.out.println("Menor de edad: " + edad);}

        // 5. MOSTRAR LOS RESULTADOS
        

       

        // 6. CERRAR EL SCANNER AL FINALIZAR
        teclado.close();

    } // Fin del metodo main.

} // Fin de la clase.