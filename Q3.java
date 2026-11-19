
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double valorCompra;
        double percentualDesconto;
        double valorDesconto;
        double valorFinal;

        System.out.print("Digite o valor da compra: R$ ");
        valorCompra = sc.nextDouble();

        System.out.print("Digite o percentual de desconto: ");
        percentualDesconto = sc.nextDouble();

        valorDesconto = valorCompra * percentualDesconto / 100;

        valorFinal = valorCompra - valorDesconto;

        System.out.printf("Valor do desconto: R$ %.2f%n", valorDesconto);
        System.out.printf("Valor final: R$ %.2f%n", valorFinal);

        sc.close();
    }
}
