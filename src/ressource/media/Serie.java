package ressource.media;

import ressource.BandeAnnonce;
import ressource.Ressource;
import ressource.types.TYPE_FILM_SERIE;
import java.util.Date;
import java.util.List;

public class Serie extends Ressource {

    private List<Episode> listeEpisodes;
    private TYPE_FILM_SERIE type;
    private Episode episodeCourant;

    public Serie(String nom, String description, int age_min, Date sortie, BandeAnnonce bandeAnnonce, List<Episode> listeEpisodes, TYPE_FILM_SERIE type) {
        super(nom, description, age_min, sortie, bandeAnnonce, 0);
        this.listeEpisodes = listeEpisodes;
        this.type = type;
        this.episodeCourant = listeEpisodes.get(0);
    }

    public TYPE_FILM_SERIE getType() {
        return type;
    }

    public int getNbEpisodes() {
        return listeEpisodes.size();
    }

    public int getNbSaisons() {
        return listeEpisodes.get(listeEpisodes.size() - 1).getSaison();
    }

    //Auto Incrementation de l'épisod courant
    @Override
    public void play(int demarrage) {
        System.out.println("Lecture de la série " + getNom() + " ...");
        episodeCourant.play(demarrage);
        episodeCourant = listeEpisodes.get(listeEpisodes.indexOf(episodeCourant) + 1);
    }

    @Override
    public String toString() {
        return getNom() + " - " + getDescription() + " (" + getNbEpisodes() + " épisodes, " + getNbSaisons() + " saisons)";
    }
}
