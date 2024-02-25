package Parte2.Modificado;

public class ConstrutoraNossoLar implements IFabricaCasa {

    @Override
    public ICasaMadeira casaMadeira(double tamanho, String cores, double orcamento, int quartos, int banheiros,
            int modelo) {
        switch (modelo) {
            case 1:
                return new Americana(tamanho, cores, orcamento, quartos, banheiros);
            case 2:
                return new Medieval(tamanho, cores, orcamento, quartos, banheiros);
            default:
                return new Americana(tamanho, cores, orcamento, quartos, banheiros);
        }

    }

    @Override
    public ICasaConcreto casaConcreto(double tamanho, String cores, double orcamento, int quartos, int banheiros,
            int modelo) {
        switch (modelo) {
            case 1:
                return new Minimalista(tamanho, cores, orcamento, quartos, banheiros);
            default:
                return new Minimalista(tamanho, cores, orcamento, quartos, banheiros);
        }
    }

}
