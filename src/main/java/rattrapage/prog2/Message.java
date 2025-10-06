package rattrapage.prog2;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Message {
    private String texte;
    private LocalDateTime dateCreation;
    private boolean confidentiel;
    private Utilisateur auteur;

    public Message(String texte, boolean confidentiel, Utilisateur auteur) {
        this.texte = texte;
        this.confidentiel = confidentiel;
        this.auteur = auteur;
        this.dateCreation = LocalDateTime.now();
    }

}
