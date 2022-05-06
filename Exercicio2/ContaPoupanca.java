package exercicio2;

public class ContaPoupanca extends ContaBancaria{
    protected double diaRendimento;

    public ContaPoupanca(double diaRendimento, String cliente, int numConta, double saldo) {
        super(cliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }
    
    public double getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }
    
    public double rendimento(double taxa){
        saldo = saldo + (saldo * taxa);
        return saldo;
    }
    
}
