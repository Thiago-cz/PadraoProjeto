public interface IAssinatura {
    String getDescricao();
    boolean pacoteRepedito(Class <? extends DecoratorAssinatura> pacote);
    double getValor();
}
