import java.util.ArrayList;
import java.util.List;

class CaixaAssinatura implements Item {
    private List<Item> itens = new ArrayList<>();
    private String nivel;

    public CaixaAssinatura(String nivel) {
        this.nivel = nivel;
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    @Override
    public String getNome() {
        return "Caixa de Assinatura " + nivel;
    }

    @Override
    public double getPreco() {
        return itens.stream().mapToDouble(Item::getPreco).sum();
    }

    public void listarItens() {
        System.out.println("Itens na " + getNome() + ":");
        for (Item item : itens) {
            System.out.println("- " + item.getNome() + ": R$" + item.getPreco());
        }
        System.out.println("Valor total: R$" + getPreco());
    }
}