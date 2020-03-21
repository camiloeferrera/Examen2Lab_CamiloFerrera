
package examen2_camiloferrera;

import java.io.Serializable;
import java.util.ArrayList;

public class Cliente extends Usuario implements Serializable {
    private ArrayList <Cuenta> cuentas = new ArrayList();

    public Cliente(String usuario, String contraseña, String pnombre, String snombre, String papellido, String sapellido, String id, int añodenacimiento, int añoafiliacion) {
        super(usuario, contraseña, pnombre, snombre, papellido, sapellido, id, añodenacimiento, añoafiliacion);
    }

    

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }
    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
    
    

    

    
    
}
