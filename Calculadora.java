import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== Calculadora da Loja de Plantas da Dona Gabrielinha ===");
            System.out.println("[1] - Calcular Preço Total");
            System.out.println("[2] - Calcular Troco");
            System.out.println("[3] - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    calcularPrecoTotal(scanner);
                    break;
                case 2:
                    calcularTroco(scanner);
                    break;
                case 3:
                    System.out.println("Encerrando a calculadora. Até logo, Dona Gabrielinha! 🌿");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 3);

  //      scanner.close();
    }

    // Função para calcular o preço total
    public static void calcularPrecoTotal(Scanner scanner) {
        System.out.print("Informe a quantidade de plantas: ");
        int quantidade = scanner.nextInt();

        System.out.print("Informe o preço unitário da planta (R$): ");
        double precoUnitario = scanner.nextDouble();

        double precoTotal = quantidade * precoUnitario;

        System.out.printf("➡️ Preço Total da Venda: R$ %.2f%n", precoTotal);
    }

    // Função para calcular o troco
    public static void calcularTroco(Scanner scanner) {
        System.out.print("Informe o valor pago pelo cliente (R$): ");
        double valorPago = scanner.nextDouble();

        System.out.print("Informe o valor total da compra (R$): ");
        double valorCompra = scanner.nextDouble();

        double troco = valorPago - valorCompra;

        if (troco < 0) {
            System.out.printf("❌ Valor pago insuficiente! Faltam R$ %.2f%n", Math.abs(troco));
        } else {
            System.out.printf("➡️ Troco a ser dado: R$ %.2f%n", troco);
        }
    }
}
