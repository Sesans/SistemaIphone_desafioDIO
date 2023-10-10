public class Iphone implements NavegadorInternet, Telefone, ReprodutorMusical{
     String nomeUsuario;
     String emailUsuario;

    @Override
    public void adicionarNovaPagina(String dominioSite){
        System.out.println("abrindo pagina: " + dominioSite);
    }
    @Override
    public void exibirPagina(String dominioSite){
        System.out.println("Paginas abertas");
        System.out.println(" ");
    }
    @Override
    public void atualizarPagina() {
    }
    @Override
    public void ligar(int numero) {
    }
    @Override
    public void atender() {
    }
    @Override
    public void iniciarCorreioVoz() {
    }
    @Override
    public void tocar() {
    }
    @Override
    public void pausar() {
    }
    @Override
    public void selecionarMusica(String nomeMusica) {
    }
    @Override
    public void adicionarMusica(String nomeMusica) {
    }
    public void exibir(){
        System.out.println("-------------Tela Inicial-------------");
        System.out.println("Selecione a ação desejada");
        System.out.println("1- Ligar para um número;");
        System.out.println("2- Atender uma ligação;");
        System.out.println("3- Iniciar correio de voz;");
        System.out.println("4- Exibir pagina do navegador;");
        System.out.println("5- Adicionar pagina no navegador;");
        System.out.println("6- Atualizar paginas no navegador;");
        System.out.println("7- Tocar musica;");
        System.out.println("8- Pausar musica;");
        System.out.println("9- Adicionar musica à playlist;");
        System.out.println("10- Selecionar musica da playlist;");
    }
}
