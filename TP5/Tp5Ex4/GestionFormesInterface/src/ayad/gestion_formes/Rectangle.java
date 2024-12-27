package ayad.gestion_formes;

public class Rectangle implements Forme {
    protected double longueur;
    protected double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double getSurface() {
        return longueur * largeur;
    }

    @Override
    public void affiche() {
        System.out.println("Rectangle(Longueur : " + longueur + " cm; Largeur : " + largeur + " cm)");
    }

    @Override
    public String toString() {
        return "Rectangle(Longueur : " + longueur + " cm, Largeur : " + largeur + " cm)";
    }

}
