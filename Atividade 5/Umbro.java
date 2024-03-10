public class Umbro implements Marca {

    @Override
    public Camiseta criarCamiseta(int opao) {
        switch (opao) {
            case 1:
                return new CamisetaFluminense("Camiseta Oficial da Fluminense");
            default:
                return new CamisetaFluminense("Camiseta Oficial da Fluminense");
        }
    }
}
