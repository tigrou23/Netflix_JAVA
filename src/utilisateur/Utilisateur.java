package utilisateur;

import ressource.IRessource;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Utilisateur {
    private final String email;
    private final Date dateNaissance;
    private String motDePasse;
    private final String rib;
    private Abonnement abonnement;
    private List<IRessource> listeFavori = new ArrayList<>();
    private List<IRessource> listeLecture = new ArrayList<>();

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

    public void ajouterFavori(IRessource ressource) {
        listeFavori.add(ressource);
    }

    public List<IRessource> getListeFavori(){
        return listeFavori;
    }

    public List<IRessource> getListeLecture(){
        return listeLecture;
    }

    public void supprimerFavori(IRessource ressource) {
        listeFavori.remove(ressource);
    }

    public void ajouterLecture(IRessource ressource) {
        listeLecture.add(ressource);
        ressource.play(0); //simplification :/
    }

    public void supprimerLecture(IRessource ressource) {
        listeLecture.remove(ressource);
    }
}
