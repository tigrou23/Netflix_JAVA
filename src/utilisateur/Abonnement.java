package utilisateur;

import java.util.Date;

public class Abonnement {
    private TYPE_ABONNEMENT type;
    private Date dateDebut;
    private Date dateFin;
    private static final int DUREE_ABONNEMENT = 30;

    public Abonnement(TYPE_ABONNEMENT type, Date dateDebut) {
        this.type = type;
        this.dateDebut = dateDebut;
        this.dateFin = new Date(dateDebut.getTime() + (long) DUREE_ABONNEMENT * 24 * 60 * 60 * 1000);
    }

    public TYPE_ABONNEMENT getType() {
        return type;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

}
