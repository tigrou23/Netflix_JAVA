package ressource;

public class BandeAnnonce {
    private String url;
    private int duree;

    public BandeAnnonce(String url, int duree) {
        this.url = url;
        this.duree = duree;
    }

    public String getUrl() {
        return url;
    }

    public int getDuree() {
        return duree;
    }

}
