package rattrapage.prog2;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class UtilisateurInscrit extends Utilisateur {
    private String prenom;
    private String nom;
    private String email;
    private List<Publication> publications;

    public UtilisateurInscrit(String id, String prenom, String nom, String email) {
        super(id);
        this.prenom = prenom;
        this.nom = nom;
        this.email = email;
        this.publications = new ArrayList<Publication>();
    }

    public void creerPublication(Publication publication) {
        publications.add(publication);
    }
    @Override
    public void afficherInfos() {
        System.out.println("Utilisateur inscrit : " + id + " - " + prenom + " " + nom + " (" + email + ")");
    }
}

