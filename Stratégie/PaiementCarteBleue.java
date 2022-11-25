public class PaiementCarteBleue implements PaiementStrategie{
    @Override
    public void pay() {
        System.out.println("Paiement en CB effectué avec succès");
    }
}
