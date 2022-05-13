package exinterface;

public class ExInterface {

    public static void main(String[] args) {
        Quadrado q = new Quadrado(0,0);
        IForma i1 = new Quadrado(0,0,0);
        Circulo c = new Circulo(0);
        
        q.setLado(2); 
        System.out.println(q.calcArea());
        q.mostrar();
        
        c.setRaio(5);
        System.out.println(c.calcArea());
        c.mostrar();
        
    }
}
