class ItemSimples implements Item {
    private String nome;
    private double preco;

    public ItemSimples(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        return preco;
    }
}