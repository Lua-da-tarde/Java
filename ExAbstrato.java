package exabstrato;

public class ExAbstrato {

    public static void main(String[] args) {
        //Animal a = new Animal;
        Animal a = new Cachorro();
        a.falar();
        
        Animal a2 = new Gatinho();
        a2.falar();
        //a2.arranha();
        Gatinho g1 = (Gatinho)a2;
        
        
    }
    
}
