public class StockHandler implements OrderHandler {
    private OrderHandler nextHandler;

    @Override
    public void setNextHandler(OrderHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handle(IOrder order) {
        if (order instanceof ProxyOrder) {
            ProxyOrder proxyOrder = (ProxyOrder) order;
            proxyOrder.processOrder();
        }
        if (nextHandler != null) {
            nextHandler.handle(order);
        }
    }
}
