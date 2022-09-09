
import java.util.Date;

public class BaseDeDATOS {
    int BaseDeDatos;

    Date actualizacion;
    Double bytes;
    Date fechadeactualizacion;
    Terminos termino;
    String busqueda;
    Date registro;
    Estadistica estadisticas;
    public BaseDeDATOS(){

    }

    public BaseDeDATOS(int baseDeDatos, Date actualizacion, Double bytes, Date fechadeactualizacion, Terminos termino, String busqueda, Date registro, Estadistica estadisticas) {
        BaseDeDatos = baseDeDatos;
        this.actualizacion = actualizacion;
        this.bytes = bytes;
        this.fechadeactualizacion = fechadeactualizacion;
        this.termino = termino;
        this.busqueda = busqueda;
        this.registro = registro;
        this.estadisticas = estadisticas;
    }
}
