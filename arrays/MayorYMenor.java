public class MayorYMenor {

    public static void main(String[] args) {
        int[] numeros = { 1, 2, 3, 4, 5, 6, };
        int mayor = numeros[0];
        int menor = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }

        }
        System.out.println("el numero mayor es " + mayor);
        System.out.println("el numero menor es " + menor);
    }
}
