package ressource.media;

import ressource.BandeAnnonce;
import ressource.Ressource;
import ressource.types.TYPE_DOCUMENTAIRE;
import java.util.Date;

public class Documentaire extends Ressource {
    private TYPE_DOCUMENTAIRE type;

    public Documentaire(String nom, String description, int age_min, Date sortie, BandeAnnonce bandeAnnonce, TYPE_DOCUMENTAIRE type, int duree) {
        super(nom, description, age_min, sortie, bandeAnnonce, duree);
        this.type = type;
    }

    public TYPE_DOCUMENTAIRE getType() {
        return type;
    }

}