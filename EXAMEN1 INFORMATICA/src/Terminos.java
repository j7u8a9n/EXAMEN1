public class Terminos {
    String palabras;
    int palabrasnumero;
    String basededatos;
    Double Tamañodelapalabra;
    int frecuenciadepalabra;
    Tema tema;
    public Terminos(){

    }

    public Terminos(String palabras, int palabrasnumero, String basededatos, Double tamañodelapalabra, int frecuenciadepalabra, Tema tema) {
        this.palabras = palabras;
        this.palabrasnumero = palabrasnumero;
        this.basededatos = basededatos;
        Tamañodelapalabra = tamañodelapalabra;
        this.frecuenciadepalabra = frecuenciadepalabra;
        this.tema = tema;
    }
}
