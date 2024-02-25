package Parte1.Modificado;
public class Samsung implements IFabricaCelular{

    @Override
    public ICelularBotao celularBotao(String memoria, String camera, double tela, String cor, double preco, int modelo) {
        switch (modelo) {
            case 1:
                return new GalaxyJ5(memoria, camera, tela, cor, preco);
            case 2:
                return new GalaxyJ5Prime(memoria, camera, tela, cor, preco);
            default:
                return new GalaxyJ5(memoria, camera, tela, cor, preco);
        }
    }

    @Override
    public ICelularTouchScreen celularTouchScreen(String memoria, String camera, double tela, String cor,
            double preco, int modelo) {
                switch (modelo) {
                    case 1:
                    return new GalaxyS20(memoria, camera, tela, cor, preco);
                    default:
                        return new GalaxyS20(memoria, camera, tela, cor, preco);
                }

    }
    
}
