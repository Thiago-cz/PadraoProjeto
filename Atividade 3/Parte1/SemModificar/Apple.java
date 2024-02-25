package Parte1.SemModificar;
public class Apple implements IFabricaCelular{

    @Override
    public ICelularBotao celularBotao(String memoria, String camera, double tela, String cor, double preco) {
        return new Iphone7(memoria, camera, tela, cor, preco);
    }

    @Override
    public ICelularTouchScreen celularTouchScreen(String memoria, String camera, double tela, String cor,
            double preco) {
                return new Iphone15(memoria, camera, tela, cor, preco);
    }
    

 
}
