public class CaixaSurpresa extends DecoratorAssinatura {
    public CaixaSurpresa(IAssinatura assinatura) {
        super(assinatura);
    }

    @Override
    public String getDescricao() {
        return assinatura.getDescricao() + ", Pacote 3: Caixa surpresa com produtos relacionados a filmes e séries";
    }

    @Override
    public double getValor() {
        return assinatura.getValor() + 29.99;
    }
}
