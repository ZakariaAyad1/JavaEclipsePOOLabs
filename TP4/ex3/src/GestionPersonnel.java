import java.util.ArrayList;

public class GestionPersonnel {
    private ArrayList<Employe> listeEmployes;

    public GestionPersonnel() {
        this.listeEmployes = new ArrayList<>();
    }

    public void ajouterEmploye(Employe employe) {
        listeEmployes.add(employe);
    }

    public double calculerSommeSalaires(){
        double somme = 0.0;
        for (Employe employe:listeEmployes){
            somme += employe.calculerSalaire();
        }
        return somme;
    }

    public void afficherToutLePersonnel(){
        System.out.println("Liste du personnel de l'entreprise : ");
        for (Employe employe:listeEmployes){
            employe.afficherCaracteristiques();
            System.out.println("");
            System.out.println("-----------------------------------------");
            System.out.println("");
        }
    }


}
