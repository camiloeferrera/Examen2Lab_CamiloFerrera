package examen2_camiloferrera;

import java.io.Serializable;

public class ATM implements Serializable{
    private String ubicacion,id;
    private int AñoDeFabricacion, BilletesDe500 = 300, BilletesDe100 = 300;

    public ATM(String ubicacion, String id, int AñoDeFabricacion) {
        this.ubicacion = ubicacion;
        this.id = id;
        this.AñoDeFabricacion = AñoDeFabricacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }
    public String getId() {
        return id;
    }
    public int getAñoDeFabricacion() {
        return AñoDeFabricacion;
    }
    public int getBilletesDe500() {
        return BilletesDe500;
    }
    public int getBilletesDe100() {
        return BilletesDe100;
    }
    

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setAñoDeFabricacion(int AñoDeFabricacion) {
        this.AñoDeFabricacion = AñoDeFabricacion;
    }
    public void setBilletesDe500(int x) {
        this.BilletesDe500 = x;
    }
    public void setBilletesDe100(int x) {
        this.BilletesDe100 = x;
    }
    
    @Override
    public String toString() {
        return this.ubicacion;
    }
    
    
}
