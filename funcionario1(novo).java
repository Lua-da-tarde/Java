package exercicio1;

public class Funcionario {
   private String nome, sobrenome; 
   private float salarioM, salarioAno, salarioAu;
   
   //construtor que recebe argumento 
   public Funcionario(String nome, String sobrenome, float salarioM, float salarioAno, float salarioAu){
       this.nome=nome;
       this.sobrenome=sobrenome;
       this.salarioM=salarioM;
       this.salarioAno=salarioAno;
       this.salarioAu=salarioAu;
    }
   //construtor que define os valores sozinho
   public Funcionario(){
       nome= "";
       sobrenome= "";
       salarioM=0;
       salarioAno=0;
       salarioAu=0;
    }
   //get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public float getSalarioM() {
        return salarioM;
    }
    public void setSalarioM(float salarioM) {
        this.verificaSal();
        this.salarioM = salarioM;
    }

    public float getSalarioAno() {
        return salarioAno;
    }

    public void setSalarioAno(float salarioAno) {
        this.calculoSalA();
        this.salarioAno = salarioAno;
    }

    public float getSalarioAu() {
        return salarioAu;
    }

    public void setSalarioAu(float salarioAu) {
        this.calculoSalAu();
        this.salarioAu = salarioAu;
    }
    
   
    //verificar salario
    public float verificaSal(){
        if (salarioM<0)
            salarioM=0;
        else
            this.salarioM=salarioM;
        return salarioM;
    }
    //calculo salario anual
    public float calculoSalA(){
        salarioM=salarioAno*12;
        return salarioAno;
    }
    public float calculoSalAu(){
        salarioAu=(salarioM*0.1)+salarioM;
        return salarioAno;
   
}