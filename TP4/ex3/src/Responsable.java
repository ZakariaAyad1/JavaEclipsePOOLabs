import java.util.ArrayList;
import java.util.List;

public class Responsable extends Employe {
    private List<Employe> inferieursDirects;

    public Responsable(String nom, String matricule, double indiceSalarial) {
        super(nom, matricule, indiceSalarial);
        inferieursDirects = new ArrayList<>();
    }

    public void ajouterInferieur(Employe employe) {
        inferieursDirects.add(employe);
    }

    public void afficherInferieursDirects() {
        for (Employe employe : inferieursDirects) {
            System.out.println("  - " + employe.getNom());
        }
    }

    public void afficherInferieursIndirects() {
        afficherInferieursDirects();
        for (Employe employe : inferieursDirects) {
            if (employe instanceof Responsable) {
                ((Responsable) employe).afficherInferieursIndirects();
            }
        }
    }
}
