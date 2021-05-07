public class Book extends Article {

    public Book(String name, float price) {
        super(name, price);
        paymentBehaviour = new CardPayment("12345678978975", "000", "01/01");
    }
}
