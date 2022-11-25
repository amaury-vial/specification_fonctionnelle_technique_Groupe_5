public class PaiementPaypal implements PaiementStrategie{

    @Override
    public void pay() {
        System.out.println("Paiement Paypal effectué avec succès");
    }
}
