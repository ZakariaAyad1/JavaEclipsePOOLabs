public class Employe {
    private String nom;
    private String matricule;
    private double indiceSalarial;

    public Employe(String nom, String matricule, double indiceSalarial) {
        this.nom = nom;
        this.matricule = matricule;
        this.indiceSalarial = indiceSalarial;
    }

    private static double valeurSalaire = 1000.0;

    public void afficherCaracteristiques() {
        System.out.println("Nom : " + nom);
        System.out.println("Matricule : " + matricule);
        System.out.println("Indice Salarial : " + indiceSalarial);
    }

    public double calculerSalaire() {
        return indiceSalarial * valeurSalaire;
    }

    public static void augmenterSalaire(double pourcentage) {
        valeurSalaire += valeurSalaire * pourcentage / 100;
    }

    public String getNom() {
        return nom;
    }

    public String getMatricule() {
        return matricule;
    }

    public double getIndiceSalarial() {
        return indiceSalarial;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public void setIndiceSalarial(double indiceSalarial) {
        this.indiceSalarial = indiceSalarial;
    }
}










