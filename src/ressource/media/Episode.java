package ressource.media;

public class Episode {
    private int saison;
    private int numero;

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
}
