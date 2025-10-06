package rattrapage.prog2;

import lombok.Getter;

@Getter
public class UtilisateurAnonyme extends Utilisateur {

    public UtilisateurAnonyme(String id) {
        super(id);
    }

    @Override
    public void afficherInfos() {
        System.out.println("Utilisateur anonyme : " + id);
    }
}
