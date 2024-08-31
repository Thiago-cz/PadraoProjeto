public class CartaoDeCredito extends DecoratorAssinatura {
    public CartaoDeCredito(IAssinatura assinatura) {
        super(assinatura);
    }

    @Override
    public String getDescricao() {
        return assinatura.getDescricao() + ", Pacote 4: Cartão de crédito Platinum";
    }

    @Override
    public double getValor() {
        return assinatura.getValor() + 49.99;
    }
}
