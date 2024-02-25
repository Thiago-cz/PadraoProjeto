package Parte2.Modificado;
public interface IFabricaCasa {
    ICasaMadeira casaMadeira(double tamanho, String cores, double orcamento, int quartos, int banheiros, int modelo);
    ICasaConcreto casaConcreto(double tamanho, String cores, double orcamento, int quartos, int banheiros, int modelo);
    
}