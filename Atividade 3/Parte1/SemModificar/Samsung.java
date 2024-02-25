package Parte1.SemModificar;
public class Samsung implements IFabricaCelular{

    @Override
    public ICelularBotao celularBotao(String memoria, String camera, double tela, String cor, double preco) {
        return new GalaxyJ5(memoria, camera, tela, cor, preco);
    }

    @Override
    public ICelularTouchScreen celularTouchScreen(String memoria, String camera, double tela, String cor,
            double preco) {
                return new GalaxyS20(memoria, camera, tela, cor, preco);
    }
    
}
