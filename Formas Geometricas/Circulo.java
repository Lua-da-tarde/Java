package exinterface;

public class Circulo implements IForma {
    protected double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public Circulo(double raio) {
        this.raio = raio;
    }
    
    @Override
    public double calcArea() {
        return Math.PI * (raio * raio);
    }

    @Override
    public double calcPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public void mostrar() {
        System.out.println("Isso eh um circulo. \n");
    }
    
}
