import java.util.Scanner;

public class Exercício25 {
      public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int tam = 15;
        int[] num = new int[tam];

        System.out.println("Informe 15 números inteiros para o vetor:");
        for (int i = 0; i < tam; i++) {
            num[i] = entrada.nextInt();
        }

        int maxValue = num[0];

        for (int i = 1; i < tam; i++) {
            if (num[i] > maxValue) {
                maxValue = num[i];
            }
        }

        for (int i = 0; i < tam; i++) {
            num[i] /= maxValue;
        }

        System.out.println("Vetor após a divisão:");
        for (int i = 0; i < tam; i++) {
            System.out.print(num[i] + " ");
        }

        entrada.close();
    }
}
