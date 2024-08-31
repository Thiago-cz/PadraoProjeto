public class ProxyOrder implements IOrder {
    private RealOrder realOrder;

    public ProxyOrder(RealOrder realOrder) {
        this.realOrder = realOrder;
    }

    private boolean checkStock() {
        // Simulação de verificação de estoque
        if (realOrder.getQuantity() <= 10) {
            System.out.println("Estoque disponivel para ->>> " + realOrder.getProduct());
            return true;
        } else {
            System.out.println("Estoque indisponivel para ->>> " + realOrder.getProduct());
            return false;
        }
    }

    @Override
    public void processOrder() {
        if (checkStock()) {
            realOrder.processOrder();
        } else {
            System.out.println("Order cannot be processed due to insufficient stock.");
        }
    }
}
