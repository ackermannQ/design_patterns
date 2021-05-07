public class PaypalPayment implements Payment {

    private String id;
    private String password;

    public PaypalPayment(String id, String password) {
        this.id = id;
        this.password = password;

    }

    @Override
    public void pay(float price) {
        System.out.println("Currently paying with Paypal: " + price + " $");
    }
}
