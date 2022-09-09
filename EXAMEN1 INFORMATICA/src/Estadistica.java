import java.util.Date;

public class Estadistica {
    String busqueda;
    Date registo;
    int numerodedocumentos;

    public Estadistica() {

    }

    public Estadistica(String busqueda, Date registo, int numerodedocumentos) {
        this.busqueda = busqueda;
        this.registo = registo;
        this.numerodedocumentos = numerodedocumentos;
    }
}
