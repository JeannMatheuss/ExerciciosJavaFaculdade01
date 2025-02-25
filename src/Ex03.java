import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner dadoDigitado = new Scanner(System.in);

        // Input for the first value
        System.out.println("Digite o primeiro valor: ");
        double valor1 = dadoDigitado.nextDouble();

        // Consume the leftover newline character
        dadoDigitado.nextLine();

        // Input for the operator
        System.out.println("Digite o operador (+, -, *, /): ");
        String operador = dadoDigitado.nextLine();

        // Input for the second value
        System.out.println("Digite o segundo valor: ");
        double valor2 = dadoDigitado.nextDouble();

        double resultado = 0;

        // Perform the operation based on the operator
        switch (operador) {
            case "+":
                resultado = valor1 + valor2;
                break;
            case "-":
                resultado = valor1 - valor2;
                break;
            case "*":
                resultado = valor1 * valor2;
                break;
            case "/":
                if (valor2 != 0) {
                    resultado = valor1 / valor2;
                } else {
                    System.out.println("Erro: Divisão por zero!");
                    return; // exit the program
                }
                break;
            default:
                System.out.println("Operador inválido!");
                return; // exit the program
        }

        // Output the result
        System.out.println("O resultado é: " + resultado);
    }
}
