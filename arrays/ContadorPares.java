public class ContadorPares {

    public static void main(String[] args) {
        int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int contador = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                contador++;
            }

        }
        System.out.println("en este array existen " + contador + " numeros pares ");
    }
}
