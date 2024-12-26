package ayad.gest_produits;

public class Livre extends Produit{
    private String titre ;
    private String auteur ;
    private long isbn;

    public Livre(long id ,String titre, String auteur, long isbn) {
        super(id);
        this.titre = titre;
        this.auteur = auteur;
        this.isbn = isbn;
    }

    @Override
    public void print(){
        System.out.println("Livre [ ID : ( " + getId() + " ), " + titre + " de " + auteur + " (ISBN : "+ isbn +") ]");
    }


}
