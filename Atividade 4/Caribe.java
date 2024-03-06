public class Caribe extends OvoDePascoa implements IOvoDePascoa{

    public Caribe(double peso, String cor, double calorias, double teorGordura, double qualidadePureza) {
        super(peso, cor, calorias, teorGordura, qualidadePureza);
    }
    
    @Override
    public void exibirInfoOvoDePascoa() {
        System.out.println("Peso -> " + getPeso());
        System.out.println("Calorias -> " + getCalorias());
        System.out.println("PesoCor -> " + getCor());
        System.out.println("Qualidade pureza -> " + getQualidadePureza());
        System.out.println("Teor gordura -> " + getTeorGordura());
    }
}
