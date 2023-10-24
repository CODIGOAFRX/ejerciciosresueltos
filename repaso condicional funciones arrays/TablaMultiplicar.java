import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿De que numero quieres comprobar la tabla de multiplicar?");

        int numero = entrada.nextInt();
        for (int i = 0; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println("****************/   " + numero + " x " + i + " = " + resultado + "   /****************");
            entrada.close();
        }
    }
}
