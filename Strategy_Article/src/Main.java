public class Main {
    public static void main(String[] args) {

        Book book = new Book("Book", 35);
        Movie movie = new Movie("Movie", 9);

        System.out.println("I'm buying a: " + book.getName());
        book.performPayment();

        System.out.println("I'm buying a: " + movie.getName());
        movie.performPayment();

        book.setPaymentBehaviour(new PaypalPayment("85211", "pass"));
        System.out.println("I changed the payment method for buying a: " + book.getName());
        book.performPayment();
    }
}
