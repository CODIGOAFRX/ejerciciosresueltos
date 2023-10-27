import java.util.Scanner;

public class notas {

    public static double[] notasArray() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce cuántas notas quieres introducir: ");
        int size = leer.nextInt();
        double[] notas = new double[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Introduce la nota " + (i + 1) + ": ");
            notas[i] = leer.nextDouble();
        }
      
        for (int i = 0; i < size; i++) {
            System.out.println("La nota numero " + ( i + 1 ) + " es " + notas[i]);}
        return notas;
    }

    public static double media(double[] notas) {
        double suma = 0;
        int contador = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
            contador++;
        }
        return suma / contador ;
    }

    public static void mayorQueMedia(double[] notas) {
        double media = media(notas);
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                System.out.println("La nota " + (i + 1) + " : " + notas[i] + ", es mayor que la media");
            } else if (notas[i] == media) {
                System.out.println("La nota " + (i + 1) + " : " + notas[i] + ", es igual que la media");
            }
        }
    }

    public static void main(String[] args) {
        double[] notas = notasArray();
        double media = media(notas);
        System.out.println("La media de las notas obtenidas por este alumno es " + media);
        mayorQueMedia(notas);
    }
}
