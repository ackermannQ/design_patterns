public class Movie extends Article {

    public Movie(String name, float price) {
        super(name, price);
        paymentBehaviour = new PaypalPayment("85211", "pass");
    }
}
