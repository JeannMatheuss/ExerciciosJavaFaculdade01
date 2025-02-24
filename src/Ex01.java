import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner dado_digitado = new Scanner(System.in);

        System.out.println("Digite um valor em metros: ");
        double valorMetro = dado_digitado.nextDouble();

        double metroParaCentimetro = valorMetro / 100;

        System.out.println("Valor em Centimetro: " + metroParaCentimetro);

        double metroParaMilimetro = valorMetro / 1000;

        System.out.println("Valor em Milimetro: " + metroParaMilimetro);
    }
}
