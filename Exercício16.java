import java.util.Scanner;

public class Exercício16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double preco[] = new double[5];
        String nome[] = new String[5];

        for(int i = 0; i <= 4; i++){
            System.out.print("Digite o nome do " + (i + 1) + "º produto: ");
            nome[i] = entrada.next();
            System.out.print("Digite o preço do " + nome[i] + ": ");
            preco[i] = entrada.nextDouble();
        }

        int qtdProdutoMenor50 = 0;
        for(int i = 0; i <= 4; i++){
            if(preco[i] < 50){
                qtdProdutoMenor50++;
            }
        }

        for(int i = 0; i <= 4; i++){
            if((preco[i] >= 50) && (preco[i] <= 100)){
            }
        }

        System.out.println("A quantidade de produtos com preço inferior a R$ 50,00: " + qtdProdutoMenor50 + " produto(s).");
         System.out.println("O nome dos produtos com preço entre R$ 50,00 e R$ 100,00: " + nome);
         entrada.close();
    }
}
