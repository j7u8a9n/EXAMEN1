
import java.util.Date;

public class Documento {
    int Documento;
    list<Lista> Registro;
    int numero;
    String palabra;
    list<url> Enlace;
    Date registro;
    list<Lista> Temas;
    Date basededatos;
    Date actualizaciondedocumento;
    Date estadisticas;
    public Documento(){

    }

    public Documento(int documento, list<Lista> registro, int numero, list<url> enlace, Date registro1, list<Lista> temas, Date basededatos, Date actualizaciondedocumento, Date estadisticas) {
        Documento = documento;
        Registro = registro;
        this.numero = numero;
        Enlace = enlace;
        this.registro = registro1;
        Temas = temas;
        this.basededatos = basededatos;
        this.actualizaciondedocumento = actualizaciondedocumento;
        this.estadisticas = estadisticas;
    }
}
