package ma.ayad.gest_ecole;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class EnseignantChercheur extends Enseignant {

    private LocalDate dateEmb;
    private String SOM;
    private String RIB;
    private String cadre; // PA, PH, PES
    private String grade; // A, B, C, D
    private double salaireMensuel;
    private int volumeAnnuel;
    private static final int AGE_RETRAITE = 63;

    public EnseignantChercheur(String nom, String prenom, Genre genre, String CIN, LocalDate dateNaiss, String tel, String email,
                               String dernierDiplome, String specialite, LocalDate dateEmb, String SOM, String RIB,
                               String cadre, String grade, double salaireMensuel, int volumeAnnuel) {
        super(nom, prenom, genre, CIN, dateNaiss, tel, email, dernierDiplome, specialite);
        if (!dernierDiplome.equalsIgnoreCase("Doctorat")) {
            /*throw new IllegalArgumentException("Manque diplôme PhD");*/
            System.out.println("fnfjudjffnvvvvvvvvvvvvvvv");
        }

        this.dateEmb = dateEmb;
        this.SOM = SOM;
        this.RIB = RIB;
        this.cadre = cadre;
        this.grade = grade;
        this.salaireMensuel = salaireMensuel;
        this.volumeAnnuel = volumeAnnuel;
    }

    public EnseignantChercheur(String nom, String prenom, Genre genre, String CIN, LocalDate dateNaiss,
                               String dernierDiplome, String specialite, LocalDate dateEmb, String SOM, String RIB,
                               String cadre, String grade, double salaireMensuel, int volumeAnnuel) {
        super(nom, prenom, genre, CIN, dateNaiss, "", "", dernierDiplome, specialite);
        if (!dernierDiplome.equalsIgnoreCase("Doctorat")) {
            /*throw new IllegalArgumentException("Manque diplôme PhD");*/
            System.out.println("fnfjudjffnvvvvvvvvvvvvvvv");
        }

        this.dateEmb = dateEmb;
        this.SOM = SOM;
        this.RIB = RIB;
        this.cadre = cadre;
        this.grade = grade;
        this.salaireMensuel = salaireMensuel;
        this.volumeAnnuel = volumeAnnuel;
    }

/*
    public EnseignantChercheur(String nom, String prenom, Genre genre, String CIN, LocalDate dateNaiss,
                               String dernierDiplome, String specialite, LocalDate dateEmb, String SOM, String RIB,
                               String cadre, String grade, double salaireMensuel, int volumeAnnuel) {
        super(nom, prenom, genre, CIN, dateNaiss, "", "", dernierDiplome, specialite);
        if (!dernierDiplome.equalsIgnoreCase("Doctorat")) {
            throw new IllegalArgumentException("Manque diplôme PhD");
        }

        this.dateEmb = dateEmb;
        this.SOM = SOM;
        this.RIB = RIB;
        this.cadre = cadre;
        this.grade = grade;
        this.salaireMensuel = salaireMensuel;
        this.volumeAnnuel = volumeAnnuel;
    }
*/

    public EnseignantChercheur(String nom, String prenom, Genre genre, String CIN, LocalDate dateNaiss,
                               String dernierDiplome, String specialite, LocalDate dateEmb, String SOM, String RIB,
                               String cadre, String grade, double salaireMensuel) {
        super(nom, prenom, genre, CIN, dateNaiss, "", "", dernierDiplome, specialite);
        if (!dernierDiplome.equalsIgnoreCase("Doctorat")) {
            /*throw new IllegalArgumentException("Manque diplôme PhD");*/
            System.out.println("fnfjudjffnvvvvvvvvvvvvvvv");
        }

        this.dateEmb = dateEmb;
        this.SOM = SOM;
        this.RIB = RIB;
        this.cadre = cadre;
        this.grade = grade;
        this.salaireMensuel = salaireMensuel;
        this.volumeAnnuel = cadre.equalsIgnoreCase("PA") || cadre.equalsIgnoreCase("PH") ? 300 : 240;
    }



/*
    public EnseignantChercheur(String nom, String prenom, Genre genre, String CIN, LocalDate dateNaiss,
                               String dernierDiplome, String specialite, LocalDate dateEmb, String SOM, String RIB,
                               String cadre, String grade, double salaireMensuel) {
        super(nom, prenom, genre, CIN, dateNaiss, "", "", dernierDiplome, specialite);
        if (!dernierDiplome.equalsIgnoreCase("Doctorat")) {
            throw new IllegalArgumentException("Manque diplôme PhD");
        }

        this.dateEmb = dateEmb;
        this.SOM = SOM;
        this.RIB = RIB;
        this.cadre = cadre;
        this.grade = grade;
        this.salaireMensuel = salaireMensuel;
        this.volumeAnnuel = cadre.equalsIgnoreCase("PA") || cadre.equalsIgnoreCase("PH") ? 300 : 240;
    }

 */


    public EnseignantChercheur(Enseignant enseignant, LocalDate dateEmb, String SOM, String RIB,
                               String cadre, String grade, double salaireMensuel, int volumeAnnuel) {
        super(enseignant);

        if (!enseignant.getDernierDiplome().equalsIgnoreCase("Doctorat")) {
            throw new IllegalArgumentException("Manque diplôme PhD");
        }


        this.dateEmb = dateEmb;
        this.SOM = SOM;
        this.RIB = RIB;
        this.cadre = cadre;
        this.grade = grade;
        this.salaireMensuel = salaireMensuel;
        this.volumeAnnuel = volumeAnnuel;
    }


    public int calculAnciennete() {
        LocalDate today = LocalDate.now();
        return (int) ChronoUnit.YEARS.between(this.dateEmb, today);
    }


    public LocalDate getDateEmb() {
        return dateEmb;
    }

    public void setDateEmb(LocalDate dateEmb) {
        this.dateEmb = dateEmb;
    }

    public String getSOM() {
        return SOM;
    }

    public void setSOM(String SOM) {
        this.SOM = SOM;
    }

    public String getRIB() {
        return RIB;
    }

    public void setRIB(String RIB) {
        this.RIB = RIB;
    }

    public String getCadre() {
        return cadre;
    }

    public void setCadre(String cadre) {
        this.cadre = cadre;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getSalaireMensuel() {
        return salaireMensuel;
    }

    public void setSalaireMensuel(double salaireMensuel) {
        this.salaireMensuel = salaireMensuel;
    }

    public int getVolumeAnnuel() {
        return volumeAnnuel;
    }

    public void setVolumeAnnuel(int volumeAnnuel) {
        this.volumeAnnuel = volumeAnnuel;
    }

    public static int getAgeRetraite() {
        return AGE_RETRAITE;
    }

    @Override
    public String toString() {
        return "EnseignantChercheur{" +
                "dernierDiplome='" + getDernierDiplome() + '\'' +
                ", specialite='" + getSpecialite() + '\'' +
                ", dateEmb=" + dateEmb +
                ", SOM='" + SOM + '\'' +
                ", RIB='" + RIB + '\'' +
                ", cadre='" + cadre + '\'' +
                ", grade='" + grade + '\'' +
                ", salaireMensuel=" + salaireMensuel +
                ", volumeAnnuel=" + volumeAnnuel +
                ", ageRetraite=" + AGE_RETRAITE +
                "} " + super.toString();
    }

}
