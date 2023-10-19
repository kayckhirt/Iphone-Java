public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {

    private String musicaSelecionada;
    private int numeroLigar;
    private String mensagemGravada;
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.ligarIphone();
        iphone.fazerLigacao(449999999);
        iphone.correioDeVoz("'me liga quando você ver isso'");
        iphone.desligar();

        iphone.selecionarMusica("Céu Azul");
        iphone.reproduzir();
        iphone.pausar();

        iphone.exibirPagina("www.google.com");
        iphone.adicionarNovaAba("www.youtube.com");
        iphone.atualizarPagina();

        iphone.bloquear();

    }

    public void ligarIphone() {
        System.out.println("Ligando Iphone");
    }

    public void bloquear() {
        System.out.println("Bloqueando Iphone");
    }

    public void desligarIphone() {
        System.out.println("Desligando Iphone");
    }

    // Implementando os métodos da interface
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Adicionando nova aba " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página ...");
    }

    // Implementos os métodos da interface AparelhoTelefonico
    @Override
    public void fazerLigacao(int numero) {
        this.numeroLigar = numero;
        System.out.println("Fazendo ligação para " + numeroLigar);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando ligação");
    }

    @Override
    public void correioDeVoz(String mensagem) {
        this.mensagemGravada = mensagem;
        System.out.println("Correio de voz: " + mensagemGravada);
    }

    @Override
    public void reproduzir() {
        if(musicaSelecionada == null) {
            System.out.println("Nenhuma música selecionada");
        }
        System.out.println("Reproduzindo '" + musicaSelecionada + "'");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica(String nomeMusica) {
        this.musicaSelecionada = nomeMusica;
        System.out.println("Selecionando música " + musicaSelecionada);
    }
}
