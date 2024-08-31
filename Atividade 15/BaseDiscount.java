public class BaseDiscount implements Discount {
    private double price;

    public BaseDiscount(double price) {
        this.price = price;
    }

    @Override
    public double applyDiscount(double price) {
        return this.price;
    }
}
