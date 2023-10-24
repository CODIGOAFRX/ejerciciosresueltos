import java.util.Scanner;

public class ContadorDigitosPares {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int ContadorDigitosPares = 0;
        System.out.println("Ingrese un numero");
        int numero = entrada.nextInt();
        while (numero > 0) {
            int digito = numero % 10;
            if (digito % 2 == 0) {
                ContadorDigitosPares++;
            }
            numero /= 10;
        }
        System.out.println("este numero tiene " + ContadorDigitosPares + " digitos pares");
    }
}
