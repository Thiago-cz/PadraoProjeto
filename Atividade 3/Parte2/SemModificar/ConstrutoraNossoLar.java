package Parte2.SemModificar;
public class ConstrutoraNossoLar implements IFabricaCasa{

    @Override
    public ICasaMadeira casaMadeira(double tamanho, String cores, double orcamento, int quartos, int banheiros) {
        return new Americana(tamanho, cores, orcamento, quartos, banheiros);
    }

    @Override
    public ICasaConcreto casaConcreto(double tamanho, String cores, double orcamento, int quartos, int banheiros) {
        return new Minimalista(tamanho, cores, orcamento, quartos, banheiros);
    }


    
}
