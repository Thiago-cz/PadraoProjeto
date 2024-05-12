class VegetarianoBuilder implements SanduicheBuilder {
    private Sanduiche sanduiche = new Sanduiche();

    public void abrirPao() {
        sanduiche.addIngrediente("Pão integral");
    }

    public void adicionarCarnes() {
    }

    public void adicionarQueijos() {
        sanduiche.addIngrediente("Queijo cheddar");
    }

    public void adicionarVegetais() {
        sanduiche.addIngrediente("Pepino");
        sanduiche.addIngrediente("Alface");
        sanduiche.addIngrediente("Tomate");
    }

    public void adicionarCondimentos() {
        sanduiche.addIngrediente("Mostarda");
    }

    public Sanduiche getSanduiche() {
        return sanduiche;
    }
}