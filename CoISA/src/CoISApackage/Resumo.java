package CoISApackage;

public class Resumo {
    private String tema;
    private String conteudo;

    public Resumo(String tema, String conteudo) {
        this.tema = this.tema;
        this.conteudo = this.conteudo;

    }

    public String getTema() {
        return tema;
    }
    public String getResumo() {
        return conteudo;
    }
    @Override
    public String toString() {
        String impressao = tema + ": " + conteudo;
        return impressao;

    }
}
