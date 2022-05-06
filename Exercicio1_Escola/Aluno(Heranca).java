// Classe aluno 
// Subclasse de "Pessoa"
package heranca;

public class Aluno extends Pessoa{
    protected int ra;
    
    public Aluno(String nome, int idade, int ra){
        super(nome, idade);
        this.ra=ra;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    /**
     *
     */
    @Override
    public void mostra(){
        System.out.println("E um aluno");
    }
}