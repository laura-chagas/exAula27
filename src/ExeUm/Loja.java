package ExeUm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Loja {
    public static void main(String[] args) {

        List<Produto> cadProduto = new ArrayList<>();

        cadProduto.add(new Cd("ABC da XUXA", 20.00, 9, 123456));
        cadProduto.add(new Livro("O Alquimista", 30.00, "Paulo Coelho", 12221));
        cadProduto.add(new Dvd("A Era do Gelo", 12.00, 1.21, 332516));
        cadProduto.add(new Cd("ABC da XUXA", 25.00, 9, 8855744));
        cadProduto.add(new Cd("After Hours", 40.00, 14, 963852));

//        for (Produto produto : cadProduto) {
//            produto.mostrarDetalheDoItem();
//            System.out.println("------------------");
//
//        }

        Cd cd1 = new Cd("ABC da XUXA", 20.00,9, 123456);


        System.out.println(cd1.equals(cadProduto));

        System.out.println(buscarProduto(cd1, cadProduto));

        Dvd dvd2 = new Dvd("A Era do Gelo", 12.00, 1.21, 332516);
        Dvd dvd3 = new Dvd("A Era do Gelo", 12.00, 1.21, 615233);


    }  public static String buscarProduto(Produto produto, List<Produto> cadProduto){
        for (int i = 0; i < cadProduto.size(); i++) {
            if (cadProduto.get(i).equals(produto)){
                return "O produto está no indice " + i;
            }
        }
        return "Produto não encontrado";

    }


}