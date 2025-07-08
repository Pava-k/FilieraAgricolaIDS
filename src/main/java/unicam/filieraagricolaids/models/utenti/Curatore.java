package unicam.filieraagricolaids.models.utenti;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Curatore")
public class Curatore extends UtenteRegistrato {
}
