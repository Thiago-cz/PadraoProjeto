public abstract class Violao implements Cloneable {
    private int qtdCordas = 6;
    private String tipoCordas = "Nylon";
    private String modelo = "Acustico";
    private String indicacaoGenero = "MPB";
    private String indicacaoUso = "Iniciante";
    private String tipoSom = "Moderado";
    private String tamanho = "Normal";
    private String nome = "Classico";

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "==================" +
        "\nTipo de corda: " + tipoCordas+        
        "\nModelo de saída de som: " + modelo+
        "\nIndicacão de gênero: " + indicacaoGenero+
        "\nTipo de som: " + tipoSom + 
        "\nTamanho: " + tamanho+
        "\nTipo de Violao: " + nome +
        "\n==================";
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipoSom() {
        return tipoSom;
    }

    public void setTipoSom(String tipoSom) {
        this.tipoSom = tipoSom;
    }

    public String getIndicacaoUso() {
        return indicacaoUso;
    }

    public void setIndicacaoUso(String indicacaoUso) {
        this.indicacaoUso = indicacaoUso;
    }

    public String getIndicacaoGenero() {
        return indicacaoGenero;
    }

    public void setIndicacaoGenero(String indicacaoGenero) {
        this.indicacaoGenero = indicacaoGenero;
    }

    public abstract Violao clonar(int opt) throws CloneNotSupportedException;

    public int getQtdCordas() {
        return qtdCordas;
    }

    public void setQtdCordas(int qtdCordas) {
        this.qtdCordas = qtdCordas;
    }

    public String getTipoCordas() {
        return tipoCordas;
    }

    public void setTipoCordas(String tipoCordas) {
        this.tipoCordas = tipoCordas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
