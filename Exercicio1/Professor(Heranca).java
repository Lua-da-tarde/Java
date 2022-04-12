// Classe professor
// Subclasse de "Pessoa"
package heranca;

    public class Professor extends Pessoa {
     protected float salario;
     
     public Professor(String nome, int idade, float salario){
         super(nome,idade);
         this.salario=salario;
     }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
     
    @Override
    public void mostra(){
        System.out.println("E um professor");
    }
}