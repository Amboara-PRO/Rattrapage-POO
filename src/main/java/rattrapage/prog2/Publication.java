package rattrapage.prog2;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Publication {
    private String id;
    private Utilisateur createur;
    private String content;
    private List<Message> messages;

    public Publication(String id, Utilisateur createur, String content) {
        this.id = id;
        this.createur = createur;
        this.content = content;
        this.messages = new ArrayList<>();
    }

    public void ajouterMessage(Message message) {
        messages.add(message);
    }

    public void afficherAuteurs() {
        System.out.println("Auteurs de la publication " + id + " :");
        for (Message m : messages) {
            m.getAuteur().afficherInfos();
        }
    }
}

