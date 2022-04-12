package exercicio2;

public class ContaBancaria {
    protected String cliente;
    protected int numConta;
    protected double saldo;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ContaBancaria(String cliente, int numConta, double saldo) {
        this.cliente = cliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }
    
    public double sacar(double saque, double novoSaldo){
        novoSaldo = saldo - saque;
        if(saque<0){
            System.out.println("Saque não pode ser negativo!!");
        }
        else{
            if(novoSaldo<0)
                System.out.println("Saque é maior que saldo, pobre.");
        }
        return saldo;
    }
    
    public double depositar(double deposito){
        saldo += deposito;
        return saldo;
    }
    
}
