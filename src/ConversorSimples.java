import java.util.Scanner;

public class ConversorSimples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== Conversor Simples ===");
            System.out.println("1. Conversor de Moedas");
            System.out.println("2. Conversor de Temperaturas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    converterMoeda(scanner);
                    break;
                case 2:
                    converterTemperatura(scanner);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }

    public static void converterMoeda(Scanner scanner) {
        System.out.print("Digite o valor em Reais (BRL): R$ ");
        double valorBRL = scanner.nextDouble();

        double cotacaoUSD = 5.8553;  // Simulação de cotação
        double valorUSD = valorBRL / cotacaoUSD;
        double cotacaoEUR = 6.601;
        double valorEUR = valorBRL/cotacaoEUR;

        System.out.printf("Equivale a aproximadamente: $ %.2f USD\n", valorUSD);
        System.out.printf("Equivale a aproximadamente: $ %.2f EUR\n", valorEUR);
    }

    public static void converterTemperatura(Scanner scanner) {
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;

        System.out.printf("Fahrenheit: %.2f °F\n", fahrenheit);
        System.out.printf("Kelvin: %.2f K\n", kelvin);
    }
}
