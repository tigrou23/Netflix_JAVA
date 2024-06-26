package ressource;

import java.util.Date;
import ressource.BandeAnnonce;

public interface IRessource {
    String getNom();
    String getDescription();
    int getAgeMin();
    Date getSortie();
    BandeAnnonce getBandeAnnonce();
    int getDuree();
    String toString();
    void play(int demarrage);
}