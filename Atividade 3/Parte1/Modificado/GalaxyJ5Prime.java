package Parte1.Modificado;

public class GalaxyJ5Prime implements ICelularBotao{
    
    private String memoria;
    private String camera;
    private double tela;
    private String cor;
    private double preco;

    public GalaxyJ5Prime(String memoria, String camera, double tela, String cor, double preco) {
        this.memoria = memoria;
        this.camera = camera;
        this.tela = tela;
        this.cor = cor;
        this.preco = preco;
    }

    @Override
    public void exibirInfoBotao() {
        System.out.println("Exibindo as informações do produto: ");
        System.out.println("Memoria : " + this.memoria);
        System.out.println("Camrera : " + this.camera);
        System.out.println("Tela : " + this.tela);
        System.out.println("Cor : " + this.cor);
        System.out.println("Preco : " + this.preco);
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public double getTela() {
        return tela;
    }

    public void setTela(double tela) {
        this.tela = tela;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
