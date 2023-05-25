package ExeUm;

public class Dvd extends Produto {

    public double duracao;

    public Dvd(String nome, double preco, double duracao, int codBarras) {
        super(nome, preco, codBarras);
        this.duracao = duracao;
    }

    @Override
    public void mostrarDetalheDoItem() {
        System.out.println("DVD:");
        super.mostrarDetalheDoItem();
        System.out.println("Tempo de duração: " + duracao);
        System.out.println("Código de barras: " + codBarras);
    }
}
