package ExeUm;

public class Cd extends Produto {

    public int numFaixas;

    public Cd(String nome, double preco, int numFaixas, int codBarras) {
        super(nome, preco, codBarras);
        this.numFaixas = numFaixas;
    }

    @Override
    public void mostrarDetalheDoItem() {
        System.out.println("CD:");
        super.mostrarDetalheDoItem();
        System.out.println("Número de faixas: " + numFaixas);
        System.out.println("Código de barras: " + codBarras);
    }



}
