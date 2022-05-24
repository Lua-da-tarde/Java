package exdivisao;

public class CalculoMatematico {
    protected int valor1;
    protected int valor2;

    public CalculoMatematico(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public int divisaoA() {
        try{
        return valor1/valor2;
        }catch(ArithmeticException e){
            System.out.println("O segundo valor não pode ser zero! " + valor2);
            return 0;
        }
    }
    
}
