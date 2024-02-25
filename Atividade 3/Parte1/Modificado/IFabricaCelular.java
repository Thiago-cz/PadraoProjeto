package Parte1.Modificado;
public interface IFabricaCelular {
    ICelularBotao celularBotao(String memoria, String camera, double tela, String cor, double preco, int modelo);
    ICelularTouchScreen celularTouchScreen(String memoria, String camera, double tela, String cor, double preco, int modelo);
    
}