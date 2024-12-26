import ayad.gest_produits.CD;
import ayad.gest_produits.Livre;
import ayad.gest_produits.Produit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CD cd1 = new CD(1 , "titre cd 1" , "Zakaria cd 1" , 200);
        Livre livre1 = new Livre(2 , "antigone" , "Zakaria lv 1" , 555);

        cd1.print();
        livre1.print();

        CD cd2 = new CD(1, "titre cd 1", "Zakaria cd 1", 20.99);
        Produit prd1 = cd2;
        prd1.print();

        Livre livre2 = new Livre(2 , "antigone" , "Zakaria lv 1" , 556);
        Produit prd2 = livre2;
        prd2.print();

    }

    // Remarque : Cet exercice illustre l'heritage, le polymorphisme et la redefinition de methodes en Java.
// - Nous avons une classe de base `Produit` et des classes derivees comme `CD` et `Livre` qui heritent de `Produit`.
// - Le polymorphisme permet d'utiliser des objets de types differents (`CD`, `Livre`) de maniere uniforme a travers une reference de type `Produit`.
// - La methode `toString()` a ete redefinie dans les classes derivees pour fournir une representation textuelle specifique de chaque type d'objet.
// - Cette approche facilite la gestion d'objets de types differents dans une structure uniforme et permet de rendre l'affichage des objets plus lisible et coherent.


}