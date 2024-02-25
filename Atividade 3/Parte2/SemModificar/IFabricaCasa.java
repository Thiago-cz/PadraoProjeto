package Parte2.SemModificar;
public interface IFabricaCasa {
    ICasaMadeira casaMadeira(double tamanho, String cores, double orcamento, int quartos, int banheiros);
    ICasaConcreto casaConcreto(double tamanho, String cores, double orcamento, int quartos, int banheiros);
    
}