public abstract class DiscountDecorator implements Discount {
    protected Discount discount;

    public DiscountDecorator(Discount discount) {
        this.discount = discount;
    }

    @Override
    public double applyDiscount(double price) {
        return discount.applyDiscount(price);
    }
}
