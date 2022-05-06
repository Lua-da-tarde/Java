package exarray;

public class Poupanca extends Conta{
    protected static int diaRendimento = 5;

    public static int getDiaRendimento() {
        return diaRendimento;
    }

    public static void setDiaRendimento(int diaRendimento) {
        Poupanca.diaRendimento = diaRendimento;
    }

    public Poupanca(double saldo, String cliente) {
        super(saldo, cliente);
    }  
}