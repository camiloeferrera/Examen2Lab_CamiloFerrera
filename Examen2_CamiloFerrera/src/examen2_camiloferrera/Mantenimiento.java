package examen2_camiloferrera;

import java.io.Serializable;
import java.util.ArrayList;

public class Mantenimiento extends Usuario implements Serializable {
    ArrayList<ATM> atms = new ArrayList();

    public Mantenimiento(String usuario, String contraseña, String pnombre, String snombre, String papellido, String sapellido, String id, int añodenacimiento, int añoafiliacion) {
        super(usuario, contraseña, pnombre, snombre, papellido, sapellido, id, añodenacimiento, añoafiliacion);
    }


    public ArrayList<ATM> getAtms() {
        return atms;
    }
    public void setAtms(ArrayList<ATM> atms) {
        this.atms = atms;
    }
    
    
}
