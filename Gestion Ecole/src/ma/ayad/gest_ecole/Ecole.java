package ma.ayad.gest_ecole;

public class Ecole {
    private String nomEcole;
    private Enseignant[] enseignants;
    private Etudiant[] etudiants;

    public String getNomEcole() {
        return nomEcole;
    }

    public void setNomEcole(String nomEcole) {
        this.nomEcole = nomEcole;
    }

    public Enseignant[] getEnseignants() {
        return enseignants;
    }

    public void setEnseignants(Enseignant[] enseignants) {
        this.enseignants = enseignants;
    }

    public Etudiant[] getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(Etudiant[] etudiants) {
        this.etudiants = etudiants;
    }


    public Ecole() {
        this.nomEcole = "École sans nom";
        this.enseignants = new Enseignant[0];
        this.etudiants = new Etudiant[0];
    }

    public Ecole(String nomEcole, Enseignant[] enseignants, Etudiant[] etudiants) {
        this.nomEcole = nomEcole;
        this.enseignants = enseignants;
        this.etudiants = etudiants;
    }


    public void showEtudiants() {
        System.out.println("Liste des étudiants de " + nomEcole + ":");
        for (Etudiant etudiant : etudiants) {
            System.out.println(etudiant);
        }
    }


    public void showEnseignants() {
        System.out.println("Liste des enseignants de " + nomEcole + ":");
        for (Enseignant enseignant : enseignants) {
            String className = enseignant.getClass().getName();
            if (className.equals("ma.ayad.gest_ecole.EnseignantChercheur")) {
                System.out.println("[Chercheur] " + enseignant);
            } else if (className.equals("ma.ayad.gest_ecole.EnseignantVacataire")) {
                System.out.println("[Vacataire] " + enseignant);
            } else {
                System.out.println("[Enseignant] " + enseignant);
            }
        }
    }

    public double sommePaieVac() {
        double total = 0.0;
        for (Enseignant enseignant : enseignants) {
            if (enseignant instanceof EnseignantVacataire) {
                total += ((EnseignantVacataire) enseignant).calculPaie();
            }
        }
        return total;
    }
}
