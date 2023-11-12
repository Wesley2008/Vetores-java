import java.util.Scanner;

public class Exercício07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double num[] = new double[10];

        for(int i = 0; i <= 9; i++){
            System.out.print("Digite o " + (i + 1) + "º número: ");
            num[i] = entrada.nextInt();
        }

         int qtdNegativos = 0;

        for(int i = 0; i <= 9; i++){
            if(num[i] < 0){
            qtdNegativos++;
            }
        }

        int soma = 0;

        for(int i = 0; i <= 9; i++){
            if(num[i] >= 0){
                soma += num[i];

            }
        }
        System.out.println("A soma dos números positivos é: " + soma);
         System.out.println("A quantidade de números negativos é: " + qtdNegativos);
        entrada.close();
    }
}