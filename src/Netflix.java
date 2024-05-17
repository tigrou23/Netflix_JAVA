//Singleton

import ressource.IRessource;
import utilisateur.Utilisateur;

import java.util.ArrayList;
import java.util.List;

public final class Netflix {
    private static Netflix instance;
    private static List<Utilisateur> listeUtilisateur = new ArrayList<>();
    private static List<IRessource> listeRessource = new ArrayList<>();

    private Netflix() {
    }

    public static Netflix getInstance() {
        if (instance == null) {
            instance = new Netflix();
        }
        return instance;
    }

    public void ajouterUtilisateur(Utilisateur utilisateur) {
        listeUtilisateur.add(utilisateur);
    }

    public void ajouterRessource(IRessource ressource) {
        listeRessource.add(ressource);
    }

    public Utilisateur getUtilisateur(String email) {
        for (Utilisateur utilisateur : listeUtilisateur) {
            if (utilisateur.getEmail().equals(email)) {
                return utilisateur;
            }
        } return null;
    }

}
