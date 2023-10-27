import java.util.Scanner;

public class tiendapruebasolo {

    public static void main(String[] args) {
        int maxProductos = 100;
        String[] nombres = new String[maxProductos];
        double[] precios = new double[maxProductos];
        int[] cantidades = new int[maxProductos];
        int totalProductos = 0;

        while (true) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("--------------------");
            System.out.println("----OPCIONES--------");
            System.out.println("--------------------");
            System.out.println("1.  Agregar artículo");
            System.out.println("2.  Ver inventario--");
            System.out.println("3.  Valor total-----");
            System.out.println("4.  Fuera de stock--");
            System.out.println("5.  Salir-----------");
            System.out.println("--------------------");
            int opcion = entrada.nextInt();
            if (opcion == 1) {
                if (maxProductos > totalProductos) {
                    System.out.println("Introduce el nombre del producto numero " + (totalProductos + 1));
                    entrada.nextLine();
                    String nombre = entrada.nextLine();
                    nombres[totalProductos] = nombre;
                    System.out.println("Introduce el precio del producto numero " + (totalProductos + 1));
                    double precio = entrada.nextDouble();
                    precios[totalProductos] = precio;
                    System.out.println("Introduce la cantidad del producto numero " + (totalProductos + 1));
                    int cantidad = entrada.nextInt();
                    cantidades[totalProductos] = cantidad;
                    totalProductos++;

                } else {
                    System.out.println("Inventario lleno");
                }
            } else if (opcion == 2) {
                for (int i = 0; i < totalProductos; i++) {
                    System.out.println("--------------------------");
                    System.out.println("Nombre: " + nombres[i]);
                    System.out.println("precio: " + precios[i]);
                    System.out.println("cantidad: " + cantidades[i]);
                    System.out.println("--------------------------");
                }

            } else if (opcion == 3) {
                double ValorTotal = 0;
                for (int i = 0; i < totalProductos; i++) {
                    ValorTotal += precios[i] * cantidades[i];

                }
                System.out.println("El valor total es de: " + ValorTotal + " euros");

            } else if (opcion == 4) {
                for (int i = 0; i < totalProductos; i++) {
                    if (cantidades[i] == 0) {
                        System.out.println("--------------------------");
                        System.out.println("El producto " + nombres[i] + " está fuera de stock ");
                        System.out.println("--------------------------");
                    }

                }

            } else if (opcion == 5) {
                System.out.println("saliendo del programa");
                break;

            } else {
                System.out.println("Dato introducido no valido");

            }

        } // while

    }
}
