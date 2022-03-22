package exercicio4;

public class Estoque {
        private String nome;
        private int qntMinima, qntAtual,qtd;
        private boolean repor;
        
       public Estoque(String nome, int qntMinima, int qntAtual, int qtd){
        this.qntMinima=qntMinima;
        this.qntAtual=qntAtual;
        this.nome=nome;
        this.qtd=qtd;
        
    public Estoque(){
           qntMinima=5;
           qntAtual=5;
           qtd=1;
           nome= "";
       }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQntMinima() {
        return qntMinima;
    }

    public void setQntMinima(int qntMinima) {
        this.qntMinima = qntMinima;
    }

    public int getQntAtual() {
        return qntAtual;
    }

    public void setQntAtual(int qntAtual) {
        this.qntAtual = qntAtual;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
       
    public int repor(){
        qntAtual=qtd+qntAtual;
        return qntAtual;
    }
    public int darBaixa(){
        qntAtual=qntAtual-qtd;
        return qntAtual;
    }
    public int verificaQntMinima(){
        if(qntMinima<0)
            System.out.println("Dentro dos padrões");
        else
            qntMinima=1;
        return qntMinima;
    }
     public int verificaQntAtual(){
        if(qntAtual<0)
            System.out.println("Dentro dos padrões");
        else
            qntAtual=1;
        return qntAtual;
    }
    public boolean precisaRepor(){
        if(qntAtual<qntMinima)
            repor=true;
        else
            repor=false;
        return repor;
    }
}