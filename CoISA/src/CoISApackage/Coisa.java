package CoISApackage;

import java.util.Arrays;

public class Coisa {
    static void main(String[] args) {
        registrarDescanso();
        System.out.println("-----");
        registrarTempoOnline();
        System.out.println("-----");
        controlarDisciplina();
        System.out.println("-----");
        registrarResumos();
        System.out.println("-----");
        procurarResumos();
        System.out.println("-----");
        controlarDisciplina2();
    }
    public static void registrarDescanso() {
        Descanso descanso = new Descanso();
        System.out.println(descanso.getStatusGeral());
        descanso.defineHorasDescanso(30);
        descanso.defineNumeroSemanas(1);
        System.out.println(descanso.getStatusGeral());
        descanso.defineHorasDescanso(26);
        descanso.defineNumeroSemanas(2);
        System.out.println(descanso.getStatusGeral());
        descanso.defineHorasDescanso(26);
        descanso.defineNumeroSemanas(1);
        System.out.println(descanso.getStatusGeral());
    }
    private static void registrarTempoOnline() {
        RegistroTempoOnline tempoLP2 = new RegistroTempoOnline("LP2", 30);
        tempoLP2.adicionaTempoOnline(10);
        System.out.println(tempoLP2.atingiuMetaTempoOnline());
        tempoLP2.adicionaTempoOnline(10);
        tempoLP2.adicionaTempoOnline(10);
        System.out.println(tempoLP2.atingiuMetaTempoOnline());
        tempoLP2.adicionaTempoOnline(2);
        System.out.println(tempoLP2.atingiuMetaTempoOnline());
        System.out.println(tempoLP2);
        RegistroTempoOnline tempoP2 = new RegistroTempoOnline("P2");
        System.out.println(tempoP2);
    }

    private static void controlarDisciplina() {
        Disciplina prog2 = new Disciplina("PROGRAMACAO 2");
        prog2.cadastraHoras(4);
        prog2.cadastraNota(1, 5.0);
        prog2.cadastraNota(2, 6.0);
        prog2.cadastraNota(3, 7.0);
        System.out.println(prog2.aprovado());
        prog2.cadastraNota(4, 10.0);
        System.out.println(prog2.aprovado());
        System.out.println(prog2);
    }

    private static void registrarResumos() {
        RegistroResumos meusResumos = new RegistroResumos(100);  // 100 resumos

        meusResumos.adiciona("Classes", "Classes definem um tipo e a base de código para criação de objetos.");
        meusResumos.adiciona("Tipo", "Identifica a semântica (operações e significados) de um conjunto de dados.");

        String[] resumos = meusResumos.pegaResumos();

        for (int i = 0; i < meusResumos.conta(); i++) {
            System.out.println(resumos[i]);
        }

        System.out.println();
        System.out.println("Resumos: ");
        System.out.println(meusResumos.imprimeResumos());
        System.out.println(meusResumos.temResumo("Classes"));
        System.out.println(meusResumos.temResumo("Objetos"));
    }
    private static void procurarResumos() {
        RegistroResumos meusResumos = new RegistroResumos(100);  // 100 resumos

        meusResumos.adiciona("Classes", "Classes definem um tipo e a base de código para criação de objetos.");
        meusResumos.adiciona("Tipo", "Identifica a semântica (operações e significados) de um conjunto de dados.");

        String chave = "UM";
        String impressao = Arrays.toString(meusResumos.busca(chave));

        System.out.println(impressao);
    }
    private static void controlarDisciplina2() {
        System.out.println("PROG 2");
        int[] pesos = {2, 4, 5, 6, 1, 2, 3, 4};
        Disciplina prog2 = new Disciplina("PROGRAMACAO 2", 8, pesos);
        prog2.cadastraHoras(4);
        prog2.cadastraNota(1, 5.0);
        prog2.cadastraNota(2, 6.0);
        prog2.cadastraNota(3, 7.0);
        prog2.cadastraNota(4, 10.0);
        prog2.cadastraNota(5, 5.0);
        prog2.cadastraNota(6, 6.0);
        prog2.cadastraNota(7, 7.0);
        prog2.cadastraNota(8, 10.0);
        System.out.println(prog2.aprovado());
        System.out.println(prog2);

        System.out.println();
        System.out.println("FMCC2");
        Disciplina fmcc2 = new Disciplina("FMCC 2", 6);
        fmcc2.cadastraHoras(20);
        fmcc2.cadastraNota(1, 5.0);
        fmcc2.cadastraNota(2, 6.0);
        fmcc2.cadastraNota(3, 7.0);
        fmcc2.cadastraNota(4, 10.0);
        fmcc2.cadastraNota(5, 5.0);
        System.out.println(fmcc2.aprovado());
        System.out.println(fmcc2);
    }
}
