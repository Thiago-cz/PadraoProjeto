public class CashBack extends DecoratorAssinatura {
    public CashBack(IAssinatura assinatura) {
        super(assinatura);
    }

    @Override
    public String getDescricao() {
        return assinatura.getDescricao() + ", Pacote 5: Compra com Cash Back";
    }

    @Override
    public double getValor() {
        return assinatura.getValor() + 19.99;
    }
}
