import java.util.Scanner;

public class Exercício13{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double somaNotas = 0, mediaNotas = 0;
        String nomes[] = new String[8];
        double notas[] = new double[8];

        for(int i = 0; i<= 7; i++){
        System.out.print("Informe o nome do(a) " +(i + 1)+ "º aluno(a): ");
        nomes[i] = entrada.next();

        System.out.print("Informe a nota de " +nomes[i]+ ": ");
        notas[i] = entrada.nextDouble();
        }
        for(int i = 0; i <= 7; i++){
            somaNotas += notas[i];
        }
        
        mediaNotas = somaNotas / 8;

         System.out.print("A média da sala é: "+mediaNotas);
        entrada.close();
    }
}