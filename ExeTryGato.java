package exetrygato;

public class ExeTryGato {

    public static void aumentarLetra(){
        String teste = "Rapaiz";
        try {
        System.out.println(teste.toUpperCase());
         }
        catch(NullPointerException e){ 
            System.out.println("Desculpe!" + " A string não pode ser null... Fuleco faleceu");
        }
        finally{ //se cair no try ou no catch *, vai cair aqui tmb obrigatoriamente
            System.out.println("Passei por aqui!");
        }
    }
    public static void main(String[] args) {
        aumentarLetra();
    }
    
}
