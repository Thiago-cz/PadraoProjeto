import java.util.ArrayList;

class PersonalizadoBuilder implements SanduichePersonalizadoBuilder {

    private Sanduiche sanduiche = new Sanduiche();

    public void abrirPao(String ingrediente) {
        sanduiche.addIngrediente(ingrediente);
    }

    public void adicionarCarnes(ArrayList<String> ingredientes) {
        for (String ingrediente : ingredientes) {
            sanduiche.addIngrediente(ingrediente);
        }
        ;
    }

    public void adicionarQueijos(ArrayList<String> ingredientes) {
        for (String ingrediente : ingredientes) {
            sanduiche.addIngrediente(ingrediente);
        }
        ;
    }

    public void adicionarVegetais(ArrayList<String> ingredientes) {
        for (String ingrediente : ingredientes) {
            sanduiche.addIngrediente(ingrediente);
        }
        ;
    }

    public void adicionarCondimentos(ArrayList<String> ingredientes) {
        for (String ingrediente : ingredientes) {
            sanduiche.addIngrediente(ingrediente);
        }
        ;
    }

    public Sanduiche getSanduiche() {
        return sanduiche;
    }
}
