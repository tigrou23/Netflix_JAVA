package utilisateur;

import java.util.Date;

public class Abonnement {
    private TYPE_ABONNEMENT type;
    private Date dateDebut;
    private Date dateFin;

    public Abonnement(TYPE_ABONNEMENT type, Date dateDebut, Date dateFin) {
        this.type = type;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
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
