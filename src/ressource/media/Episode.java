package ressource.media;

public class Episode {
    private int saison;
    private int numero;
    private static final int DUREE_EPISODE = 60;

    public Episode(int saison, int numero) {
        this.saison = saison;
        this.numero = numero;
    }

    public int getSaison() {
        return saison;
    }

    public int getNumero() {
        return numero;
    }

    public void play(int demarrage) {
        int i = demarrage;
        while(i < DUREE_EPISODE) {
            System.out.println("Lecture de l'épisode " + numero + " de la saison " + saison + " à " + i + " minutes ...");
            i++;
        }
        System.out.println("Fin de l'épisode " + numero + " de la saison " + saison + " ...");
    }
}
