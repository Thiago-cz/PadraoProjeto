package Parte1.Modificado;

public class Apple implements IFabricaCelular {

    @Override
    public ICelularBotao celularBotao(String memoria, String camera, double tela, String cor, double preco,
            int modelo) {
                switch(modelo){
                    case 1:
                        return new Iphone7(memoria, camera, tela, cor, preco);
                    default:
                        return new Iphone7(memoria, camera, tela, cor, preco);
                }
    }

    @Override
    public ICelularTouchScreen celularTouchScreen(String memoria, String camera, double tela, String cor,
            double preco, int modelo) {
        switch (modelo) {
            case 1:
                return new Iphone15(memoria, camera, tela, cor, preco);
            case 2:
                return new Iphone11(memoria, camera, tela, cor, preco);
            default:
                return new Iphone11(memoria, camera, tela, cor, preco);
        }

    }

}
