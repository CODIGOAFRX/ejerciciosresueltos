import java.util.Scanner;

public class PuntacionesJugador {

    public static int[] puntosArray() {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el tamaño del array"); // DETECTA EL TAMAÑO DEL ARRAY
        int size = teclado.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Introduce el valor de la posición " + i);
            // DESDE LA POSICIÓN "0" HASTA LA "SIZE - 1" VA PIDIENDO VALORES POR CONSOLA
            // PARA IR DEFINIENDO EL ARRAY
            array[i] = teclado.nextInt();

        }
        return array;
    }

    public static double promedio(int[] array) {
        double suma = 0;
        double contador = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                suma += array[i];
                contador++;
            }
        }
        if (contador > 0) {
            return (double) suma / contador;
        } else {
            return 0.0;
        }

    }

    public static void main(String[] args) {

        int[] array = puntosArray();
        double promedio = promedio(array);
        System.out.println("La media de todas tus puntuaciones es " + promedio);
    }
}/// SIN TERMINAR TU XABE
