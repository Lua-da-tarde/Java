package exerciciodorock;

public class Vip extends Ingresso{
    protected static int contV = 0;
    protected float somaV = 0;
    
    public Vip(float preco) {
        super(preco);
        contV++;
    }

    @Override
    public float getPreco() {
        return preco;
    }

    @Override
    public void setPreco(float preco) {
        this.preco = preco;
    }

    public static int getContV() {
        return contV;
    }

    public float getSomaV() {
        return somaV;
    }
    
    public void setSomaV(float somaV) {
        this.somaV = contV * preco;
    }
    
}
