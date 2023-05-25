package ExeDois;

    public class Quadrado extends Retangulo{
        public Quadrado(float lado, float altura) {
            super(lado, altura);
        }

        @Override
        public void exibirResultado() {
            System.out.println("O resultado da área do quadrado é: "+calcularArea());
            System.out.println("O resuldado do perimetro do quadrado é: "+calcularPerimetro());
        }

    }