import java.util.Scanner;

public class NumerosPerfectos {
    public static void main(String[] args) {
        int numero;
        int divisores = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        numero = entrada.nextInt();
        boolean numeroPerfecto = false;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                divisores += i;
            }

        }
        if (divisores == numero) {
            numeroPerfecto = true;
            System.out.println("nos encontramos ante un numero perfecto");
        } else {
            System.out.println(numero + " no es un numero perfecto");

        }

    }
}