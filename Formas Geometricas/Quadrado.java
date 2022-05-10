package exinterface;

public class Quadrado extends FormaGeometrica implements IForma, IBidimensional {
    protected double lado;

    public Quadrado(double perimetro, double area) {
        super(perimetro, area);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public double calcArea() {
        area = lado * lado;
        return lado * lado;
    }

    @Override
    public double calcPerimetro() {
        return lado * 4;
    }

    @Override
    public void mostrar() {
        System.out.println("Isso eh um quadrado. \n");
    }

    @Override
    public void ehBidimensional() {
        System.out.println("Bidimensional. \n");
    }
    
}
