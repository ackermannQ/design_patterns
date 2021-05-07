public class CardPayment implements Payment {

    private String cardNumber;
    private String cryptogram;
    private String expirationDate;

    public CardPayment(String cardNumber, String cryptogram, String expirationDate) {
        this.cardNumber = cardNumber;
        this.cryptogram = cryptogram;
        this.expirationDate = expirationDate;
    }

    @Override
    public void pay(float price) {
        System.out.println("Currently paying with a card: "+ price + " $");
    }
}
