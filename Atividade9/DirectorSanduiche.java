class DirectorSanduiche {
    public void construirSanduiche(SanduicheBuilder builder) {
        builder.abrirPao();
        builder.adicionarCarnes();
        builder.adicionarQueijos();
        builder.adicionarVegetais();
        builder.adicionarCondimentos();
    }
}
