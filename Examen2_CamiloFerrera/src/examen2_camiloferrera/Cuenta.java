package examen2_camiloferrera;

import java.io.Serializable;

public class Cuenta implements Serializable {
    private long NumeroDeCuenta;
    private long saldo = 0;

    public Cuenta(long NumeroDeCuenta) {
        this.NumeroDeCuenta = NumeroDeCuenta;
    }

    public long getNumeroDeCuenta() {
        return NumeroDeCuenta;
    }
    public long getSaldo() {
        return saldo;
    }

    public void setNumeroDeCuenta(long NumeroDeCuenta) {
        this.NumeroDeCuenta = NumeroDeCuenta;
    }
    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

    
    @Override
    public String toString() {
        return Long.toString(this.NumeroDeCuenta);
    }
    
    
}
