package exercicio2;

public class ContaEspecial extends ContaBancaria{
    protected float limite;

    public ContaEspecial(float limite, String cliente, int numConta, double saldo) {
        super(cliente, numConta, saldo);
        this.limite = limite;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
    
    @Override
    public double sacar(double saque, double novoSaldo){
        double x;
        novoSaldo = saldo - saque;
        x = saldo + limite;
        if(x<0){
            System.out.println("Erro.");
        }
        else{
            if(saque>saldo){
                saldo = 0;
                limite = (float) (limite - (saque - saldo));
            }
            else {
                saldo -= saque;
            }
        }
        return saldo;
    }
    
}
