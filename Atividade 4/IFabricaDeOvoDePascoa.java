public interface IFabricaDeOvoDePascoa {
    IOvoDePascoa criarOvoBasico(double peso, String cor, double calorias, double teorGordura, double qualidadePureza);

    IOvoDePascoa criarOvoPadrao(double peso, String cor, double calorias, double teorGordura, double qualidadePureza);

    IOvoDePascoa criarOvoPremium(double peso, String cor, double calorias, double teorGordura, double qualidadePureza);
}
