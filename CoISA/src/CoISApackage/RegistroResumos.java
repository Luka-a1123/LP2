package CoISApackage;

import java.util.Arrays;

public class RegistroResumos {
    private Resumo[] resumos;
    private int controlador;
    private int max_resumos;
    private int cadastrados;


    public RegistroResumos(int quantidade) {
        max_resumos = quantidade;
        this.resumos = new Resumo[max_resumos];
    }

    public void adiciona(String tema, String conteudo) {
        if (controlador == max_resumos) {
            controlador = 0;
        }
        this.resumos[controlador] = new Resumo(tema, conteudo);
        controlador += 1;
        if (cadastrados < max_resumos) cadastrados += 1;
    }

    public String[] pegaResumos() {
        String[] impressao = new String[cadastrados];
        for (int i = 0; i < cadastrados; i++) {
            impressao[i] = resumos[i].toString();
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

    public int conta() {return cadastrados;}

    public boolean temResumo(String tema) {
        for (int i = 0; i < cadastrados; i++) {
            if (resumos[i].getTema().equals(tema)) return true;
        }
        return false;
    }
    public String[] busca(String chaveDeBusca) {
        int tamanho = 0;
        for (int i = 0; i < cadastrados; i++) {if (resumos[i].getConteudo().toLowerCase().contains(chaveDeBusca.toLowerCase())) tamanho += 1;}
        String[] temas_encontrados = new String[tamanho];
        int controle = 0;
        for (int i = 0; i < cadastrados; i++) {
            if (resumos[i].getConteudo().toLowerCase().contains(chaveDeBusca.toLowerCase())) {
                temas_encontrados[controle] = resumos[i].getTema();
                controle += 1;
            }
        }
        Arrays.sort(temas_encontrados);
        return temas_encontrados;
    }
}
