import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExchangeRateService exchangeRateService = new ExchangeRateService();
        History history = new History();
        CurrencyConverter currencyConverter = new CurrencyConverter(exchangeRateService, history);

        System.out.println("Seja bem-vindo/a ao Conversor de Moedas:");
        while (true) {
            System.out.println("1) Dólar =>> Peso Argentino");
            System.out.println("2) Peso Argentino =>> Dólar");
            System.out.println("3) Dólar =>> Real Brasileiro");
            System.out.println("4) Real Brasileiro =>> Dólar");
            System.out.println("5) Dólar =>> Peso Colombiano");
            System.out.println("6) Peso Colombiano =>> Dólar");
            System.out.println("7) Histórico de Conversões");
            System.out.println("8) Sair");
            System.out.println("\nEscolha uma Opção:");

            int option = scanner.nextInt();
            if (option == 8) {
                System.out.println("Encerrando o programa...");
                break;
            }

            String baseCurrencyCode;
            String targetCurrencyCode;
            double amount;

            switch (option) {
                case 1:
                    baseCurrencyCode = "USD";
                    targetCurrencyCode = "ARS";
                    break;
                case 2:
                    baseCurrencyCode = "ARS";
                    targetCurrencyCode = "USD";
                    break;
                case 3:
                    baseCurrencyCode = "USD";
                    targetCurrencyCode = "BRL";
                    break;
                case 4:
                    baseCurrencyCode = "BRL";
                    targetCurrencyCode = "USD";
                    break;
                case 5:
                    baseCurrencyCode = "USD";
                    targetCurrencyCode = "COP";
                    break;
                case 6:
                    baseCurrencyCode = "COP";
                    targetCurrencyCode = "USD";
                    break;
                case 7:
                    history.displayHistory();
                    continue;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    continue;
            }

            System.out.println("Digite o valor a ser convertido:");
            amount = scanner.nextDouble();

            try {
                double convertedAmount = currencyConverter.convertCurrency(baseCurrencyCode, targetCurrencyCode, amount);
                System.out.printf("Valor convertido: %.2f %s%n", convertedAmount, targetCurrencyCode);

            } catch (IOException e) {
                System.out.println("Erro ao obter a taxa de câmbio. Por favor, tente novamente mais tarde.");
            }
        }

        scanner.close();
    }
}