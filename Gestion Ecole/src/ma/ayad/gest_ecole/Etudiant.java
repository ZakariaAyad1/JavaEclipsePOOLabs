package ma.ayad.gest_ecole;

import java.time.LocalDate;

public class Etudiant extends Personne{
    private String CNE;
    private String noApogee;
    private String filiere;

    public Etudiant(String nom, String prenom, Genre genre, String CIN, LocalDate dateNaiss, String tel, String email, String CNE, String noApogee, String filiere) {
        super(nom, prenom, genre, CIN, dateNaiss, tel, email);
        this.CNE = CNE;
        this.noApogee = noApogee;
        this.filiere = filiere;
    }

    public Etudiant(String nom, String prenom, Genre genre, String CIN, LocalDate dateNaiss, String CNE, String noApogee, String filiere) {
        super(nom, prenom, genre, CIN, dateNaiss, "", "");
        this.CNE = CNE;
        this.noApogee = noApogee;
        this.filiere = filiere;
    }

    public Etudiant(Personne personne, String CNE, String noApogee, String filiere) {
        super(personne.getNom(), personne.getPrenom(), personne.getGenre(), personne.getCIN(), personne.getDateNaiss(), personne.getTel(), personne.getEmail());
        this.CNE = CNE;
        this.noApogee = noApogee;
        this.filiere = filiere;
    }

    public String getCNE() {
        return CNE;
    }

    public String getNoApogee() {
        return noApogee;
    }

    public String getFiliere() {
        return filiere;
    }

    public void setCNE(String CNE) {
        this.CNE = CNE;
    }

    public void setNoApogee(String noApogee) {
        this.noApogee = noApogee;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }

    @Override
    public String toString() {
        return super.toString() + ", CNE=" + CNE + ", noApogee=" + noApogee + ", filiere=" + filiere;
    }


}
