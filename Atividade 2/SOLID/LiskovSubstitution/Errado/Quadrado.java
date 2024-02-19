package SOLID.LiskovSubstitution.Errado;

class Quadrado extends Retangulo {
    public Quadrado(int lado) {
        super(lado, lado);
    }

    @Override
    public void setLargura(int largura) {
        super.setLargura(largura);
        super.setAltura(largura);
    }

    // Mesmo que o quadrado esteve correta em sua implementação, ele não deixou de
    // funcionar como retangulo, pois paramos de passar a largura. Isso fere o
    // principio de liskov, pois nao posso trocar o retangulo pelo quadrado.
    @Override
    public void setAltura(int altura) {
        super.setAltura(altura);
    }
}
