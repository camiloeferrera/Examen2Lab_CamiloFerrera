package examen2_camiloferrera;

import java.io.Serializable;
import java.util.Date;

public class Transaccion implements Serializable {
    private long NumeroDeCuenta;
    private String descripcion, id;
    private Date fecha;

    public Transaccion(long NumeroDeCuenta, String descripcion, String id, Date fecha) {
        this.NumeroDeCuenta = NumeroDeCuenta;
        this.descripcion = descripcion;
        this.id = id;
        this.fecha = fecha;
    }

    public long getNumeroDeCuenta() {
        return NumeroDeCuenta;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public String getId() {
        return id;
    }
    public Date getFecha() {
        return fecha;
    }

    public void setNumeroDeCuenta(long NumeroDeCuenta) {
        this.NumeroDeCuenta = NumeroDeCuenta;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Transaccion{" + "NumeroDeCuenta=" + NumeroDeCuenta + ", descripcion=" + descripcion + ", id=" + id + ", fecha=" + fecha + '}';
    }
   
    
}
