package exerciciodorock;
import java.util.ArrayList;

public class ExerciciodoRock {

    public static void main(String[] args) {
        Ingresso i = new Ingresso(150);
        Vip v1 = new Vip(250);
        Comum c1 = new Comum(150);
        
        ArrayList <Ingresso> lista = new ArrayList();
        lista.add(v1);
        lista.add(c1);
        for(Ingresso in: lista){
            i.getPreco();
            if(i instanceof Vip){
                i.getPreco();
            }
            if(i instanceof Comum){
                i.getPreco();
            }
        }
        System.out.println("");
    }
}
