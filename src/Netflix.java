//Singleton

import ressource.Ressource;

import java.util.ArrayList;
import java.util.List;

public final class Netflix {
    private static Netflix instance;
    private static List<Utilisateur> listeUtilisateur = new ArrayList<>();
    private static List<Ressource> listeRessource = new ArrayList<>();

    private Netflix() {
    }

    public static Netflix getInstance(String value) {
        if (instance == null) {
            instance = new Netflix();
        }
        return instance;
    }

    public void ajouterUtilisateur(Utilisateur utilisateur) {
        listeUtilisateur.add(utilisateur);
    }

    public void ajouterRessource(Ressource ressource) {
        listeRessource.add(ressource);
    }

    public Utilisateur getUtilisateur(String email) {
        for (Utilisateur utilisateur : listeUtilisateur) {
            if (utilisateur.getEmail().equals(email)) {
                return utilisateur;
            }
        }
    }

}
