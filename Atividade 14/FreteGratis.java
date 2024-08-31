public class FreteGratis extends DecoratorAssinatura {
    public FreteGratis(IAssinatura assinatura) {
        super(assinatura);
    }

    @Override
    public String getDescricao() {
        return assinatura.getDescricao() + ", Pacote 2: Frete Grátis em produtos";
    }

    @Override
    public double getValor() {
        return assinatura.getValor() + 9.99;
    }

}
