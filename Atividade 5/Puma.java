public class Puma implements Marca {
    
    @Override
    public Camiseta criarCamiseta(int opcao) {
        switch (opcao) {
            case 1:
                return new CamisetaBotafogo("Camiseta Oficial do Botafogo");
            default:
                return new CamisetaBotafogo("Camiseta Oficial do Botafogo");

        }
    }
}
