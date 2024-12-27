package ayad.gestion_formes;

public class Cercle implements Forme {
    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    public double getSurface(){
        return Math.PI * rayon * rayon;
    }

    public void affiche(){
        System.out.println("Cercle(Rayon : " + rayon + " cm)");
    }

    @Override
    public String toString() {
        return "Cercle(Rayon : " + rayon + " cm)";
    }
}
