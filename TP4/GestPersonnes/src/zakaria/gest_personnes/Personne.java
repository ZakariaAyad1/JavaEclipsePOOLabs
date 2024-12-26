package zakaria.gest_personnes;

public class Personne {

    private int id ;
    private String nomComplet;
    private double salaire;

    public int getId() {
        return id;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }


    public Personne() {

    }

    public Personne(int id, String nomComplet, double salaire) {
        this.id = id;
        this.nomComplet = nomComplet;
        this.salaire = salaire;
    }

    public Personne(String nomComplet, int id) {
        this.nomComplet = nomComplet;
        this.id = id;
    }

    public Personne(Personne per) {
        this.salaire =per.salaire;
        this.nomComplet = per.nomComplet;
        this.id = per.id;
    }

    public String showPersonne(){
        return "Personne [ ID : " + this.id + "; Prenom Nom : " + this.nomComplet + "; Salaire : " + this.salaire + " Dhs ].";
    }

    @Override
    public String toString() {
        return "Personne{" +
                "id=" + id +
                ", nomComplet='" + nomComplet + '\'' +
                ", salaire=" + salaire +
                '}';
    }
}
