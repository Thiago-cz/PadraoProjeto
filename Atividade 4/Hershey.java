public class Hershey implements IFabricaDeOvoDePascoa{

    @Override
    public IOvoDePascoa criarOvoBasico(double peso, String cor, double calorias, double teorGordura,
            double qualidadePureza) {
                return new Hershey1(peso, cor, calorias, teorGordura, qualidadePureza);
    }

    @Override
    public IOvoDePascoa criarOvoPadrao(double peso, String cor, double calorias, double teorGordura,
            double qualidadePureza) {
                return new Hershey2(peso, cor, calorias, teorGordura, qualidadePureza);
    }

    @Override
    public IOvoDePascoa criarOvoPremium(double peso, String cor, double calorias, double teorGordura,
            double qualidadePureza) {
                return new Hershey3(peso, cor, calorias, teorGordura, qualidadePureza);
    }
    
}
