import java.util.Scanner;

public class Exercício01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num[] = new int[6];
        int par = 0;
        int impar = 0;

        for (int i = 0; i <= 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            num[i] = entrada.nextInt();
        }

        System.out.println("Os números pares são: ");
        for (int numero : num) {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
                par++;
            }
        }

        System.out.println("\nQuantidade de números pares é: " + par);

        System.out.println("Os números ímpares são:");
        for (int numero : num) {
            if (numero % 2 != 0) {
                System.out.print(numero + " ");
                impar++;
            }
        }

        System.out.println("\nQuantidade de números ímpares é: " + impar);
          entrada.close();
    }
}

