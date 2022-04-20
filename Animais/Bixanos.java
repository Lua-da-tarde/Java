package bixanos;

public class Bixanos {

    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal c1 = new Cachorro();
        Animal cv1 = new Cavalo();
        Animal p1 = new Preguica();

        a1.setNome("Apolo");
        a1.setIdade(13);
        c1.setNome("Bill");
        c1.setIdade(7);
        cv1.setNome("Perola");
        cv1.setIdade(22);
        p1.setNome("Gabriela");
        p1.setIdade(34);

        System.out.println(" O nome do animal eh " + a1.getNome() + " e tem " + a1.getIdade()
                + " anos.\n\n Ele emite sons como: ");
        a1.emitirSom();

        System.out.println("\n Apolo tem um amigo chamado " + c1.getNome() + " , ele tem " + c1.getIdade()
                + " anos e late muito, ouve sao.");
        c1.emitirSom();

        System.out.println(
                "\n Eles conhecem um sitio que tem varios animais como cavalos e preguicas, duas grandes figuras sao "
                        + cv1.getNome() + " e " + p1.getNome() +
                        " , elas fazem sons como ");
        cv1.emitirSom();
        p1.emitirSom();

        System.out.println("\n " + cv1.getNome() + " todo dia faz uma atividade, que eh ");
        cv1.correrA();

        System.out.println("\n " + p1.getNome() + " fica o dia inteiro parada, porem de vez em quando ela ");
        p1.subirArvore();
    }

}
