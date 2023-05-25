package ExeUm;

public class Livro extends Produto {
    public String autor;

    public Livro(String nome, double preco, String autor, int codBarras) {
        super(nome, preco, codBarras);
        this.autor = autor;
    }

    @Override
    public void mostrarDetalheDoItem() {
        System.out.println("LIVRO:");
        super.mostrarDetalheDoItem();
        System.out.println("Autor: " + autor);
        System.out.println("Código de barras: " + codBarras);
    }
}
