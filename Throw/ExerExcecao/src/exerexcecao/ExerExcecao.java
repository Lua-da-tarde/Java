
package exerexcecao;

public class ExerExcecao {

     public static void main(String[] args) {
       Object o = null;
       try{
           o.toString();
       }
       catch(NullPointerException e){
           System.out.println(e.getMessage());   
           System.out.println("O objeto é null");
       }
         System.out.println("Término de Programa");
    }
    
}
