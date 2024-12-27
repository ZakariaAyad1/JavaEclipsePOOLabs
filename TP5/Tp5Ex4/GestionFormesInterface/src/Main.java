import ayad.gestion_formes.Carre;
import ayad.gestion_formes.Cercle;
import ayad.gestion_formes.Forme;
import ayad.gestion_formes.Rectangle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(15, 10.5) ;
        r.affiche() ;
        List<Forme> formes = new ArrayList() ;
        formes.add(r);
        Carre c = new Carre(21.55) ;
        c.affiche() ;
        formes.add(c) ;
        Cercle cl = new Cercle(8) ;
        cl.affiche() ;
        formes.add(cl) ;
        for(Forme f: formes)
            System.out.println(f.toString() + " => Surface (en cm^2) = " + f.getSurface()) ;


        /*
        resultat de ce programe:

        Rectangle(Longueur : 15.0 cm; Largeur : 10.5 cm)
        Carré(Côté : 21.55 cm)
        Cercle(Rayon : 8.0 cm)
        Rectangle(Longueur : 15.0 cm, Largeur : 10.5 cm) => Surface (en cm^2) = 157.5
        Carré(Côté : 21.55 cm) => Surface (en cm^2) = 464.40250000000003
        Cercle(Rayon : 8.0 cm) => Surface (en cm^2) = 201.06192982974676

         */


    }
}