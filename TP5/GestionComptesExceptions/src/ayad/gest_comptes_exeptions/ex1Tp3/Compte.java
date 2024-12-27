package ayad.gest_comptes_exeptions.ex1Tp3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Compte {

    private int no;
    private String titulaireCompte;
    private LocalDateTime dateCreation;
    private double solde;

    public Compte() {
        this.no = 0;
        this.titulaireCompte = " ";
        this.dateCreation =LocalDateTime.now();
        this.solde =0.0;
    }

    public Compte(int no, String titulaireCompte, LocalDateTime dateCreation, double solde){
        this.no = no;
        this.titulaireCompte = titulaireCompte;
        this.dateCreation = dateCreation;
        this.solde = solde;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return "Compte " + no + " [Titulaire : " + titulaireCompte +
                " ; Solde au " + dateCreation.format(formatter) + " est : " + solde + " Dhs]";
    }



    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getTitulaireCompte() {
        return titulaireCompte;
    }

    public void setTitulaireCompte(String titulaireCompte) {
        this.titulaireCompte = titulaireCompte;
    }

    public LocalDateTime getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDateTime dateCreation) {
        this.dateCreation = dateCreation;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

}

