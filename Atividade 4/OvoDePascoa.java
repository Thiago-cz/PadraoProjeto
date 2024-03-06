abstract class OvoDePascoa {
    private double peso;
    private String cor;
    private double calorias;
    private double teorGordura;
    private double qualidadePureza;

    public OvoDePascoa(double peso, String cor, double calorias, double teorGordura, double qualidadePureza) {
        this.peso = peso;
        this.cor = cor;
        this.calorias = calorias;
        this.teorGordura = teorGordura;
        this.qualidadePureza = qualidadePureza;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public double getTeorGordura() {
        return teorGordura;
    }

    public void setTeorGordura(double teorGordura) {
        this.teorGordura = teorGordura;
    }

    public double getQualidadePureza() {
        return qualidadePureza;
    }

    public void setQualidadePureza(double qualidadePureza) {
        this.qualidadePureza = qualidadePureza;
    }

}
