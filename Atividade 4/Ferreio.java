public class Ferreio implements IFabricaDeOvoDePascoa{

    @Override
    public IOvoDePascoa criarOvoBasico(double peso, String cor, double calorias, double teorGordura,
            double qualidadePureza) {
                return new FerreiroRocher1(peso, cor, calorias, teorGordura, qualidadePureza);
    }

    @Override
    public IOvoDePascoa criarOvoPadrao(double peso, String cor, double calorias, double teorGordura,
            double qualidadePureza) {
                return new FerreiroRocher2(peso, cor, calorias, teorGordura, qualidadePureza);
    }

    @Override
    public IOvoDePascoa criarOvoPremium(double peso, String cor, double calorias, double teorGordura,
            double qualidadePureza) {
                return new FerreiroRocher3(peso, cor, calorias, teorGordura, qualidadePureza);
    }
    
}
