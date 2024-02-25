package Parte2.Modificado;

public class Medieval implements ICasaMadeira{
    private double tamanho;
    private String cores;
    private double orcamento;
    private int quartos;
    private int banheiros;

    
    public Medieval(double tamanho, String cores, double orcamento, int quartos, int banheiros) {
        this.tamanho = tamanho;
        this.cores = cores;
        this.orcamento = orcamento;
        this.quartos = quartos;
        this.banheiros = banheiros;
    }


    @Override
    public void exibirInfoCasaMadeira() {
        System.out.println("Exibindo as informações da casa: ");
        System.out.println("Tamanho : " + this.tamanho);
        System.out.println("Cores : " + this.cores);
        System.out.println("Orçamento : R$ " + this.orcamento);
        System.out.println("Quartos : " + this.quartos);
        System.out.println("Banheiros : " + this.banheiros);
    }


    public double getTamanho() {
        return tamanho;
    }


    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }


    public String getCores() {
        return cores;
    }


    public void setCores(String cores) {
        this.cores = cores;
    }


    public double getOrcamento() {
        return orcamento;
    }


    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }


    public int getQuartos() {
        return quartos;
    }


    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }


    public int getBanheiros() {
        return banheiros;
    }


    public void setBanheiros(int banheiros) {
        this.banheiros = banheiros;
    }
    
}
