public interface OrderHandler {
    void setNextHandler(OrderHandler handler);
    void handle(IOrder order);
}
