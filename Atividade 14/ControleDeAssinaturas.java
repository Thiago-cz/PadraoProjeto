import java.util.HashSet;
import java.util.Set;

public class ControleDeAssinaturas {
    private IAssinatura assinatura;
    private Set<Class<? extends DecoratorAssinatura>> pacotes;

    public ControleDeAssinaturas() {
        this.assinatura = new AssinaturaBasica();
        this.pacotes = new HashSet<>();
    }

    public void addPackage(Class<? extends DecoratorAssinatura> packageClass) {
        // Verifica se o pacote já foi adicionado
        if (pacotes.contains(packageClass)) {
            System.out.println("Pacote já adicionado: " + packageClass.getSimpleName());
            return;
        }

        try {
            // Cria uma nova instância do decorador (pacote) e adiciona à assinatura
            assinatura = packageClass.getConstructor(IAssinatura.class).newInstance(assinatura);
            pacotes.add(packageClass);
        } catch (Exception e) {
            System.out.println("Erro ao adicionar pacote: " + e.getMessage());
        }
    }

    public String getDescricao() {
        return assinatura.getDescricao();
    }

    public double getValor() {
        return assinatura.getValor();
    }
}
