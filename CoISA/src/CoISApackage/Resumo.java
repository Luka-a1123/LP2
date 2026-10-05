package CoISApackage;

public class Resumo {
    private String tema;
    private String conteudo;

    public Resumo(String tema, String conteudo) {
        this.tema = tema;
        this.conteudo = conteudo;

    }

    public String getTema() {
        return tema;
    }

    @Override
    public String toString() {
        String impressao = tema + ": " + conteudo;
        return impressao;

    }
}
