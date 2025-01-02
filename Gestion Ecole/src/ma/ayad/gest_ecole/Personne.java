package ma.ayad.gest_ecole;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Personne {
    private static int idPCounter = 1;
    private int idP;
    private String nom;
    private String prenom;
    private Genre genre;
    private String CIN;
    private LocalDate dateNaiss;
    private String tel;
    private String email;

    public Personne(String nom, String prenom, Genre genre, String CIN, LocalDate dateNaiss, String tel, String email) {
        this.idP = idPCounter++;
        this.nom = nom;
        this.prenom = prenom;
        this.genre = genre;
        this.CIN = CIN;
        this.dateNaiss = dateNaiss;
        this.tel = tel;
        this.email = email;
    }


    public int getIdP() {
        return idP;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Genre getGenre() {
        return genre;
    }

    public String getCIN() {
        return CIN;
    }

    public LocalDate getDateNaiss() {
        return dateNaiss;
    }

    public String getTel() {
        return tel;
    }

    public String getEmail() {
        return email;
    }


    public void setIdP(int idP) {
        this.idP = idP;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void setCIN(String CIN) {
        this.CIN = CIN;
    }

    public void setDateNaiss(LocalDate dateNaiss) {
        this.dateNaiss = dateNaiss;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Personne(String nom, String prenom, Genre genre, String CIN, LocalDate dateNaiss) {
        this.idP = idPCounter++;
        this.nom = nom;
        this.prenom = prenom;
        this.genre = genre;
        this.CIN = CIN;
        this.dateNaiss = dateNaiss;
        this.tel = "";
        this.email = "";

    }

    public Personne(Personne Per) {
        this.idP = Per.idP;
        this.nom = Per.nom;
        this.prenom = Per.prenom;
        this.genre = Per.genre;
        this.CIN = Per.CIN;
        this.dateNaiss = Per.dateNaiss;
        this.tel = Per.tel;
        this.email = Per.email;
    }

    public int calculAge() {
        LocalDate today = LocalDate.now();
        return (int) ChronoUnit.YEARS.between(this.dateNaiss, today);
    }

    @Override
    public String toString() {
        return "Personne{" +
                "idP=" + idP +
                ", nom='" + nom.toUpperCase() + '\'' +
                ", prenom='" + prenom.toUpperCase() + '\'' +
                ", genre=" + genre +
                ", CIN='" + CIN + '\'' +
                ", dateNaiss=" + dateNaiss +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                ", age=" + calculAge() +
                '}';
    }

}
