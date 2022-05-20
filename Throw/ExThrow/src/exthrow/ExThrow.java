package exthrow;

public class ExThrow {

    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        try{
            a1.setRa(-1);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Ra: " + a1.getRa());
        System.out.println("Término do Programa");
    }
    
}
