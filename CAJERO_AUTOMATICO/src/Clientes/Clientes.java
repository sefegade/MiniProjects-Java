package Clientes;

public class Clientes {

    public int cedula;
    public String nombre;
    public double saldo;
 
    public int getCedula() {
        return this.cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cedula=" + getCedula() +", Nombre=" + getNombre() +", Saldo=" + getSaldo();
    }


}
