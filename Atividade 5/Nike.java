public class Nike implements Marca {
    @Override
    public Camiseta criarCamiseta(int opcao) {
        switch (opcao) {
            case 1:
                return new CamisetaBrasil("Camiseta Oficial do Brasil");

            default:
                return new CamisetaBrasil("Camiseta Oficial do Brasil");

        }
    }

}
