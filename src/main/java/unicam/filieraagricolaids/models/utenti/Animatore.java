package unicam.filieraagricolaids.models.utenti;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Animatore")
public class Animatore extends UtenteRegistrato {
}
