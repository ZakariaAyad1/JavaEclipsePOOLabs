import zakaria.gest_personnes.Personne;
import zakaria.gest_personnes.Utilisateur;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Utilisateur[] utilisateurs = {
                new Utilisateur(1, "Zakaria ayad" , 7000.00d ,"zakaria", "0000"),
                new Utilisateur(2, "kamal titi" , 1000.00d ,"kamal", "1111")
        };

        Scanner scanner = new Scanner(System.in);

        System.out.println("entrez login : ");
        String login = scanner.nextLine();

        System.out.println("entrez password : ");
        String password = scanner.nextLine();

        Personne p = new Personne();

        for(int i = 0 ; i<utilisateurs.length ; i++){
            if (login.equals(utilisateurs[i].getLogin())  && password.equals(utilisateurs[i].getPassword()) ){
                System.out.println("Autentification reussie:)");
                System.out.println("votre login : " + utilisateurs[i].getLogin());
                System.out.println("votre password : " + utilisateurs[i].getPassword());

//                utilisateurs[i].showUtilisateur();
//                p.showPersonne();
                System.out.println(utilisateurs[i]);

            }else {
                System.out.println("Echec d'authentification (:!" );

            }

        }
    }
}