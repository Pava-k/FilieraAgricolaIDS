package unicam.filieraagricolaids.models.utenti;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import unicam.filieraagricolaids.models.market.Carrello;
import unicam.filieraagricolaids.models.notifiche.CasellaPostale;

@Entity
@DiscriminatorValue("Acquirente")
public class Acquirente extends UtenteRegistrato implements Notificabile{
    @OneToOne
    private Carrello carrello;
    @OneToOne
    private CasellaPostale casellaPostale;

}
