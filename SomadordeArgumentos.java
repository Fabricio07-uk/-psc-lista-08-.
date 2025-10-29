import java.util.InputMismatchException;
import java.util.Scanner;

public class SomadordeArgumentos {

    /**
     
     * * @param num1 
     * @param num2 
     * @param num3 
     * @return 
     */
    public static int somarTresArgumentos(int num1, int num2, int num3) {

        return num1 + num2 + num3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = 0, b = 0, c = 0;
        
        System.out.println("--- Calculadora de Soma Simples ---");
        
        try {
            System.out.print("Digite o primeiro número (A): ");
            a = scanner.nextInt();
            
            System.out.print("Digite o segundo número (B): ");
            b = scanner.nextInt();
            
            System.out.print("Digite o terceiro número (C): ");
            c = scanner.nextInt();
            
            int resultado = somarTresArgumentos(a, b, c);
            
            System.out.println("\n---------------------------------");
            System.out.printf("A soma de %d, %d e %d é: %d\n", a, b, c, resultado);
            System.out.println("---------------------------------");

        } catch (InputMismatchException e) {
            System.out.println("\nErro: Por favor, digite apenas números inteiros.");
        } finally {
            scanner.close();
        }
    }
}