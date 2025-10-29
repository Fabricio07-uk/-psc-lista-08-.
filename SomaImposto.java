import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class SomaImposto {

    /**
     * * @param taxaImposto 
     * @param custo 
     * @return 
     */
    public static double somaImposto(double taxaImposto, double custo) {
        double taxaDecimal = taxaImposto / 100.0;
        
        double valorImposto = custo * taxaDecimal;
        
        double novoCusto = custo + valorImposto;
        
        return novoCusto;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        double custoOriginal = 0.0;
        double taxa = 0.0;
        
        System.out.println("--- Calculadora de Custo com Imposto ---");
        
        try {
            System.out.print("Informe o custo original do item (antes do imposto): R$ ");
            custoOriginal = scanner.nextDouble();
            
            System.out.print("Informe a taxa de imposto sobre vendas (em %): ");
            taxa = scanner.nextDouble();
            
            double custoComImposto = somaImposto(taxa, custoOriginal);
            
            System.out.println("\n-------------------------------------------");
            System.out.printf("Taxa de Imposto: %.1f%%\n", taxa);
            System.out.printf("Custo Original: R$ %.2f\n", custoOriginal);
            System.out.printf("Custo Final (com imposto): R$ %.2f\n", custoComImposto);
            System.out.println("-------------------------------------------");

        } catch (InputMismatchException e) {
            System.out.println("\nErro: Por favor, digite apenas números válidos.");
        } finally {
            scanner.close();
        }
    }
}