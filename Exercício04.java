
import java.util.Scanner;

public class Exercício04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num[] = new int[15];

        for(int i = 0; i <= 14; i++){
            System.out.print("Digite o " + (i + 1) + "º número: ");
            num[i] = entrada.nextInt();
        }

        System.out.print("Os números iguais a 30 estão nas posições: ");
        for(int i = 0; i <=14; i++){
            if(num[i] == 30){
                System.out.print(i + " ");
        }
    }
    entrada.close();
}
}
