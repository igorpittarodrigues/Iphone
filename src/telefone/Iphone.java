package telefone;

import internet.NavegadorInternet;
import musica.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico,ReprodutorMusical,NavegadorInternet {

    @Override
    public void exibirPagina() {
       System.out.println("Pagina exibida");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Aba aberta");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }

    @Override
    public void enviarEmail() {
        System.out.println("Enviar e-mail");
    }

    @Override
    public void tocar() {
        System.out.println("Tocar musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar musica");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionar música");
    }

    @Override
    public void ligar() {
        System.out.println("LIGAR");
    }

    @Override
    public void atender() {
        System.out.println("Atender telefone ");
    }

    @Override
    public void atenderCorreioVoz() {
        System.out.println("Atendendo correio de voz ");
    }

    @Override
    public void exibirFotos() {
       System.out.println("Exibindo fotos");
    }


    

   
    
}
