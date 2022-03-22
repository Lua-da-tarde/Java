package exercicio1;

public class Exercicio1 {

    public static void main(String[] args) {
        Funcionario func1 = new Funcionario ("André", "Silva", 1200f);
        Funcionario func2 = new Funcionario ("Fabio", "Souza", 14000f) ;
        
        System.out.println("Nome: " +func1.getNome());
        System.out.println("/nSobrenome: " +func1.getSobrenome());
        System.out.println("/nSalario Mensal: " +func1.getSalarioM());
        System.out.println("/nSalario Anual: " +func1.getSalarioAno());
        
        System.out.println("Nome: " +func2.getNome());
        System.out.println("/nSobrenome: " +func2.getSobrenome());
        System.out.println("/nSalario Mensal: " +func2.getSalarioM());
        System.out.println("/nSalario Anual: " +func2.getSalarioAno());
        
        System.out.println("/Salario com aumento de funcionario 1: " +func1.getSalarioAu());
        System.out.println("/Salario com aumento de funcionario 2: " +func2.getSalarioAu());
        
    }
    
}