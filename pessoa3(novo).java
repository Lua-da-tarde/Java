package exercicio3;


public class Pessoa {
    private int idade, dia, mes, ano;
    private String nome;
    int anoHj;
    
    public Pessoa (int dia, int mes, int ano, String nome){
        this.dia=dia;
        this.mes=mes;
        this.ano=ano;
        this.nome=nome;
        }
    public Pessoa (){
        dia=1;
        mes=1;
        ano=200;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String informaNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void calculaIdade(){
        idade= anoHj-ano;
    }
    public int informaIdade(){
        return idade;
        }
  
    public int verificaDia(){
        if(dia>0 & dia<31){
            dia=1;}
        else {
            System.out.println("Dentro dos padrões");}
        return dia;
    }
    public int verificaMes(){
        if(mes>0 & mes<12){
            System.out.println("Dentro dos padrões");}
        else{
          mes=1;}
        return mes;
    }
    public int verificaAno(){
        if(ano>100)
            System.out.println("Dentro dos padrões");
        else 
            ano=1000;
        return ano;
    }
    }