
public class Lactea implements IFabricaDeOvoDePascoa {

    @Override
    public IOvoDePascoa criarOvoBasico(double peso, String cor, double calorias, double teorGordura,
            double qualidadePureza) {
        return new SonhoDeValsa(peso, cor, calorias, teorGordura, qualidadePureza);
    }

    @Override
    public IOvoDePascoa criarOvoPadrao(double peso, String cor, double calorias, double teorGordura,
            double qualidadePureza) {
        return new Oreo(peso, cor, calorias, teorGordura, qualidadePureza);
    }

    @Override
    public IOvoDePascoa criarOvoPremium(double peso, String cor, double calorias, double teorGordura,
            double qualidadePureza) {
        return new AoLeite(peso, cor, calorias, teorGordura, qualidadePureza);
    }

}
