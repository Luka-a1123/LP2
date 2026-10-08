package CoISApackage;

import java.util.Arrays;

public class Disciplina {
    private String nomeDisciplina;
    private int horasEstudo;
    private static int nNotas;
    private double[] notas;
    private static int[] pesos = {1, 1, 1, 1};
    private double media;

    public Disciplina(String nomeDisciplina, int nNotas, int[] pesos) {
        this.nomeDisciplina = nomeDisciplina;
        this.nNotas = nNotas;
        this.notas = new double[nNotas];
        this.pesos = pesos;
    }
    public Disciplina(String nomeDisciplina, int nNotas) {
        this(nomeDisciplina, nNotas, pesos);
    }

    public Disciplina(String nomeDisciplina) {
        this(nomeDisciplina, 4, pesos);
    }

    public void cadastraHoras(int horas) {
        this.horasEstudo = horas;
    }

    public void cadastraNota(int nota, double valorNota) {
        this.notas[nota - 1] = valorNota;
    }

    public boolean aprovado() {
        int soma_pesos = 0;
        double soma_notas = 0;
        for (int i = 0; i < pesos.length; i++) {soma_pesos += pesos[i];}
        for (int i = 0; i < nNotas; i++) {soma_notas += notas[i] * pesos[i];}

        this.media = soma_notas / soma_pesos;

        if (media >= 7) return true;
        return false;
    }

    @Override
    public String toString() {
        String printmedia = String.format("%.1f", media);
        return nomeDisciplina + " " + horasEstudo + " " + printmedia + " " + Arrays.toString(notas);
    }

}