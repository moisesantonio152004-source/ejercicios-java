import java.util.Scanner; // Importar Scanner para leer datos por teclado.

public class Perimetroareacuadrado { // La clase debe tener el mismo nombre del archivo.

    public static void main(String[] args) { // Metodo principal: aqui comienza el programa.

       
        // 1. CREAR EL SCANNER PARA LEER DATOS
        Scanner teclado = new Scanner(System.in);

        // 2. DECLARAR LAS VARIABLES
        double perimetro,area;     
        double lado;

        // 3. SOLICITAR Y LEER LOS DATOS
        System.out.print("Digite Valor lado : ");
            lado = teclado.nextDouble();

        // 4. REALIZAR LOS CALCULOS
        perimetro = lado * 4 ;
        area= lado * lado;


        // 5. MOSTRAR LOS RESULTADOS
System.out.println("\n--- PERIMETRO  ---");
        System.out.println("Perimetro Del CUADRADO: " +perimetro );

System.out.println("\n--- AREA  ---");
        System.out.println("Area Del CUADRADO: " +area );
        // 6. CERRAR EL SCANNER AL FINALIZAR
        teclado.close();

    } // Fin del metodo main.

} // Fin de la clase.