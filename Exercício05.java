import java.util.Scanner;

public class Exercício05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int logica[] = new int[15];
        int linguagem[] = new int[10];

        for(int i = 0; i <=14; i++){
            System.out.print("Digite o número da " + (i + 1) + "º matrícula da disciplina de lógica: ");
            logica[i] = entrada.nextInt();
        }

        System.out.println();

        for(int j = 0; j <=9; j++){
            System.out.print("Digite o número da " + (j + 1) + "º matrícula da disciplina de linguagem: ");
            linguagem[j] = entrada.nextInt();
        }

        System.out.println();

         System.out.println("\nOs números das matrículas de lógica são: ");
        for(int i = 0; i <=14; i++){
            System.out.print(logica[i] + " ");
        }

        System.out.println();

         System.out.println("\nOs números das matrículas de linguagem são: ");
        for(int j = 0; j <=9; j++){
            System.out.print(linguagem[j] + " ");
        }
        entrada.close();
    }
}