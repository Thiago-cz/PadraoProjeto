
public class Garoto implements IFabricaDeOvoDePascoa {

    @Override
    public IOvoDePascoa criarOvoBasico(double peso, String cor, double calorias, double teorGordura,
            double qualidadePureza) {
        return new BatonAoLeite(peso, cor, calorias, teorGordura, qualidadePureza);
    }

    @Override
    public IOvoDePascoa criarOvoPadrao(double peso, String cor, double calorias, double teorGordura,
            double qualidadePureza) {
        return new Talento(peso, cor, calorias, teorGordura, qualidadePureza);
    }

    @Override
    public IOvoDePascoa criarOvoPremium(double peso, String cor, double calorias, double teorGordura,
            double qualidadePureza) {
        return new Crocante(peso, cor, calorias, teorGordura, qualidadePureza);
    }

}
