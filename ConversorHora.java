import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;

public class ConversorHora {

    public static int converterHora(int hora24, char[] periodo) {
        if (hora24 == 0) {
            periodo[0] = 'A';
            return 12;
        } else if (hora24 < 12) {
            periodo[0] = 'A';
            return hora24;
        } else if (hora24 == 12) {
            periodo[0] = 'P';
            return 12;
        } else {
            periodo[0] = 'P';
            return hora24 - 12;
        }
    }

    public static void exibirConversao(int hora12, int minuto, char periodo) {
        String sufixo = (periodo == 'A') ? "A.M." : "P.M.";
        System.out.printf("Hora convertida: %d:%02d %s\n", hora12, minuto, sufixo);
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        String continuar = "S";

        System.out.println("--- Conversor de Notação de Hora (24h para 12h) ---");

        while (continuar.equalsIgnoreCase("S")) {
            int hora24 = -1;
            int minuto = -1;
            
            try {
                System.out.print("\nInforme a hora (0-23): ");
                hora24 = scanner.nextInt();
                
                System.out.print("Informe os minutos (0-59): ");
                minuto = scanner.nextInt();
                scanner.nextLine();

                if (hora24 < 0 || hora24 > 23 || minuto < 0 || minuto > 59) {
                    System.out.println("Erro: Hora ou minuto inválido(s). Tente novamente.");
                    continue;
                }

                char[] periodo = new char[1];
                
                int hora12 = converterHora(hora24, periodo);
                
                exibirConversao(hora12, minuto, periodo[0]);

            } catch (InputMismatchException e) {
                System.out.println("Erro: Por favor, digite apenas números inteiros.");
                scanner.nextLine();
                continue;
            }

            System.out.print("\nDeseja repetir o cálculo (S/N)? ");
            continuar = scanner.nextLine();
        }

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}