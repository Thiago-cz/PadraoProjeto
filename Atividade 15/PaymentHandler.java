public class PaymentHandler implements OrderHandler {
    private OrderHandler nextHandler;

    @Override
    public void setNextHandler(OrderHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handle(IOrder order) {
        System.out.println("Processando pagamento");
        if (nextHandler != null) {
            nextHandler.handle(order);
        }
    }
}
