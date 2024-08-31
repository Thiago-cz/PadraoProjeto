public class AssinaturaBasica implements IAssinatura {

    @Override
    public String getDescricao() {
        return "Assinatura Base: Assistir vídeos num único dispositivo";
    }

    @Override
    public double getValor() {
        return 9.99;
    }

    public boolean pacoteRepedito(Class<? extends DecoratorAssinatura> pacote) {
        return false; // A assinatura base não possui pacotes adicionais.
    }
}
