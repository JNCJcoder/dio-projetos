package Celular;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet
{
    @Override
    public void ligar(String numero)
    {
        // Liga para o numero especificado.
    }

    @Override
    public void atender(String numero)
    {
        // Atende a Ligação do numero especificado.
    }

    @Override
    public void iniciarCorreioVoz(String mensagem, String destinatario)
    {
        // Inicia um correio de voz.
    }

    @Override
    public void exibirPagina(String url)
    {
        // Exibe pagina especificada no URL.
    }

    @Override
    public void adicionarNovaAba(String url)
    {
        // Abre uma nova aba com o url especificado.
    }

    @Override
    public void atualizarPagina()
    {
        // Atualiza a pagina.
    }

    @Override
    public void tocar()
    {
        // Toca musica.
    }

    @Override
    public void pausar()
    {
        // Pausa musica.
    }

    @Override
    public void selecionarMusica()
    {
        // Seleciona uma musica.
    }
}