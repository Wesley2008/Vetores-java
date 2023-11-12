import java.util.Scanner;

public class Exercício02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num[] = new int[7];
        int multiplosDe2 = 0;
        int multiplosDe3 = 0;
        int multiplosDe2e3 = 0;
        for (int i = 0; i < 7; i++) {
            System.out.print("Digite o número #" + (i + 1) + ": ");
            num[i] = entrada.nextInt();
        }

        System.out.println("Números múltiplos de 2: ");
        for (int numero : num) {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
                multiplosDe2++;
            }
        }
        System.out.println("\nQuantidade de números múltiplos de 2: " + multiplosDe2);

        System.out.println("Números múltiplos de 3 :");
        for (int numero : num) {
            if (numero % 3 == 0) {
                System.out.print(numero + " ");
                multiplosDe3++;
            }
        }
        System.out.println("\nQuantidade de números múltiplos de 3: " + multiplosDe3);

        System.out.println("Números múltiplos de 2 e 3: ");
        for (int numero : num) {
            if (numero % 2 == 0 && numero % 3 == 0) {
                System.out.print(numero + " ");
                multiplosDe2e3++;
            }
        }
        System.out.println("\nQuantidade de números múltiplos de 2 e 3: " + multiplosDe2e3);
        entrada.close();
    }
        }
  
