import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // lista para guardar todos os produtos criados dentro do laço
        List<Produto> produtos = new ArrayList<>();

        // variável para manter uma referência do primeiro produto (se quisermos exibi-lo depois)
        Produto primeiroProduto = null;

        for(int i = 1; i <= 2; i++) {
            System.out.println("=== Produto " + i + " ===");
            System.out.println("Digite o código do produto: ");
            int codigo = entrada.nextInt();
            entrada.nextLine();

            System.out.println("Digite o nome do produto: ");
            String nomeProduto = entrada.nextLine();

            System.out.println("Digite a categoria do produto: ");
            String categoria = entrada.nextLine();

            System.out.println("Digite o preço do produto: ");
            double preco = entrada.nextDouble();
            entrada.nextLine();

            System.out.println("Digite a quantidade do produto: ");
            int quantidade = entrada.nextInt();
            entrada.nextLine();

            Produto produto = new Produto(codigo, nomeProduto, categoria, preco, quantidade);
            produto.exibirInformacoes();
            produto.verificarDisponibilidade();
            produto.bonusSalarial();
            // adiciona o produto criado à lista
            produtos.add(produto);
            // guarda referência do primeiro produto
            if (i == 1) {
                primeiroProduto = produto;
            }
        }
        // exibe novamente informações do primeiro produto (se existir)
        if (primeiroProduto != null) {
            System.out.println("\nInformações do Produto 1:");
            primeiroProduto.exibirInformacoes();
        }

        // exibe todos os produtos armazenados na lista
        System.out.println("\n=== Todos os produtos cadastrados ===");
        int idx = 1;
        for (Produto p : produtos) {
            System.out.println("--- Produto " + idx + " ---");
            p.exibirInformacoes();
            p.verificarDisponibilidade();
            p.bonusSalarial();
            idx++;
        }

        entrada.close();
    }
}