package zakaria.gest_personnes;

public class Utilisateur extends Personne {
    private String login;
    private String password;

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public Utilisateur(String login, String password) {
//        this.login = login;
//        this.password = password;
//    }

    public Utilisateur(){
        super();

    }

    public Utilisateur(int id, String nomComplet, double salaire, String login, String password) {
        super(id, nomComplet, salaire);
        this.login = login;
        this.password = password;
    }

    public Utilisateur(Personne per, Utilisateur uti) {
        super(per);
        this.login = uti.login;
        this.password = uti.password;
    }

    @Override
    public String toString() {
        return "Utilisateur{" + super.toString()+
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String showUtilisateur(){
        return "Personne [ " + super.showPersonne() + " \n  login : " + this.login + "\npassword : "+ this.password + " ].";
    }
}
