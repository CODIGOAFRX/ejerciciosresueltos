public class CalcularPromedio { // calcularemos el promedio de los numeros introducios en un array

    public static void main(String[] args) {
        double[] numeros = { 1, 2, 3, 4, 5 };
        double suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        double resultado = suma / numeros.length;
        System.out.println("el promedio de eta vaina e " + resultado);
    }
}
