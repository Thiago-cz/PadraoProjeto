package Parte2.Modificado;

public class ConstrutoraSonhos implements IFabricaCasa {

    @Override
    public ICasaMadeira casaMadeira(double tamanho, String cores, double orcamento, int quartos, int banheiros,
            int modelo) {
        switch (modelo) {
            case 1:
                return new Praia(tamanho, cores, orcamento, quartos, banheiros);
            default:
                return new Praia(tamanho, cores, orcamento, quartos, banheiros);
        }

    }

    @Override
    public ICasaConcreto casaConcreto(double tamanho, String cores, double orcamento, int quartos, int banheiros,
            int modelo) {
        switch (modelo) {
            case 1:
                return new Moderna(tamanho, cores, orcamento, quartos, banheiros);
            case 2:
                return new Futurista(tamanho, cores, orcamento, quartos, banheiros);
            default:
                return new Moderna(tamanho, cores, orcamento, quartos, banheiros);
        }
    }


}
