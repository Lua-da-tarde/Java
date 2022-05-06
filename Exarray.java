package exarray;
import java.util.ArrayList;

public class Exarray {

    public static void main(String[] args) {
        Poupanca p1 = new Poupanca();
        p1.setSaldo(500);
        p1.setTaxa(0.01);
        Corrente c1 = new Corrente();
        c1.setSaldo(20);
        c1.setLimite(1000);
        Corrente c2 = new Corrente();
        c2.setSaldo(850);
        c2.setLimite(500);
        
        ArrayList <Conta> lista = new ArrayList();
        lista.add(p1);
        lista.add(c1);
        lista.add(c2);
        
        for (Conta c: lista)
        {
            c.mostra();
            System.out.println(c.getSaldo());
            if(c instanceof Poupanca){
                Poupanca p = (Poupanca)c;
                System.out.println("Taxa da poupanca: " + p.getTaxa());
            }
            if(c instanceof Corrente){
                Corrente cc = (Corrente) c;
                cc.getLimite();
            }
        }
        
    }
    
}
