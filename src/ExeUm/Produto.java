package ExeUm;

import java.util.List;
import java.util.Objects;

abstract class Produto {

    public String nome;
    public double preco;

    public int codBarras;

    public Produto(String nome, double preco, int codBarras) {
        this.nome = nome;
        this.preco = preco;
        this.codBarras = codBarras;
    }


    public void mostrarDetalheDoItem() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return codBarras == produto.codBarras;
    }


}
