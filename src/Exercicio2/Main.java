package Exercicio2;

public class Main {
    public static void main(String[] args) {
        Forma[] formas = new Forma[5];
        formas[0] = new Retangulo(4, 5);
        formas[1] = new Circulo(3);
        formas[2] = new Quadrado(2);
        formas[3] = new Circulo(5);
        formas[4] = new Retangulo(3, 6);

        for (Forma forma : formas) {
            System.out.println("Área: " + forma.calcularArea());
            System.out.println("Perímetro: " + forma.calcularPerimetro());
            System.out.println();
        }
    }
}
