package exarray;

public class Corrente extends Conta{
    protected int limite;

    public Corrente(int limite, double saldo, String cliente) {
        super(saldo, cliente);
        this.limite = limite;
    }
    
    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }
    
    @Override
    public void mostra(){
        System.out.println("é corrente");
    }
}
    
    
