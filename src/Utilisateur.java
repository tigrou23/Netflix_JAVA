import ressource.Ressource;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Utilisateur {
    private String email;
    private Date dateNaissance;
    private String motDePasse;
    private String rib;
    private Abonnement abonnement;
    private List<Ressource> listeFavori = new ArrayList<>();
    private List<Ressource> listeLecture = new ArrayList<>();

    public Utilisateur(String email, Date dateNaissance, String motDePasse, String rib, Abonnement abonnement) {
        this.email = email;
        this.dateNaissance = dateNaissance;
        this.motDePasse = motDePasse;
        this.rib = rib;
        this.abonnement = abonnement;
    }

    public String getEmail() {
        return email;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public String getRib() {
        return rib;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void changerMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public void resilierAbonnement() {
        abonnement = null;
    }

    public void souscrireAbonnement(Abonnement abonnement) {
        this.abonnement = abonnement;
    }

    public void ajouterFavori(Ressource ressource) {
        listeFavori.add(ressource);
    }

    public void supprimerFavori(Ressource ressource) {
        listeFavori.remove(ressource);
    }

    public void ajouterLecture(Ressource ressource) {
        listeLecture.add(ressource);
    }

    public void supprimerLecture(Ressource ressource) {
        listeLecture.remove(ressource);
    }
}
