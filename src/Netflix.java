//Singleton

import jdk.jshell.execution.Util;
import ressource.BandeAnnonce;
import ressource.IRessource;
import ressource.media.Documentaire;
import ressource.media.Episode;
import ressource.media.Film;
import ressource.media.Serie;
import ressource.types.TYPE_DOCUMENTAIRE;
import ressource.types.TYPE_FILM_SERIE;
import utilisateur.Abonnement;
import utilisateur.TYPE_ABONNEMENT;
import utilisateur.Utilisateur;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public final class Netflix {
    private static Netflix instance;
    private static List<Utilisateur> listeUtilisateur = new ArrayList<>();
    private static List<IRessource> listeRessource = new ArrayList<>();

    private Netflix() {
    }

    public static Netflix getInstance() {
        if (instance == null) {
            instance = new Netflix();
        }
        return instance;
    }

    public void ajouterUtilisateur(Utilisateur utilisateur) {
        listeUtilisateur.add(utilisateur);
    }

    public void ajouterRessource(IRessource ressource) {
        listeRessource.add(ressource);
    }

    public Utilisateur getUtilisateur(String email) {
        for (Utilisateur utilisateur : listeUtilisateur) {
            if (utilisateur.getEmail().equals(email)) {
                return utilisateur;
            }
        } return null;
    }

    public void init() {
        Utilisateur hugo = new Utilisateur("hugo@hello.com", new Date(2003, 8, 7), "12", "AIJEOIJZORIHOI", new Abonnement(TYPE_ABONNEMENT.SOLO, new Date()));
        Utilisateur souheila = new Utilisateur("souheila@hello.com", new Date(2003, 8, 1), "34", "IJZORIHOI", new Abonnement(TYPE_ABONNEMENT.DUO, new Date()));
        ajouterUtilisateur(hugo);
        ajouterUtilisateur(souheila);

        IRessource intouchable = new Film("Intouchable", "Un aristocrate tétraplégique engage un auxiliaire de vie issu de la banlieue.", 12, new Date(2011, 11, 2), new BandeAnnonce("https://www.youtube.com/watch?v=34kZ5C1u6jY"), 112, List.of("Omar Sy", "François Cluzet"), TYPE_FILM_SERIE.COMEDIE);
        IRessource inception = new Film("Inception", "Un voleur spécialisé dans l'extraction d'informations à travers les rêves est chargé de planter une idée dans l'esprit d'une cible, naviguant des rêves imbriqués complexes.", 12, new Date(2010, 7, 21), new BandeAnnonce("https://www.youtube.com/watch?v=YoHD9XEInc0"), 148, List.of("Leonardo DiCaprio", "Joseph Gordon-Levitt"), TYPE_FILM_SERIE.SCIENCE_FICTION);
        IRessource interstellar = new Film("Interstellar", "Une équipe d'explorateurs utilise un trou de ver nouvellement découvert pour voyager à travers les dimensions.", 12, new Date(2014, 11, 5), new BandeAnnonce("https://www.youtube.com/watch?v=zSWdZVtXT7E"), 169, List.of("Matthew McConaughey", "Anne Hathaway"), TYPE_FILM_SERIE.SCIENCE_FICTION);
        IRessource leLoupDeWallStreet = new Film("Le Loup de Wall Street", "Un courtier en bourse impitoyable gravit les échelons de Wall Street grâce à des pratiques de vente d'actions douteuses.", 16, new Date(2013, 12, 25), new BandeAnnonce("https://www.youtube.com/watch?v=iszwuX1AK6A"), 180, List.of("Leonardo DiCaprio", "Jonah Hill"), TYPE_FILM_SERIE.THRILLER);
        IRessource parasite = new Film("Parasite", "Une famille pauvre s'infiltre dans la vie d'une famille aisée en se faisant passer pour des employés qualifiés.", 16, new Date(2019, 5, 30), new BandeAnnonce("https://www.youtube.com/watch?v=5xH0HfJHsaY"), 132, List.of("Kang-ho Song", "Sun-kyun Lee"), TYPE_FILM_SERIE.DRAME);
        ajouterRessource(intouchable);
        ajouterRessource(inception);
        ajouterRessource(interstellar);
        ajouterRessource(leLoupDeWallStreet);
        ajouterRessource(parasite);

        IRessource gameOfThrones = new Serie("Game of Thrones", "Des familles nobles se disputent le trône de fer dans un royaume médiéval fantastique.", 16, new Date(2011, 4, 17), new BandeAnnonce("https://www.youtube.com/watch?v=rlR4PJn8b8I"), List.of(new Episode(1, 1), new Episode(1, 2), new Episode(2,1)), TYPE_FILM_SERIE.FANTASTIQUE);
        IRessource breakingBad = new Serie("Breaking Bad", "Un professeur de chimie devient fabricant de méthamphétamine après avoir reçu un diagnostic de cancer.", 16, new Date(2008, 1, 20), new BandeAnnonce("https://www.youtube.com/watch?v=HhesaQXLuRY"), List.of(new Episode(1, 1), new Episode(1, 2), new Episode(1,3)), TYPE_FILM_SERIE.THRILLER);
        IRessource strangerThings = new Serie("Stranger Things", "Un groupe d'enfants découvre des phénomènes surnaturels et des créatures terrifiantes.", 12, new Date(2016, 7, 15), new BandeAnnonce("https://www.youtube.com/watch?v=XWxyRG_tckY"), List.of(new Episode(1, 1), new Episode(2, 1), new Episode(3,1)), TYPE_FILM_SERIE.SCIENCE_FICTION);
        IRessource theMandalorian = new Serie("The Mandalorian", "Un chasseur de primes solitaire parcourt la galaxie après la chute de l'Empire.", 12, new Date(2019, 11, 12), new BandeAnnonce("https://www.youtube.com/watch?v=eW7Twd85m2g"), List.of(new Episode(1, 1), new Episode(1, 2), new Episode(1,3)), TYPE_FILM_SERIE.SCIENCE_FICTION);
        IRessource theOffice = new Serie("The Office", "C'est ma série préf", 12, new Date(2005, 3, 24), new BandeAnnonce("https://www.youtube.com/watch?v=U0Y3n5bJvEk"), List.of(new Episode(1, 1), new Episode(2, 1)), TYPE_FILM_SERIE.COMEDIE);
        ajouterRessource(gameOfThrones);
        ajouterRessource(breakingBad);
        ajouterRessource(strangerThings);
        ajouterRessource(theMandalorian);
        ajouterRessource(theOffice);

        IRessource lesOrques = new Documentaire("Les Orques", "Un documentaire sur les orques. Les orques sont des animaux marins très intelligents et très sociables", 12, new Date(2018, 3, 24), new BandeAnnonce("https://www.youtube.com/watch?v=U0Y3n5bJvEk"), TYPE_DOCUMENTAIRE.NATURE, 60);
        IRessource laTerre = new Documentaire("La Terre", "Un documentaire sur la Terre. La Terre est une planète très belle et très fragile", 12, new Date(2019, 3, 24), new BandeAnnonce("https://www.youtube.com/watch?v=U0Y3n5bJvEk"), TYPE_DOCUMENTAIRE.NATURE, 25);
        IRessource leSida = new Documentaire("Le Sida", "Un documentaire sur le Sida. Le Sida est une maladie très grave et très contagieuse", 12, new Date(2017, 3, 24), new BandeAnnonce("https://www.youtube.com/watch?v=U0Y3n5bJvEk"), TYPE_DOCUMENTAIRE.SCIENCE, 40);
        IRessource leCinéma = new Documentaire("Le Cinéma", "Un documentaire sur le Cinéma. Le Cinéma est un art très populaire et très ancien", 12, new Date(2016, 3, 24), new BandeAnnonce("https://www.youtube.com/watch?v=U0Y3n5bJvEk"), TYPE_DOCUMENTAIRE.CINEMA, 50);
        IRessource laMusique = new Documentaire("La Musique", "Un documentaire sur la Musique. La Musique est un art très populaire et très ancien", 12, new Date(2015, 3, 24), new BandeAnnonce("https://www.youtube.com/watch?v=U0Y3n5bJvEk"), TYPE_DOCUMENTAIRE.ART, 30);
        ajouterRessource(lesOrques);
        ajouterRessource(laTerre);
        ajouterRessource(leSida);
        ajouterRessource(leCinéma);
        ajouterRessource(laMusique);
    }

    public List<IRessource> getListeRessource() {
        return listeRessource;
    }

    public IRessource getRessource(String nom){
        IRessource ressource;
        for (IRessource r: listeRessource){
            if(r.getNom().equals(nom)) return r;
        }return null;
    }

    public String printFavoris(Utilisateur utilisateur){
        StringBuilder sb = new StringBuilder();
        List<IRessource> favoris = utilisateur.getListeFavori();
        if(favoris.isEmpty()) return "Aucun favori";
        for (int i = 1; i <= favoris.size(); i++) {
            sb.append(i).append(".    ").append(favoris.get(i-1).getNom()); //!\\ i commence à 1
        }
        return sb.toString();
    }

}
