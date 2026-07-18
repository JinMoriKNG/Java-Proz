import java.util.ArrayList;
import java.util.List;

public abstract class Artista {
    private String nome;
    private int id;
    private List<Musica> musicas;

    public Artista(String nome, int id) {
        this.nome=nome;
        this.id=id;
        this.musicas=new ArrayList<>();
    }

    public void adicionarMusica(Musica musica){
        this.musicas.add(musica);
    }

    public abstract void exibirBiografia();

    public void exibirInformacoes(){
        System.out.println("Artista: " + this.nome + "\n");
        exibirBiografia();
        System.out.println();
        System.out.println("Musicas de " + this.nome);

        if (this.musicas.isEmpty()){
            System.out.println("Nenhuma musica cadastrada para este artista.");
        } else {
            for (Musica musica : this.musicas){
                System.out.println("Musica: " + musica.getMusic() + " - Views: " + musica.getViews());
            }
        }
        System.out.println();
    }

    public String getNome(){return nome;}
    public List<Musica> getMusicas(){return musicas;}
}

class Solo extends Artista {
    private String estiloMusical;

    public Solo (int id, String nome, String estiloMusical){
        super(nome, id);
        this.estiloMusical=estiloMusical;
    }

    @Override
    public void exibirBiografia() {
        System.out.println("O cantor "+getNome()+" é conhecido por seu estilo musical "+this.estiloMusical+".");
    }
}

class Banda extends Artista{
    private int numeroIntegrantes;
    private String estiloMusical;

    public Banda(int id, String nome, int numeroIntegrantes, String estiloMusical){
        super(nome, id);
        this.numeroIntegrantes=numeroIntegrantes;
        this.estiloMusical=estiloMusical;
    }

    @Override
    public void exibirBiografia() {
        System.out.println("A banda "+getNome()+" tem "+this.numeroIntegrantes+" integrantes e é conhecida por seu estilo musical "+this.estiloMusical+".");
    }
}
