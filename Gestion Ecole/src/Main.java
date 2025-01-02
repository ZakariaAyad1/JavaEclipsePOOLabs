import ma.ayad.gest_ecole.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Personne p1 = new Personne("Ali", "JAWAdi", Genre.M, "CA1122", LocalDate.parse("1965-12-25"), "0606002522", "ali.jawadi@gmail.com");
        Personne p2 = new Personne("Med", "MAHMADI", Genre.M, "CA1213", LocalDate.parse("1960-12-28"));
        Personne p3 = new Personne("Mari", "REDAWI", Genre.F, "BA2211", LocalDate.of(2000, 04, 30));
        Personne p4 = new Personne(p3);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);


        Etudiant etudiant1 = new Etudiant("Ali", "JAWAdi", Genre.M, "CA1122", LocalDate.parse("1965-12-25"), "0606002522", "ali.jawadi@gmail.com", "CNE1", "APO1", "G1");
        Etudiant etudiant2 = new Etudiant("Med", "MAHMADI", Genre.M, "CA1213", LocalDate.parse("1960-12-28"), "CNE2", "APO2", "G2");
        Etudiant etudiant3 = new Etudiant(new Personne("Mari", "REDAWI", Genre.F, "BA2211", LocalDate.of(2000, 04, 30), "0606002523", "mari.redawi@gmail.com"), "CNE3", "APO3", "G3");

        System.out.println(etudiant1);
        System.out.println(etudiant2);
        System.out.println(etudiant3);


        Enseignant enseignant1 = new Enseignant("Ali", "Fassi", Genre.M, "CIN12345", LocalDate.of(1980, 5, 20),
                "0612345678", "ali.fassi@example.com", "Doctorat", "Informatique");

        Enseignant enseignant2 = new Enseignant("Sara", "Ben", Genre.F, "CIN67890", LocalDate.of(1985, 3, 15),
                "Master", "Mathématiques");

        Personne personne = new Personne("Youssef", "El", Genre.M, "CIN98765", LocalDate.of(1990, 7, 25));
        Enseignant enseignant3 = new Enseignant(personne, "Licence", "Physique");

        System.out.println(enseignant1);
        System.out.println(enseignant2);
        System.out.println(enseignant3);


        EnseignantChercheur enseignantChercheur1 = new EnseignantChercheur( "ayad",  "zakaria", Genre.M, "p221", LocalDate.of(1980, 5, 20), "0636552215", "ayad@gmail.com", "delf", "informatique", LocalDate.of(2019, 7, 25), "545956", "44216562", "PA", "A", 15000, 202);
        EnseignantChercheur enseignantChercheur2 = new EnseignantChercheur( "ayad",  "zakaria", Genre.M, "p221", LocalDate.of(1980, 5, 20), "delf", "informatique", LocalDate.of(2019, 7, 25), "5552332", "44216562", "PA", "A", 15000, 201);
        EnseignantChercheur enseignantChercheur3 = new EnseignantChercheur( "ayad",  "zakaria", Genre.M, "p221", LocalDate.of(1980, 5, 20), "delf", "informatique", LocalDate.of(2019, 7, 25), "4538553", "44216562", "PA", "A", 15000);
        EnseignantChercheur enseignantChercheur4 = new EnseignantChercheur( enseignant1,/* LocalDate.of(1980, 5, 20), "delf", "informatique",*/ LocalDate.of(2019, 7, 25), "1789325", "44216562", "PA", "A", 15000 , 8525);

        System.out.println(enseignantChercheur1);
        System.out.println(enseignantChercheur2);
        System.out.println(enseignantChercheur3);
        System.out.println(enseignantChercheur4);





        EnseignantVacataire vacataire1 = new EnseignantVacataire(
                "Omar", "Ali", Genre.M, "AB12345", LocalDate.of(1985, 3, 15),
                "06 12345678", "omar@ensate.ma", "Master", "Mathématiques",
                LocalDate.of(2023, 2, 1), 20, 150.0
        );
        System.out.println(vacataire1);

        EnseignantVacataire vacataire2 = new EnseignantVacataire(
                "Fatima", "Zahra", Genre.F, "CD67890", LocalDate.of(1990, 6, 20), "Licence", "Physique" , LocalDate.of(2023, 2, 1), 20, 150.0);
        System.out.println(vacataire2);

        Enseignant enseignant = new Enseignant(
                "Youssef", "Karim", Genre.M, "EF11223", LocalDate.of(1988, 5, 25),
                "06 11223344", "youssef@ensate.ma", "Doctorat", "Informatique"
        );
        EnseignantVacataire vacataire3 = new EnseignantVacataire(
                enseignant, LocalDate.of(2022, 10, 1), 15, 200.0
        );
        System.out.println(vacataire3);

        Etudiant[] tabEtu = {etudiant1, etudiant2, etudiant3};

        Enseignant[] tabEns = {enseignantChercheur1, enseignantChercheur2, enseignantChercheur3, enseignantChercheur4, vacataire1, vacataire2, vacataire3};

        Ecole ecole = new Ecole("École Nationale des Sciences Appliquées de Tétouan", tabEns, tabEtu);
        System.out.println("Somme totale à payer aux enseignants vacataires : " + ecole.sommePaieVac() + " MAD");

        ecole.showEtudiants();
        ecole.showEnseignants();


        System.out.println("Enseignants partant à la retraite dans 2 ans :");
        for (Enseignant e : tabEns) {
            if (e instanceof EnseignantChercheur &&
                    LocalDate.now().getYear() - e.getDateNaiss().getYear() >= enseignantChercheur1.getAgeRetraite()) {
                System.out.println(e);
            }
        }





    }
}