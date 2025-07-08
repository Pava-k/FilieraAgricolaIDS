package unicam.filieraagricolaids.models.utenti;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Venditore")
public abstract class Venditore extends UtenteRegistrato implements Notificabile{
}
