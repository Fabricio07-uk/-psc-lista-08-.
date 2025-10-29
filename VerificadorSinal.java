import java.util.InputMismatchException;
import java.util.Scanner;

public class VerificadorSinal {

    /**
     * * @param numero 
     * @return 
     */
    public static char verificarSinal(int numero) {

        if (numero > 0) {
            return 'P'; 
        } else {
            return 'N'; 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor = 0;
        
        System.out.println("--- Verificador de Sinal ---");
        
        try {
            System.out.print("Digite um número inteiro: ");
            valor = scanner.nextInt();
            
            char resultado = verificarSinal(valor);
            
            System.out.println("\n---------------------------------");
            System.out.printf("O número digitado (%d) é: %c\n", valor, resultado);
            System.out.println("---------------------------------");

        } catch (InputMismatchException e) {
            System.out.println("\nErro: Por favor, digite apenas números inteiros.");
        } finally {
            scanner.close();
        }
    }
}