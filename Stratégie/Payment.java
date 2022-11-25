public class Payment {
    private PaiementStrategie strategie;

    public Payment(PaiementStrategie strategie) {
        this.strategie = strategie;
    }

    void excutePayment(){
        if (strategie == null){
            System.out.println("Aucun moyen de paiement n'a été défini");
            return;
        }
        strategie.pay();
    }

    public void setStrategie(PaiementStrategie strategie) {
        this.strategie = strategie;
    }
}
