package SOLID.LiskovSubstitution.Certo;

public class Main {
    static void calcularArea(Retangulo retangulo) {
        System.out.println("Área do retângulo: " + retangulo.calcularArea());
    }

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(5, 10);
        Quadrado quadrado = new Quadrado(5);

        calcularArea(retangulo);  // Área do retângulo: 50
        calcularArea(quadrado);   // Área do retângulo: 25
    }
}
