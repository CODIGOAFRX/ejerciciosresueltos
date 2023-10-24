import java.util.Scanner;

public class SumaDigitosNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = entrada.nextInt();
        int SumaDigitosNumero = 0;
        while (numero > 0) {
            int digito = numero % 10;
            SumaDigitosNumero += digito;
            numero /= 10;
        }
        System.out.println("la suma de los digitos del numero es: " + SumaDigitosNumero);
    }
}
