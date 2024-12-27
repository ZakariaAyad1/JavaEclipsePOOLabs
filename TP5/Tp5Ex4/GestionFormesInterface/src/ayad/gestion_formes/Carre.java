package ayad.gestion_formes;

public class Carre extends Rectangle {
    public Carre(double cote) {
        super(cote, cote);
    }

    @Override
    public void affiche() {
        System.out.println("Carré(Côté : " + longueur + " cm)");
    }

    @Override
    public String toString() {
        return "Carré(Côté : " + longueur + " cm)";
    }
}
