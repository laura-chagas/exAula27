package ExeDois;

public class Retangulo extends Forma{

    public float lado;
    public float altura;

    public Retangulo(float lado, float altura){
        this.lado = lado;
        this.altura = altura;
    }


    @Override
    public float calcularArea() {
        return lado * altura;
    }

    @Override
    public float calcularPerimetro() {
        return (lado*2) + (altura*2);
    }

    @Override
    public void exibirResultado() {
        System.out.println("A área do Retângulo é respectivamente: " + calcularArea());
        System.out.println("O perímetro do Retângulo é respectivamente: " + calcularPerimetro());
    }


}
