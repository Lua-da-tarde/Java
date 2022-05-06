// Pacote principal (main)
// Projeto 
package exercicio2;

import exercicio2.ContaBancaria;
import exercicio2.ContaPoupanca;

public class Exercicio2{

  public static void main(String[] args) {

    ContaBancaria cb = new ContaBancaria("Josirley", 2012380, 2000);
    ContaPoupanca cp = new ContaPoupanca(0.5, "Maria Joaquina", 2013460, 40000);
    ContaEspecial ce = new ContaEspecial(100, "Weisley", 3040570, 400);

    System.out.println("\nConta: " + cb.getnumConta() + "\nNome: " + cb.getCliente() + "\nSaldo: " + cb.getSaldo());
    cp.depositar(100);
    System.out.println("\n\nConta: " + cp.getnumConta() + "\nNome: " + cp.getCliente() + "\nSaldo: " + cp.getSaldo());
    cp.depositar(300);
    System.out.println("\n\nConta: " + ce.getnumConta() + "\nNome: " + ce.getCliente() + "\nSaldo: " + ce.getSaldo());
    cp.depositar(200);

  }

}