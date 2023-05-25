package ExeDois;

public class Circulo extends Forma{

    public float raio;
    public float pi = 3.14f;
    public Circulo(float raio){
        this.raio = raio;
    }

    @Override
    public float calcularArea() {
        return (raio * raio) * pi;
    }
    @Override
    public float calcularPerimetro() {
        return pi * 2 * raio;
    }

    @Override
    public void exibirResultado() {
        System.out.println("A área do Circulo é respectivamente: " + calcularArea());
        System.out.println("O perímetro do Circulo é respectivamente: " + calcularPerimetro());
    }



}
