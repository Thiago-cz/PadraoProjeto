class MexicanoBuilder implements SanduicheBuilder {
    private Sanduiche sanduiche = new Sanduiche();

    public void abrirPao() {
        sanduiche.addIngrediente("Pão de milho");
    }

    public void adicionarCarnes() {
        sanduiche.addIngrediente("Carne desfiada");
    }

    public void adicionarQueijos() {
        sanduiche.addIngrediente("Queijo Oaxaca");
    }

    public void adicionarVegetais() {
        sanduiche.addIngrediente("Pimentão verde");
        sanduiche.addIngrediente("Cebola roxa");
    }

    public void adicionarCondimentos() {
        sanduiche.addIngrediente("Guacamole");
        sanduiche.addIngrediente("Feijão refrito");
    }

    public Sanduiche getSanduiche() {
        return sanduiche;
    }
}
