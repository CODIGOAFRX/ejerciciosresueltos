import java.util.Arrays;

public class javautilarrays {

    public static void main(String[] args) {

        int[] arrays = { 12, 22, 13, 24, 15, 6, 37, 18, 19 };
        Arrays.sort(arrays);

        System.out.println(Arrays.toString(arrays));

        binarySearch(arrays, 18);
        if (Arrays.binarySearch(arrays, 18) >= 0) {
            System.out.println("Encontrado!!");
        }
        copyOf(arrays, 0, arrays.length - 1, 0, arrays.length);
        System.out.println(Arrays.toString(arrays));

        String texto = "ay dio mio";
        System.out.println(texto.length());

    }

    private static void copyOf(int[] arrays, int i, int j, int k, int length) {
    }

    private static void binarySearch(int[] arrays, int i) {
    }
}