package exercicio2;

public class Exercicio2 {
    
    public static void main(String[] args) {
        Item item1 = new Item (1234, 5, 5.0f, 0f, "grande");
        Item item2 = new Item ();
        
        System.out.println("Codigo: " +item1.getCodigo());
        System.out.println("/nQuantidade: " +item1.getQnt());
        System.out.println("/nPreco: " +item1.getPreco());
        System.out.println("/nDescricao: " +item1.getDesc());
        
        System.out.println("Codigo: " +item2.getCodigo());
        System.out.println("/nQuantidade: " +item2.getQnt());
        System.out.println("/nPreco: " +item2.getPreco());
        System.out.println("/nDescricao: " +item2.getDesc());
        
        System.out.println("/nO valor total a pagar pelo item 1 é: " +item1.getTotal());
        System.out.println("/nO valor total a pagar pelo item 2 é: " +item2.getTotal());
    }
    
}