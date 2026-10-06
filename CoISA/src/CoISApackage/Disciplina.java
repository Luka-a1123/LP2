package CoISApackage;

import java.util.Arrays;

public class Disciplina {
    private String nomeDisciplina;
    private int horasEstudo;
    private double[] notas = new double[4];
    private double soma;

    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public void cadastraHoras(int horas) {
        this.horasEstudo = horas;
    }

    public void cadastraNota(int nota, double valorNota) {
        this.notas[nota - 1] = valorNota;
    }

    public boolean aprovado() {
        soma = 0;
        for (int i = 0; i < 4; i++) {soma += notas[i];}
        if (soma / 4 >= 7) {return true;}
        return false;
    }

    @Override
    public String toString() {
        return nomeDisciplina + " " + horasEstudo + " " + (soma / 4) + " " + Arrays.toString(notas);


}