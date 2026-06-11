
public class Produto {
    private int codigo;
    private String produto;
    private String categoria;
    private double preco;
    private int quantidade;
    private boolean disponivel;

    public Produto(int codigo, String produto, String categoria, double preco, int quantidade) {
        this.codigo = codigo;
        this.produto = produto;
        this.categoria = categoria;
        this.preco = preco;
        this.quantidade = quantidade;
        this.disponivel = true;
    }

    public void exibirInformacoes() {
        System.out.println("Código: " + codigo);
        System.out.println("Produto: " + produto);
        System.out.println("Categoria: " + categoria);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Disponível: " + disponivel);
    }

    public void verificarDisponibilidade() {
        if(disponivel && quantidade > 0) {
            System.out.println("Status: Disponivel");
            System.out.println("Este produto pode ser vendido");
        } else {
            System.out.println("Status: Indisponivel");
            System.out.println("Este produto não pode ser vendido");
        }
    }

    public void bonusSalarial() {
        if(disponivel && preco <= 100) {
            System.out.println("O produto " + produto + " pode receber um desconto especial!");
        } else {
            System.out.println("O produto " + produto + " não pode receber um desconto especial.");
        }
    }
}
