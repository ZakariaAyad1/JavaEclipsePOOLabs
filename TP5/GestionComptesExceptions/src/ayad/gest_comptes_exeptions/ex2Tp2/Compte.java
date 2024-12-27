package ayad.gest_comptes_exeptions.ex2Tp2;




public class Compte {

    String nomTitulaire ;

    private int solde = 0 ;

    public void deposer(int montant){
        solde = solde + montant ;
    }

    public void retirer (int montant){

        if (montant <= solde) {
            solde = solde - montant ;
        }else {
            System.out.println("solde insufisant");
        }

    }

    public void virerVers(int montant, Compte destination) {
        try{
            this.retirer(montant);
            destination.deposer(montant);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void afficher(){
        System.out.println("solde : " + solde) ;
        System.out.println("le nom titulaire du compte (de type String) " + nomTitulaire);

    }

    public Compte(String nomTitulaire) {
        this.nomTitulaire = nomTitulaire;
    }

    // Constructeur par défaut
    public Compte() {
        this.nomTitulaire = "Titulaire inconnu";
    }

}
