
public class Ejercicio3 {

    public static int[] reporte(int[] resultados) {

        int cantidad = resultados.length;
        int menor = resultados[0];
        int mayor = resultados[0];

        for (int i = 0; i < resultados.length; i++) {

            if (resultados[i] < menor) {
                menor = resultados[i];
            }

            if (resultados[i] > mayor) {
                mayor = resultados[i];
            }
        }

        int[] estadisticas = {
            cantidad, menor, mayor
        };

        return estadisticas;
    }

    public static void main(String[] args) {

        int[] resultados = {
            18, 29, 22, 25, 16, 26, 21, 23, 20, 27, 24, 19, 28, 17, 30,
            22, 25, 21, 18, 26, 23, 20, 29, 17, 27, 24, 19, 28, 22, 25,
            21, 17, 18, 26, 23, 20, 29, 24, 19, 27, 22, 25, 18, 28, 21,
            17, 23, 20, 26, 24, 19, 27, 22, 25, 17, 28, 21, 18, 29, 23,
            20, 26, 24, 19, 22, 25, 17, 27, 21, 18, 29, 23, 20, 26, 24,
            19, 28, 22, 25, 17, 21, 18, 27, 23, 20, 29, 24, 19, 26, 22,
            25, 17, 28, 21, 18, 23, 20, 27, 24, 19, 29, 22, 25, 17, 28,
            21
        };

        int[] resultado = reporte(resultados);

        System.out.println("Cantidad de participantes: " + resultado[0]);
        System.out.println("Menor tiempo: " + resultado[1]);
        System.out.println("Mayor tiempo: " + resultado[2]);
    }
}
