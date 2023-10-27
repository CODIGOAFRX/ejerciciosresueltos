import java.util.Scanner;

public class tiendatry {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int maxProductos = 100; // Tamaño máximo del inventario
        String[] nombres = new String[maxProductos];
        double[] precios = new double[maxProductos];
        int[] cantidades = new int[maxProductos];
        int TotalProductos = 0;
        while (true) {
            System.out.println("Opciones :");
            System.out.println("1.  Agregar articulo");
            System.out.println("2.  Mostrar inventario");
            System.out.println("3.  Total del inventario");
            System.out.println("4.  Productos agotados");
            System.out.println("5.  Salir");
            int opcion = entrada.nextInt();
            if (opcion == 1) {
                if (TotalProductos < maxProductos) {
                    System.out.println("Nombre del Producto:  ");
                    entrada.nextLine();
                    String nombre = entrada.nextLine();
                    System.out.println("Precio:               ");
                    double precio = entrada.nextDouble();
                    System.out.println("Cantidad:             ");
                    int cantidad = entrada.nextInt();

                    nombres[TotalProductos] = nombre;
                    precios[TotalProductos] = precio;
                    cantidades[TotalProductos] = cantidad;
                    TotalProductos++;
                } else {
                    System.out.println("Inventario lleno");
                } 
            
            }else if (opcion == 2) {
                for (int i = 0; i < TotalProductos; i++) {
                    System.out.println("Producto numero " + (i+1) + " es :  " + nombres[i]);
                    System.out.println("Su precio es "  + precios[i]);
                    System.out.println("Cantidad en stock: " + cantidades[i]);
                    System.out.println("-----------------------------");

                }
            }else if (opcion == 3) {
                double valorTotal = 0;
                for (int i = 0; i < TotalProductos; i++){
                        valorTotal += precios[i] * cantidades[i] ;
                    }
                System.out.println("El valor total del inventario es : " + valorTotal + " euros. " );
            }else if (opcion == 4) {
                for (int i = 0; i < TotalProductos; i++) {
                    if (cantidades[i] == 0){
                        System.out.println("El producto "+ nombres[i] + " está agotado ");
                    }
                }
            }else if ( opcion == 5){
                System.out.println("Saliendo del programa.");
                break;
            }else{
                System.out.println("opcion no valida");
            }
      

        }//while
    }// main
}// class
