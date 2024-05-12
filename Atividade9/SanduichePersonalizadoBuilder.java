import java.util.ArrayList;

interface SanduichePersonalizadoBuilder {
    void abrirPao(String ingrediente);

    void adicionarCarnes(ArrayList<String> ingredientes);

    void adicionarQueijos(ArrayList<String> ingredientes);

    void adicionarVegetais(ArrayList<String> ingredientes);

    void adicionarCondimentos(ArrayList<String> ingredientes);

    Sanduiche getSanduiche();
}
