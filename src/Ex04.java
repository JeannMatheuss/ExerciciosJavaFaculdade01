import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o total gasto pelo cliente
        System.out.println("Digite o total gasto pelo cliente: ");
        double totalGasto = scanner.nextDouble();

        // Exibe as opções de pagamento
        System.out.println("Escolha uma opção de pagamento:");
        System.out.println("1 - À vista com 10% de desconto");
        System.out.println("2 - Em 2 vezes (preço da etiqueta)");

        // Solicita a opção desejada
        int opcao = scanner.nextInt();

        // Calcula e imprime o resultado com base na opção escolhida
        switch (opcao) {
            case 1:
                // À vista com 10% de desconto
                double valorComDesconto = totalGasto - (totalGasto * 0.10);
                System.out.println("Você escolheu pagar à vista. O valor com 10% de desconto é: R$ " + valorComDesconto);
                break;
            case 2:
                // Em 2 vezes (preço da etiqueta)
                double parcela = totalGasto / 2;
                System.out.println("Você escolheu pagar em 2 vezes. O valor das prestações será de R$ " + parcela + " cada.");
                break;
            default:
                System.out.println("Opção inválida!");
        }

        // Fecha o scanner
        scanner.close();
    }
}
