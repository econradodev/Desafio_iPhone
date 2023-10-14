
public class IPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

    public static void main(String[] args) {

        AparelhoTelefonico.ligar();
        AparelhoTelefonico.atender();
        AparelhoTelefonico.iniciarCorreioVoz();

        NavegadorInternet.exibirPagina();
        NavegadorInternet.atualizarPagina();
        NavegadorInternet.adicionarNovaAba();

        ReprodutorMusical.tocar();
        ReprodutorMusical.pausar();
        ReprodutorMusical.selecionarMusica();

    }
}
