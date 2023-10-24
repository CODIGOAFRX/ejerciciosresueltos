import java.util.Scanner;

    public class MayorMenorNumeros {
    
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in); // Crear un objeto Scanner para la entrada del usuario.
            System.out.println("Ingrese la cantidad de números que desea comparar");
            int n = entrada.nextInt(); // Leer la cantidad de números que el usuario desea comparar.
            int mayor = Integer.MIN_VALUE; // Inicializar la variable 'mayor' con el valor mínimo posible.
            int menor = Integer.MAX_VALUE; // Inicializar la variable 'menor' con el valor máximo posible.
    
            for (int i = 1; i <= n; i++) {
                System.out.print("Ingresa el número " + i + ": ");
                int numero = entrada.nextInt(); // Leer un número ingresado por el usuario.
    
                // Usar la función Math.max para actualizar 'mayor' con el número más grande.
                mayor = Math.max(mayor, numero);
    
                // Usar la función Math.min para actualizar 'menor' con el número más pequeño.
                menor = Math.min(menor, numero);
            }
    
            // Después de recopilar todos los números, mostrar el número mayor y el número menor.
            System.out.println("El número mayor es: " + mayor);
            System.out.println("El número menor es: " + menor);
            entrada.close();
        }
        
    }

