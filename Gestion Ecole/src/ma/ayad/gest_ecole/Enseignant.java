package ma.ayad.gest_ecole;
import java.time.LocalDate;


public class Enseignant extends Personne{
    private String dernierDiplome;
    private String specialite;

    public Enseignant(String nom, String prenom, Genre genre, String CIN, LocalDate dateNaiss, String tel, String email,
                      String dernierDiplome, String specialite) {
        super(nom, prenom, genre, CIN, dateNaiss, tel, email);
        this.dernierDiplome = dernierDiplome;
        this.specialite = specialite;
    }

    public Enseignant(String nom, String prenom, Genre genre, String CIN, LocalDate dateNaiss,
                      String dernierDiplome, String specialite) {
        super(nom, prenom, genre, CIN, dateNaiss);
        this.dernierDiplome = dernierDiplome;
        this.specialite = specialite;
    }

    public Enseignant(Personne personne, String dernierDiplome, String specialite) {
        super(personne);
        this.dernierDiplome = dernierDiplome;
        this.specialite = specialite;
    }

    public Enseignant(Enseignant enseignant) {
        super(enseignant);
        this.dernierDiplome = enseignant.dernierDiplome;
        this.specialite = enseignant.specialite;
    }


    public String getDernierDiplome() {
        return dernierDiplome;
    }

    public void setDernierDiplome(String dernierDiplome) {
        this.dernierDiplome = dernierDiplome;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    @Override
    public String toString() {
        return "Enseignant{" +
                "idP=" + getIdP() +
                ", nom='" + getNom() + '\'' +
                ", prenom='" + getPrenom() + '\'' +
                ", genre=" + getGenre() +
                ", CIN='" + getCIN() + '\'' +
                ", dateNaiss=" + getDateNaiss() +
                ", tel='" + getTel() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", dernierDiplome='" + dernierDiplome + '\'' +
                ", specialite='" + specialite + '\'' +
                '}';
    }



}
