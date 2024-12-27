package ayad.gest_comptes_exeptions.ex2Tp2;



public class TestCompte {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Compte compte1 = new Compte();
        Compte compte2 = new Compte();


        try{
            compte1.deposer(600);
            compte2.deposer(850);

            compte2.retirer(200);

            compte1.virerVers(150 , compte2);
            compte2.retirer(1800);
        }catch (IllegalArgumentException e){
            System.out.println("Erreur : " + e.getMessage());
        }


        compte1.afficher();
        compte2.afficher();

        Compte compte3 = new Compte("zakaria");

        try{
            compte3.deposer(-100);
        }catch(IllegalArgumentException e){
            System.out.println("Erreur : " + e.getMessage());
        }

        compte3.afficher();

    }

}

