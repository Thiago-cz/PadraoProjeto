public class Kappa implements Marca {

    @Override
    public Camiseta criarCamiseta(int opcao) {
        switch (opcao) {
            case 1:
                return new CamisetaVasco("Camiseta Oficial do Vasco");
            default:
                return new CamisetaVasco("Camiseta Oficial do Vasco");
        }
    }

}
