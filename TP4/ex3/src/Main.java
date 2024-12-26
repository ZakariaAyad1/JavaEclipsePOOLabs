public class Main {
    public static void main(String[] args) {

        Employe employe1 = new Employe("zakaria ayad" , "zkad" , 1);
        Employe employe2 = new Employe("abdou raissoni" , "pwiwa" , 2);

        Commercial commercial1 = new Commercial("Charlie", "COMM001", 5000.0);
        Commercial commercial2 = new Commercial("David", "COMM002", 3000.0);

        Responsable responsable1 = new Responsable("Eve", "RESP001", 4.0);
        Responsable responsable2 = new Responsable("Frank", "RESP002", 5.0);

        responsable1.ajouterInferieur(employe1);
        responsable1.ajouterInferieur(commercial1);
        responsable2.ajouterInferieur(employe2);
        responsable2.ajouterInferieur(commercial2);

        GestionPersonnel gestion = new GestionPersonnel();

        gestion.ajouterEmploye(employe1);
        gestion.ajouterEmploye(employe2);
        gestion.ajouterEmploye(commercial1);
        gestion.ajouterEmploye(commercial2);
        gestion.ajouterEmploye(responsable1);
        gestion.ajouterEmploye(responsable2);

        gestion.afficherToutLePersonnel();

        double totalSalaires = gestion.calculerSommeSalaires();
        System.out.println("Total des salaires de l'entreprise : " + totalSalaires);

    }
}