import java.util.ArrayList;
import java.util.List;

class Sanduiche {
    private List<String> ingredientes = new ArrayList<>();

    public void addIngrediente(String ingrediente) {
        ingredientes.add(ingrediente);
    }

    @Override
    public String toString() {
        return "Sanduiche{" +
                "ingredientes=" + ingredientes +
                '}';
    }
}
