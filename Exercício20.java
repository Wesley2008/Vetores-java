import java.util.Scanner;

public class Exercício20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num[] = new int[10];

        for(int i = 0; i <=9; i++){
            System.out.print("Digite o " + (i + 1) + "º número: ");
            num[i] = entrada.nextInt();
        }

        System.out.println("Os números positivos são: ");
        for(int numero : num){
         if(numero >= 0){
            System.out.print(" " + numero);
            numero++;
         }
        }
        entrada.close();
    }
}
