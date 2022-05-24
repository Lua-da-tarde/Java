package exarea;

public class Retangulo implements AreaCalcuavel{
    protected double largura;
    protected double comprimento;

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public Retangulo(double largura, double comprimento) {
        this.largura = largura;
        this.comprimento = comprimento;
    }  
    
    @Override
    public double calcularArea(){
        if(largura <= 0 || comprimento <= 0)
            throw new IllegalArgumentException("“Valor inválido, o valor esperado é maior que 0 (zero) " + largura + " e " + comprimento);
        if (largura == comprimento)
            throw new IllegalArgumentException("“Valor inválido, modifique um dos valores a fim de torná-los diferentes " + largura + " e " + comprimento);
        else
        return largura * comprimento;
    }
}
