public class Main{
    static void main(String[] args) {
        Artista artista1 = new Solo(1, "Michael Jackson", "Pop");
        Artista artista2 = new Banda(2, "The Beatles", 4, "Rock");

        // Musicas Michael Jackson
        Musica musica1 = new Musica(101, "Beat It", "1.9B");
        Musica musica2 = new Musica(102, "Billie Jean", "2.9B");
        Musica musica3 = new Musica(103, "Chicago", "763M");

        // Músicas dos Beatles
        Musica musica4 = new Musica(201, "Here Comes The Sun", "1.8B");
        Musica musica5 = new Musica(202, "Let It Be", "959M");
        Musica musica6 = new Musica(203, "Yesterday", "867M");

        artista1.adicionarMusica(musica1);
        artista1.adicionarMusica(musica2);
        artista1.adicionarMusica(musica3);

        artista2.adicionarMusica(musica4);
        artista2.adicionarMusica(musica5);
        artista2.adicionarMusica(musica6);

        artista1.exibirInformacoes();
        artista2.exibirInformacoes();
    }
}
