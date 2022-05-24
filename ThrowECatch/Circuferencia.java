package exarea;

public class Circuferencia implements AreaCalcuavel{
    protected double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public Circuferencia(double raio) {
        this.raio = raio;
    }
    
    @Override
    public double calcularArea(){
        return Math.PI * (raio*raio);
    }
}
