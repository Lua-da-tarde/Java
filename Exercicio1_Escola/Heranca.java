// Pacote principal (Main)
// Projeto Heranca
package heranca;

public class Heranca {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa ("Claudio", 45);
        Aluno a1 = new Aluno ("Maria", 15, 201171); 
        Professor pr1 = new Professor ("Barreto", 30, 20000);
        
        System.out.println("Pessoa 1: \nNome: " + p1.getNome() + "\nIdade: " + p1.getIdade());
        p1.mostra();
        System.out.println("\n\nAluno 1: \nNome: " + a1.getNome() + "\nIdade: " + a1.getIdade() + "\nRa: " + a1.getRa());
        a1.mostra();
        System.out.println("\n\nProfessor 1: \nNome: " + pr1.getNome() + "\nIdade: " + pr1.getIdade() + "\nSalario: " + pr1.getSalario());
        pr1.mostra();     
    }
}
