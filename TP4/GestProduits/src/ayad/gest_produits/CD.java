package ayad.gest_produits;

public class CD extends Produit{
    private String titre;
    private String auteur;
    private Double prix;

    public CD(long id ,String titre, String auteur, double prix) {
        super(id);
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
    }

    @Override
    public void print(){
        System.out.println("CD [ Id : " + getId() + "," + titre +" de " + auteur + ", pour un prix exceptionnel de : " + prix +" ]");
    }

}
