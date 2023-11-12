import java.util.Scanner;

public class Exercício11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num[] = new int[10];
        int par[] = new int[10];
        int imp[] = new int [10];

        for(int i = 0; i <= 9; i++){
            System.out.print("Digite o " + (i + 1) + "º número: ");
            num[i] = entrada.nextInt();
        }

        System.out.println("Os números pares são: ");
        for(int i = 0; i <= 9; i++){
            if(num[i] % 2 == 0){
                System.out.println(par[i] + " ");
            }
        }

         System.out.println("Os números ímpares são: ");
        for(int i = 0; i <= 9; i++){
            if(num[i] % 2 != 0){
                System.out.println(imp[i] + " ");
            }
        }
        entrada.close();
    }
}
