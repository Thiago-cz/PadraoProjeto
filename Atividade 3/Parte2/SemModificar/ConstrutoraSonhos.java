package Parte2.SemModificar;
public class ConstrutoraSonhos implements IFabricaCasa{

    @Override
    public ICasaMadeira casaMadeira(double tamanho, String cores, double orcamento, int quartos, int banheiros) {
        return new Praia(tamanho, cores, orcamento, quartos, banheiros);
    }

    @Override
    public ICasaConcreto casaConcreto(double tamanho, String cores, double orcamento, int quartos, int banheiros) {
        return new Moderna(tamanho, cores, orcamento, quartos, banheiros);
    }


}
