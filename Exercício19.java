import java.util.Scanner;

public class Exercício19 {
  public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tam = 10;
        int[] num1 = new int[tam];
        int[] num2 = new int[tam];
        int[] result = new int[2 * tam];

        int i;

        System.out.println("Informe 10 números inteiros para o primeiro vetor: ");
        for (i = 0; i < tam; i++) {
            System.out.println("Insira o " +(i + 1)+ "º numero:");
            num1[i] = entrada.nextInt();
        }

        System.out.println("Informe 10 números inteiros para o segundo vetor: ");
        for (i = 0; i < tam; i++) {
            System.out.println("Insira o " +(i + 1)+ "º numero:");
            num2[i] = entrada.nextInt();
        }

        for (i = 0; i < tam; i++) {
            result[i] = num1[i] * num2[i];
        }


        System.out.println("O valor da multiplicação é: ");
        for (i = 0; i < tam; i++) {
            System.out.println("Posição " +(i + 1)+ ": " +result[i]);
        }
        entrada.close();
    }   
}
