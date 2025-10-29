import java.util.InputMismatchException;
import java.util.Scanner;

public class GeradorPadraoSequencial {

    /**
     * 
     * * @param n 
     */
    public static void imprimirPadrao(int n) {
        if (n <= 0) {
            System.out.println("O valor de N deve ser um inteiro positivo.");
            return;
        }

        System.out.println("\n--- Padrão Gerado (N=" + n + ") ---");
        
        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            
            System.out.println();
        }
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = -1;

        System.out.println("--- Gerador de Padrão Numérico Sequencial ---");
        
        while (n <= 0) {
            try {
                System.out.print("Informe um número inteiro positivo (N): ");
                n = scanner.nextInt();
                
                if (n <= 0) {
                    System.out.println("N deve ser positivo. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                scanner.next(); 
            }
        }
        
        imprimirPadrao(n);

        scanner.close();
    }
}