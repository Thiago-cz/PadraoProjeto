
public class Nestle implements IFabricaDeOvoDePascoa {

    @Override
    public IOvoDePascoa criarOvoBasico(double peso, String cor, double calorias, double teorGordura,
            double qualidadePureza) {
        return new KitKat(peso, cor, calorias, teorGordura, qualidadePureza);
    }

    @Override
    public IOvoDePascoa criarOvoPadrao(double peso, String cor, double calorias, double teorGordura,
            double qualidadePureza) {
        return new Classic(peso, cor, calorias, teorGordura, qualidadePureza);
    }

    @Override
    public IOvoDePascoa criarOvoPremium(double peso, String cor, double calorias, double teorGordura,
            double qualidadePureza) {
        return new Alpino(peso, cor, calorias, teorGordura, qualidadePureza);
    }

}
