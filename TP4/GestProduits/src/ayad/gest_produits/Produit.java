package ayad.gest_produits;

public class Produit {

    private long id;

    public Produit(long id) {
        this.id = id;
    }
    public void print(){
        System.out.println("Produit [ ID : " +  id + " ]");
    }

    public long getId() {
        return id;
    }
}
