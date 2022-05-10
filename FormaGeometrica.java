package exinterface;

public class FormaGeometrica {
    protected double perimetro;
    protected double area;

    public double calcArea() {
        System.out.println("Calculando area.");
        return 0;
    }
    
    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public FormaGeometrica(double perimetro, double area) {
        this.perimetro = perimetro;
        this.area = area;
    }
    
}
