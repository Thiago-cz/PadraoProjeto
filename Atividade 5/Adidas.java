public class Adidas implements Marca {
    @Override
    public Camiseta criarCamiseta(int opcao) {
        switch (opcao) {
            case 1:
                return new CamisetaFlamengo("Camiseta Oficial do Flamengo");
            default:
                return new CamisetaFlamengo("Camiseta Oficial do Flamengo");
        }
    }

}
