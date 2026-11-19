
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double valor;
        double litros;

        System.out.print("Digite o valor do abastecimento: R$ ");
        valor = sc.nextDouble();

        litros = valor / 6.69;

        System.out.printf("Litros abastecidos: %.4f litros%n", litros);

        sc.close();
    }
}
