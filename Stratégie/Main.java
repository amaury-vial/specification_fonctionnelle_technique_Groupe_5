public class Main {
    public static void main(String[] args) {
    Payment payment = new Payment(new PaiementPaypal());
    payment.excutePayment();

    payment.setStrategie(new PaiementCarteBleue());
    payment.excutePayment();

    payment.setStrategie(new PaiementLiquide());
    payment.excutePayment();

    payment.setStrategie(null);
    payment.excutePayment();
    }
}