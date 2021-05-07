public class Article {
    private String name;
    private float price;
    Payment paymentBehaviour;

    public Article(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPaymentBehaviour(Payment payment) {
        paymentBehaviour = payment;
    }

    public void performPayment() {
        float price = this.getPrice();
        paymentBehaviour.pay(price);
    }
}
