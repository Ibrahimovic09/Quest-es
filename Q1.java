
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double capacidade;
        double tempo;
        int horas, minutos;

        System.out.print("Digite a capacidade do tanque em litros: ");
        capacidade = sc.nextDouble();

        tempo = capacidade / 1000;

        horas = (int) tempo;
        minutos = (int) Math.round((tempo - horas) * 60);

        if (minutos == 60) {
            horas++;
            minutos = 0;
        }

        System.out.printf("Tempo para encher: %d:%02d horas%n", horas, minutos);

        sc.close();
    }
}
