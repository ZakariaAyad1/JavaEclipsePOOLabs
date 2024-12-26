public class Commercial extends Employe {
    private double ventesDernierMois;
    private static double partieFixe = 2000.0;

    public Commercial(String nom, String matricule, double ventesDernierMois) {
        super(nom, matricule, 0.0); // L'indice salarial n'est pas utilisé pour un commercial
        this.ventesDernierMois = ventesDernierMois;
    }

    public void mettreAJourVentes(double nouvellesVentes) {
        this.ventesDernierMois = nouvellesVentes;
    }

    @Override
    public double calculerSalaire() {
        return partieFixe + (ventesDernierMois / 10);
    }

    @Override
    public void afficherCaracteristiques() {
        System.out.println("Nom : " + getNom());
        System.out.println("Matricule : " + getMatricule());
        System.out.println("Ventes du dernier mois : " + ventesDernierMois);
        System.out.println("Salaire : " + calculerSalaire());
    }
}

