package CoISApackage;

public class RegistroResumos {
    private Resumo[] resumos;
    private int controlador;
    private int max_resumos;
    private int cadastrados;

    public RegistroResumos(int quantidade) {
        max_resumos = quantidade;
        Resumo[] resumos = new Resumo[max_resumos];
    }

    public void adiciona(String tema, String conteudo) {
        private boolean limite_atingido = false;
        if (controlador == max_resumos) {
            controlador = 0;
            limite_atingido = true
        }
        resumos[controlador] = new Resumo(tema, conteudo);
        controlador += 1;
        if (limite_atingido = false) cadastrados += 1;
    }

    public String[] pegaResumos() {
        String[] impressao = new String[cadastrados];
        for (int i = 0; i < cadastrados; i++) {
            impressao[i] = resumos[i].toString() + "\n";
        }
        return impressao;
    }

    public String imprimeResumos() {
        String impressao = "- " + conta() + " Resumo(s) cadastrado(s)\n" + "- ";

        if (cadastrados >= 0) impressao += resumos[0].getTema();
        for (int i = 1; i < cadastrados; i++) {
            impressao += (" | " + resumos[i].getTema());
        }
        return impressao;
    }

    public int conta() {
        return cadastrados;
    }

    public boolean temResumo(String tema) {
        for (int i = 0; i < cadastrados; i++) {
            if (resumos[i].getTema().equals(tema)) return true;
        }
    }
}
