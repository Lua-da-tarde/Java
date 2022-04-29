package exerciciodorock;

public class Comum extends Ingresso{
    protected static int contC;
    protected float somaC;
    
    public Comum(float preco) {
        super(preco);
        contC++;
    }

    @Override
    public float getPreco() {
        return preco;
    }

    @Override
    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getContC() {
        return contC;
    }

    public float getSomaC() {
        return somaC;
    }
    
    public void setSomaC(float somaC) {
        this.somaC = contC * preco;
    }
    
}
