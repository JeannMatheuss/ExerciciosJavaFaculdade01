import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner dadoDigitado = new Scanner(System.in);

        System.out.println("Digite o comprimento: ");
        double comprimento = dadoDigitado.nextDouble();

        System.out.println("Digite a largura: ");
        double largura = dadoDigitado.nextDouble();

        double area = comprimento * largura;

        System.out.println("A área do terreno é: " + area);
    }
}
