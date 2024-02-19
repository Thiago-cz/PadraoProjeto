package SOLID.LiskovSubstitution.Certo;

class Quadrado extends Retangulo {
    public Quadrado(int lado) {
        super(lado, lado);
    }

    @Override
    public void setLargura(int largura) {
        super.setLargura(largura);
        super.setAltura(largura);
    }

    //Essa implementação esta correta, pois consigo substituir o quadrado pelo retangulo
    @Override
    public void setAltura(int altura) {
        super.setAltura(altura);
        super.setLargura(altura);
    }
}
