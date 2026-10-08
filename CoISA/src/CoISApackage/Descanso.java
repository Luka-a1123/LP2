package CoISApackage;

/**
 * Rep
 */
public class Descanso {
    private int horasDescanso;
    private int nSemanas;


    public void defineHorasDescanso(int valor) {this.horasDescanso = valor;}

    public void defineNumeroSemanas(int valor) {this.nSemanas = valor;}

    public String getStatusGeral() {
        if (nSemanas > 0 && (horasDescanso / nSemanas) >= 26) {return "descansado";}
        else {return "cansado";}
    }
}
