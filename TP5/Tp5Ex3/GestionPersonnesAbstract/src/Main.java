import ayad.gest_personnes.Personne;
import ayad.gest_personnes.Utilisateur;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        List<Utilisateur> utilisateurs = new ArrayList<>();
        utilisateurs.add(new Utilisateur(1, "Zakaria Ayad", 7000.00d, "zakaria", "0000"));
        utilisateurs.add(new Utilisateur(2, "Kamal Titi", 1000.00d, "kamal", "1111"));

        Scanner scanner = new Scanner(System.in);

        int attempts = 3;
        boolean isAuthenticated = false;

        while (attempts > 0 && !isAuthenticated){
            System.out.println("entrez login : ");
            String login = scanner.nextLine();

            System.out.println("entrez password : ");
            String password = scanner.nextLine();

            for (Utilisateur utilisateur : utilisateurs) {
                if (login.equals(utilisateur.getLogin()) && password.equals(utilisateur.getPassword())) {
                    System.out.println("Authentification réussie :)");
                    System.out.println(utilisateur.showPersonne());
                    isAuthenticated = true;
                    break;
                }
            }


        }


        if (!isAuthenticated) {
            attempts--;
            if (attempts > 0) {
                System.out.println("Échec d'authentification. Il vous reste " + attempts + " tentative(s).");
            } else {
                System.out.println("Échec d'authentification. Nombre maximum de tentatives atteint.");
            }
        }

        }
    }
