class ItalianoBuilder implements SanduicheBuilder {
    private Sanduiche sanduiche = new Sanduiche();

    public void abrirPao() {
        sanduiche.addIngrediente("Pão italiano");
    }

    public void adicionarCarnes() {
        sanduiche.addIngrediente("Salame");
        sanduiche.addIngrediente("Pepperoni");
    }

    public void adicionarQueijos() {
        sanduiche.addIngrediente("Queijo provolone");
    }

    public void adicionarVegetais() {
        sanduiche.addIngrediente("Alface");
        sanduiche.addIngrediente("Tomate");
    }

    public void adicionarCondimentos() {
        sanduiche.addIngrediente("Azeite");
        sanduiche.addIngrediente("Vinagre");
    }

    public Sanduiche getSanduiche() {
        return sanduiche;
    }
}

