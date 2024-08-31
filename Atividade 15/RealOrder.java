public class RealOrder implements IOrder {
    private String product;
    private int quantity;

    public RealOrder(String product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    @Override
    public void processOrder() {
        System.out.println("Processando pedido com " + quantity + " unidades do produto " + product);
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
