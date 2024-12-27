package ayad.gest_comptes_exeptions.ex1Tp3;


import java.time.LocalDateTime;
import java.util.Scanner;

public class MainCompte trow exception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index=0;
        int choix;
        Compte[] compte = null;
        do{


                System.out.println("1. Ajouter un tableau de comptes\n" +
                        "2. Afficher tous les comptes\n" +
                        "3. Afficher les comptes qui ont un montant >= 3210 Dhs  \n" +
                        "4. Afficher les comptes qui ont un montant < 350 Dhs  \n" +
                        "5. Afficher les comptes crees avant le 25/11/2024 \n" +
                        "6. Quitter le programme");

                System.out.println("entrez votre choix : ");
                choix = scanner.nextInt();



            switch (choix){
                case 1 :
                    System.out.println("entrer la taille de table :");
                    int taille = scanner.nextInt();
                    scanner.nextLine();

                    compte = new Compte[taille];
                    while (index < taille) {

                        System.out.print("Entrez le numéro du compte : ");
                        int no = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Entrez le titulaire du compte : ");
                        String titulaire = scanner.nextLine();

                        System.out.print("Entrez le solde initial : ");
                        double solde = scanner.nextDouble();

                        LocalDateTime dateCreation = LocalDateTime.now();

                        compte[index] = new Compte(no, titulaire, dateCreation, solde);
                        index++;
                        System.out.println("avec succes.");
                    }
                    break;
                case 2 :
                    System.out.println("Affichage de tous les comptes");
                    for(int i = 0 ; i< compte.length ; i++){
                        System.out.println(compte[i]);
                    }
                    break;
                case 3 :
                    System.out.println("Affichage des comptes qui ont un montant >= 3210 Dhs");
                    for(int i = 0 ; i< compte.length ; i++){
                        if(compte[i] != null && compte[i].getSolde() >= 3210){
                            System.out.println(compte[i]);
                        }
                    }
                    break;
                case 4 :
                    for(int i = 0 ; i< compte.length ; i++){
                        if(compte[i] != null && compte[i].getSolde() < 350){
                            System.out.println(compte[i]);
                        }
                    }
                    break;


                case 5 :
                    System.out.println("Affichage des comptes créés avant le 25/11/2024");

                    LocalDateTime dateRecherchee = LocalDateTime.of(2024, 11, 25, 0, 0);
                    boolean compteTrouve = false;

                    for(int i = 0 ; i< compte.length ; i++){
                        if(compte[i] != null && compte[i].getDateCreation().toLocalDate().isBefore(dateRecherchee.toLocalDate())){
                            System.out.println(compte[i]);
                            compteTrouve = true;
                        }
                    }
                    if (!compteTrouve) {
                        System.out.println("Aucun compte n'a été créé avant le 25/11/2024.");
                    }

                    break;
                case 6 :

                    System.out.println("vous avez Quitter le programme");
                    System.exit(0);

                default :
                    System.out.println("vous n avez pas entrer un valide");
            }
        }while (choix!=6);

    }
}