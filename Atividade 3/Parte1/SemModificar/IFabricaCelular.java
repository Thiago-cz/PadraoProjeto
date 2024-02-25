package Parte1.SemModificar;
public interface IFabricaCelular {
    ICelularBotao celularBotao(String memoria, String camera, double tela, String cor, double preco);
    ICelularTouchScreen celularTouchScreen(String memoria, String camera, double tela, String cor, double preco);
    
}