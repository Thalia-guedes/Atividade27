package Exercicio2;

public class Retangulo extends Forma{
    private float lado;
    private float altura;

    public Retangulo(int lado, int altura) {
        this.lado = lado;
        this.altura = altura;
    }

    @Override
    public float calcularArea() {
        return lado * altura;
    }

    @Override
    public float calcularPerimetro() {
        return 2 * (lado + altura);
    }
}
