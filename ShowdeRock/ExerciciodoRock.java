package exerciciodorock;
import java.util.ArrayList;

public class ExerciciodoRock {

    public static void main(String[] args) {
        float soma;
        Ingresso i = new Ingresso(150);
        Vip v1 = new Vip(250);
        Comum c1 = new Comum(150);
        
        ArrayList <Ingresso> lista = new ArrayList();
        lista.add(v1);
        lista.add(c1);
        for(Ingresso in: lista){
            i.getPreco();
            if(i instanceof Vip){
                i.contV = contV + 1;
                i.getPreco();
            }
            if(i instanceof Comum){
                i.contC = contC + 1;
                i.getPreco();
            }
        }
        i.setSomaC();
        i.setSomaV();
        soma = i.getSomaC + i.getSomaV;
        System.out.println("\n A soma dos valores dos ingressos são: %.2f" + soma);
    }
}
