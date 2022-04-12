package exercicio2;

public class ContaPoupanca extends ContaBancaria{
    protected int diaRendimento;

    public ContaPoupanca(int diaRendimento, String cliente, int numConta, double saldo) {
        super(cliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }
    
    public int getDiaRendimento() {
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
