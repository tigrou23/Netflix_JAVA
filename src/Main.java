import ressource.IRessource;
import ressource.media.Documentaire;
import ressource.media.Film;
import ressource.media.Serie;
import utilisateur.Utilisateur;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Netflix netflix = Netflix.getInstance();
        netflix.init();

        boolean enCours = true;
        Scanner scanner = new Scanner(System.in);
        int choix;
        boolean connecte = false;
        Utilisateur utilisateur = null;

        while(enCours){
            System.out.println("\n\n1. Se connecter");
            System.out.println("2. Utiliser Netflix");
            System.out.print("3. Quitter\n > ");
            choix = scanner.nextInt();
            switch(choix) {
                case 1:
                    System.out.print("Entrez votre email :\n > ");
                    String email = scanner.next();
                    utilisateur = netflix.getUtilisateur(email);
                    if (utilisateur != null) {
                        System.out.println("Bienvenue " + utilisateur.getEmail());
                    } else {
                        System.err.println("Utilisateur non trouvé");
                        Thread.sleep(1000); // ajout d'un petit délai pour laisser le temps à l'utilisateur de lire le message d'erreur
                        break;
                    }
                    System.out.print("Entrez votre mot de passe :\n > ");
                    String motDePasse = scanner.next();
                    if (utilisateur.getMotDePasse().equals(motDePasse)) {
                        System.out.println("Connexion réussie");
                    } else {
                        System.err.println("Mot de passe incorrect");
                        Thread.sleep(1000); // ajout d'un petit délai pour laisser le temps à l'utilisateur de lire le message d'erreur
                        break;
                    }
                    connecte = true;
                    break;

                case 2:
                    if (!connecte) {
                        System.err.println("Vous devez vous connecter pour utiliser Netflix");
                        Thread.sleep(1000); // ajout d'un petit délai pour laisser le temps à l'utilisateur de lire le message d'erreur
                        break;
                    }
                    System.out.println("\n\n1. Consulter le catalogue des films");
                    System.out.println("2. Consulter le catalogue des séries");
                    System.out.println("3. Consulter le catalogue des documentaires");
                    System.out.println("4. Ajouter dans les favoris");
                    System.out.println("5. Consulter les favoris");
                    System.out.println("6. Consulter la liste de lecture");
                    System.out.print("7. Lire une ressource\n > ");

                    int decision = scanner.nextInt();

                    switch (decision) {
                        case 1:
                            for (IRessource ressource : netflix.getListeRessource()) {
                                if (ressource instanceof Film) {
                                    System.out.println(ressource);
                                }
                            }
                            break;
                        case 2:
                            for (IRessource ressource : netflix.getListeRessource()) {
                                if (ressource instanceof Serie) {
                                    System.out.println(ressource);
                                }
                            }
                            break;
                        case 3:
                            for (IRessource ressource : netflix.getListeRessource()) {
                                if (ressource instanceof Documentaire) {
                                    System.out.println(ressource);
                                }
                            }
                            break;
                        case 4:
                            System.out.print("Quelle ressource souhaitez-vous ajouter aux favoris ? (Utilisez tiret du bas pour les espaces)\n > ");
                            String response = scanner.next();
                            IRessource ressource = netflix.getRessource(response);
                            if(ressource != null){
                                assert utilisateur != null;
                                utilisateur.ajouterFavori(ressource);
                                System.out.println("Ressource ajoutée aux favoris");
                            }else{
                                System.err.println("Ressource inconnue");
                                Thread.sleep(1000); // ajout d'un petit délai pour laisser le temps à l'utilisateur de lire le message d'erreur
                            }
                            break;
                        case 5:
                            assert utilisateur != null;
                            System.out.println(netflix.printFavoris(utilisateur));
                            break;
                        case 6:
                            assert utilisateur != null;
                            System.out.println(netflix.printLectures(utilisateur));
                            break;
                        case 7:
                            System.out.print("Quelle ressource souhaitez-vous jouer ? (Utilisez tiret du bas pour les espaces)\n > ");
                            String rep = scanner.next();
                            IRessource res = netflix.getRessource(rep);
                            if(res != null){
                                assert utilisateur != null;
                                utilisateur.ajouterLecture(res);
                            }else{
                                System.err.println("Ressource inconnue");
                                Thread.sleep(1000); // ajout d'un petit délai pour laisser le temps à l'utilisateur de lire le message d'erreur
                            }
                            break;
                    }
                    break;
                    case 3:
                        System.out.println("Au revoir et à bientôt");
                        return;
            }
        }
    }
}