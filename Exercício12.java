import java.util.Scanner;

public class Exercício12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num[] = new int[5];

        for(int i = 0; i <= 4; i++){
            System.out.print("Digite o " + (i + 1) + "º número: ");
            num[i] = entrada.nextInt();
        }

        int soma = 0;
        for(int numero : num){
            soma += numero;
        }
         System.out.println("Os números digitados foram: ");
         for(int i = 0; i <=4; i++){
            System.out.print(num[i]);
            if (i < 4){
                System.out.print(" + ");
            }
         }

         System.out.println(" = " + soma);
         entrada.close();
    }
}
