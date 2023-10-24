public class SumaImpares {

    public static void main(String[] args) {
    int numero = 0;
        for (int i = 1; i<= 100; i++) {
           
            if (i %2 != 0){
                numero += i; // esto se puede hacer poniendo != para decir cuando sea distinto o usar el else de debajo y ya.

            }else{
            }
        }
        System.out.println("la suma de todos los numeros impares es: " + numero );
        
    }
}
