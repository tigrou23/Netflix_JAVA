package ressource;

import java.util.Date;

public abstract class Ressource implements IRessource{
    private String nom;
    private String description;
    private int age_min;
    private Date sortie;
    private BandeAnnonce bandeAnnonce;

    public Ressource(String nom, String description, int age_min, Date sortie, BandeAnnonce bandeAnnonce) {
        this.nom = nom;
        this.description = description;
        this.age_min = age_min;
        this.sortie = sortie;
        this.bandeAnnonce = bandeAnnonce;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getAgeMin() {
        return age_min;
    }

    @Override
    public Date getSortie() {
        return sortie;
    }

    @Override
    public BandeAnnonce getBandeAnnonce() {
        return bandeAnnonce;
    }

    public void play() {
        System.out.println("Lecture de " + nom + " ...");
    }

    public void stop() {
        System.out.println("Arrêt de " + nom + " ...");
    }
}
