import java.util.Scanner;

public class diasSemana { // La clase debe tener el mismo nombre del archivo.

    public static void main(String[] args) { // Metodo principal: aqui comienza el programa.

        // 1. CREAR EL SCANNER PARA LEER DATOS
        Scanner teclado = new Scanner(System.in);

        // 2. DECLARAR LAS VARIABLES
        int n;

        // 3. SOLICITAR Y LEER LOS DATOS NOTA: DESCOMENTAR LA QUE SE VAYA A USAR
        System.out.print("DIGITE UN NUMERO DEL 1 AL 7 : ");
        
          n = teclado.nextInt();    // Para numeros enteros (cantidades, horas, dias)
        

        // 4. REALIZAR LOS CALCULOS

         if (n == 1) {
            System.out.println("Lunes");
        } else if (n == 2) {
            System.out.println("Martes");
        } else if (n == 3) {
            System.out.println("Miercoles");
        } else if (n == 4) {
            System.out.println("Jueves");
        } else if (n == 5) {
            System.out.println("Viernes");
        } else if (n == 6) {
            System.out.println("Sabado");
        } else if (n == 7) {
            System.out.println("Domingo");
        } else {
            System.out.println("Numero no valido");
        }


        // 5. MOSTRAR LOS RESULTADOS
        //System.out.println("\n--- NOMBRE A MOSTRAR TITULO ---");
        //System.out.println("Ejemplo xxxxx: " + n);

        // 6. CERRAR EL SCANNER AL FINALIZAR
        teclado.close();

    } // Fin del metodo main.

} // Fin de la clase.