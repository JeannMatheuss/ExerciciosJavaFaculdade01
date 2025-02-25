import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner dadoDigitado = new Scanner(System.in);

        System.out.println("Digite o Fahrenheit: ");
        double fahrenheit = dadoDigitado.nextDouble();

        double celcius = (fahrenheit - 32) * ((double) 5 / 9);

        System.out.println("A conversão de F para C é de " + celcius);
    }
}
