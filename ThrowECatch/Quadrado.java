package exarea;

public class Quadrado implements AreaCalcuavel{
    protected double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public Quadrado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public double calcularArea(){
        if(lado <= 0)
            throw new IllegalArgumentException("“Valor inválido, o valor esperado é maior que 0 (zero) " + lado);
        else
        return lado * lado;
    }
}
