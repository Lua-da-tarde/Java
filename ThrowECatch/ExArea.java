package exarea;

public class ExArea {
    
    public static void main(String[] args) {
        Quadrado q1 = new Quadrado(4);
        Retangulo r1 = new Retangulo(5,5);
        Circuferencia c1 = new Circuferencia(5);
        
        try{
            System.out.println(r1.calcularArea());
        } catch(IllegalArgumentException e){
            System.out.println("Erro! Erro! Digitou duas variaveis iguais pro retangulo.");
        }
        
        System.out.println("\nArea do quadrado: " + q1.calcularArea());
        System.out.println("Area do circulo: " + c1.calcularArea());
        System.out.println("Area do retangulo: " + r1.calcularArea());
    }
    
}
