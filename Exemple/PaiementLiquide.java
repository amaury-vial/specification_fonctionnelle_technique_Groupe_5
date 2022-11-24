public class PaiementLiquide implements PaiementStrategie{
    @Override
    public void pay() {
        System.out.println("Paiement en liquide accepté");
    }
}
