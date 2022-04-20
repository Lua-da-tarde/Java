package bixanos;

public class Preguica extends Animal{
    
    public void subirArvore(){
        System.out.println("[sobe em árvore]");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("[boceja]");
    }
}
