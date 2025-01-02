package ma.ayad.gest_ecole;

import java.time.LocalDate;

public class EnseignantVacataire extends Enseignant{
    private LocalDate dateDebut;
    private int nbreHeures;
    private double prixHeure;


    public EnseignantVacataire(String nom, String prenom, Genre genre, String CIN, LocalDate dateNaiss,
                               String tel, String email, String dernierDiplome, String specialite,
                               LocalDate dateDebut, int nbreHeures, double prixHeure) {
        super(nom, prenom, genre, CIN, dateNaiss, tel, email, dernierDiplome, specialite);
        this.dateDebut = dateDebut;
        this.nbreHeures = nbreHeures;
        this.prixHeure = prixHeure;
    }

    public EnseignantVacataire(String nom, String prenom, Genre genre, String CIN, LocalDate dateNaiss, String dernierDiplome, String specialite,
                               LocalDate dateDebut, int nbreHeures, double prixHeure) {
        super(nom, prenom, genre, CIN, dateNaiss, "", "", dernierDiplome, specialite);
        this.dateDebut = dateDebut;
        this.nbreHeures = nbreHeures;
        this.prixHeure = prixHeure;
    }

    public EnseignantVacataire(Enseignant enseignant, LocalDate dateDebut, int nbreHeures, double prixHeure) {
        super(enseignant.getNom(), enseignant.getPrenom(), enseignant.getGenre(), enseignant.getCIN(),
                enseignant.getDateNaiss(), enseignant.getTel(), enseignant.getEmail(),
                enseignant.getDernierDiplome(), enseignant.getSpecialite());
        this.dateDebut = dateDebut;
        this.nbreHeures = nbreHeures;
        this.prixHeure = prixHeure;
    }

    @Override
    public String toString() {
        return "EnseignantVacataire{" +
                "dateDebut=" + dateDebut +
                ", nbreHeures=" + nbreHeures +
                ", prixHeure=" + prixHeure +
                ", paie=" + calculPaie() +
                "} " + super.toString();
    }


    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public int getNbreHeures() {
        return nbreHeures;
    }

    public void setNbreHeures(int nbreHeures) {
        this.nbreHeures = nbreHeures;
    }

    public double getPrixHeure() {
        return prixHeure;
    }

    public void setPrixHeure(double prixHeure) {
        this.prixHeure = prixHeure;
    }


    public double calculPaie() {
        return nbreHeures * prixHeure;
    }


}
