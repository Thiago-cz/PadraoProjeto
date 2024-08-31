public class VariosDispositivos extends DecoratorAssinatura {
    public VariosDispositivos(IAssinatura assinatura) {
        super(assinatura);
    }

    @Override
    public String getDescricao() {
        return assinatura.getDescricao() + ", Pacote 1: Assistir vídeos em vários dispositivos";
    }

    @Override
    public double getValor() {
        return assinatura.getValor() + 19.99;
    }
}
