package ressource.media;

import ressource.BandeAnnonce;
import ressource.Ressource;
import ressource.types.TYPE_FILM_SERIE;
import java.util.Date;
import java.util.List;

public class Film extends Ressource {
    private int duree;
    private List<String> acteurs;
    private TYPE_FILM_SERIE type;

    public Film(String nom, String description, int age_min, Date sortie, BandeAnnonce bandeAnnonce, int duree, List<String> acteurs, TYPE_FILM_SERIE type) {
        super(nom, description, age_min, sortie, bandeAnnonce);
        this.duree = duree;
        this.acteurs = acteurs;
        this.type = type;
    }

    public int getDuree() {
        return duree;
    }

    public List<String> getActeurs() {
        return acteurs;
    }

    public TYPE_FILM_SERIE getType() {
        return type;
    }
}
