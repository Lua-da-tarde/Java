package exarray;

public class Conta {
    protected double saldo;
    protected String cliente;

    public Conta(double saldo, String cliente) {
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    public void mostra(){
        System.out.println("é uma conta");
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
