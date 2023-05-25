package ExeDois;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Forma> listaFormas = new ArrayList<>();

        listaFormas.add(new Quadrado(3.2f, 3.2f));
        listaFormas.add(new Circulo(8.2f));
        listaFormas.add(new Retangulo(2.2f, 7.8f));
        listaFormas.add(new Quadrado(4.8f, 2.4f));
        listaFormas.add(new Retangulo(6.5f, 2.6f));


        for (int i = 0; i < listaFormas.size(); i++) {

            listaFormas.get(i).exibirResultado();
            System.out.println("------------------------");

        }
    }
}