public class CouponDiscount extends DiscountDecorator {
    private double couponValue;

    public CouponDiscount(Discount discount, double couponValue) {
        super(discount);
        this.couponValue = couponValue;
    }

    @Override
    public double applyDiscount(double price) {
        return super.applyDiscount(price) - couponValue;
    }
}
