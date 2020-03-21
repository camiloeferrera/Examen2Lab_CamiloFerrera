package examen2_camiloferrera;

import java.io.Serializable;
import java.util.ArrayList;

public class Usuario implements Serializable{
    private String usuario,contraseña,pnombre,snombre,papellido,sapellido,id;
    private int añodenacimiento,añoafiliacion;
    private ArrayList<Transaccion> transacciones = new ArrayList();

    public Usuario(String usuario,String contraseña, String pnombre, String snombre, String papellido, String sapellido, String id, int añodenacimiento, int añoafiliacion) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.pnombre = pnombre;
        this.snombre = snombre;
        this.papellido = papellido;
        this.sapellido = sapellido;
        this.id = id;
        this.añodenacimiento = añodenacimiento;
        this.añoafiliacion = añoafiliacion;
    }

    public String getUsuario() {
        return usuario;
    }
    public String getContraseña() {
        return contraseña;
    }
    public String getPrimerNombre() {
        return pnombre;
    }
    public String getSegundoNombre() {
        return snombre;
    }
    public String getPrimerApellido() {
        return papellido;
    }
    public String getSegundoApellido() {
        return sapellido;
    }
    public String getId() {
        return id;
    }
    public int getAñoDeNacimiento() {
        return añodenacimiento;
    }
    public int getAñoAfiliacion() {
        return añoafiliacion;
    }
    public ArrayList<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public void setPrimerNombre(String pnombre) {
        this.pnombre = pnombre;
    }
    public void setSegundoNombre(String snombre) {
        this.snombre = snombre;
    }
    public void setPrimerApellido(String papellido) {
        this.papellido = papellido;
    }
    public void setSegundoApellido(String sapellido) {
        this.sapellido = sapellido;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setAñoDeNacimiento(int añodenacimiento) {
        this.añodenacimiento = añodenacimiento;
    }
    public void setAñoAfiliacion(int añoafiliacion) {
        this.añoafiliacion = añoafiliacion;
    }
    public void setTransacciones(ArrayList<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    @Override
    public String toString() {
        return this.usuario;
    }
    
    
       
}