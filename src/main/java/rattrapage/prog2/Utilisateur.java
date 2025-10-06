package rattrapage.prog2;

import lombok.Getter;

@Getter
public abstract class Utilisateur {
    protected String id;

    public Utilisateur(String id) {
        this.id = id;
    }

    public abstract void afficherInfos();
}
