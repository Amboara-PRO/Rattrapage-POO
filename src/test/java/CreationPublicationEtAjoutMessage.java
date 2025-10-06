import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rattrapage.prog2.*;

public class CreationPublicationEtAjoutMessage {
    private UtilisateurInscrit uInscript1;
    private UtilisateurAnonyme uAnonyme1;
    private Publication p1;


    @BeforeEach
    void setUp(){
        uInscript1 = new UtilisateurInscrit("1", "Amboara Faneva", "ANDRIAMALALA", "hei.amboara@gmail.com");
        uAnonyme1 = new UtilisateurAnonyme("2");
        p1 = new Publication("2", uInscript1, "Publication");
    }

    @Test
    void creationPublication(){
        uInscript1.creerPublication(p1);
    }

    @Test
    void ajouterMessage(){
        p1.ajouterMessage(new Message("TestMessage", true, uInscript1));
        p1.ajouterMessage(new Message("NonConfidnetielMessage", false, uInscript1));
    }
}
