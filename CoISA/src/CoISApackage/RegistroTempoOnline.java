package CoISApackage;

public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int tempoOnline;
    private int tempoEsperado;

    public RegistroTempoOnline(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoEsperado = 120;
    }
    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoEsperado = tempoOnlineEsperado;
    }
    public void adicionaTempoOnline(int tempo) {
        this.tempoOnline += tempo;
    }
    public boolean atingiuMetaTempoOnline() {
        if (tempoOnline >= tempoEsperado) return true;
        return false;
    }
    @Override
    public String toString() {
        String impressao = nomeDisciplina + " " + tempoOnline + "/" + tempoEsperado;
        return impressao;

    }
}
