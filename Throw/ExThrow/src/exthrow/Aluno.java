package exthrow;

public class Aluno {
    protected int ra;
    protected String nome;

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        if (ra<0)
            throw new IllegalArgumentException("Ra deve ser um valor positivo");
        else
            this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
