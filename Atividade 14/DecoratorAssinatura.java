public abstract class DecoratorAssinatura implements IAssinatura {
    protected IAssinatura assinatura;

    public DecoratorAssinatura(IAssinatura assinatura) {
        if (assinatura.pacoteRepedito(this.getClass())) {
            throw new IllegalArgumentException("Pacote já adicionado: " + this.getClass().getSimpleName());
        }
        this.assinatura = assinatura;
    }

    @Override
    public String getDescricao() {
        return assinatura.getDescricao();
    }

    @Override
    public double getValor() {
        return assinatura.getValor();
    }

    @Override
    public boolean pacoteRepedito(Class<? extends DecoratorAssinatura> pacote) {
        // Propaga a verificação para a cadeia de decoradores
        return pacote == this.getClass() || assinatura.pacoteRepedito(pacote);
    }

}
