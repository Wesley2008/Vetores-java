import java.util.Scanner;

public class Exercício08{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Inicialização dos vetores
        String[] nomes = new String[7];
        double[] medias = new double[7];

        // Preenchendo os vetores com nomes e médias dos alunos
        for (int i = 0; i < 7; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = entrada.next();
            System.out.print("Digite a média final do aluno " + (i + 1) + ": ");
            medias[i] = entrada.nextDouble();
        }

        // Encontrar o aluno com a maior média
        String melhorAluno = "";
        double maiorMedia = 0;

        for (int i = 0; i < 7; i++) {
            if (medias[i] > maiorMedia) {
                melhorAluno = nomes[i];
                maiorMedia = medias[i];
            }
        }

        System.out.println("O aluno com a maior média é: " + melhorAluno + " com média " + maiorMedia);

        // Calcular a média necessária no exame final para aprovação
        for (int i = 0; i < 7; i++) {
            if (medias[i] < 7) {
                double mediaNecessaria = 5 - medias[i];
                System.out.println("O aluno " + nomes[i] + " precisa tirar " + mediaNecessaria + " no exame final para ser aprovado.");
            }
        }
        entrada.close();
    }
}