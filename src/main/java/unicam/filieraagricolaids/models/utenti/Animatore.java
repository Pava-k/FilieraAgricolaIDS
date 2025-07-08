package unicam.filieraagricolaids.models.utenti;

import jakarta.persistence.*;
import unicam.filieraagricolaids.models.articoli.Evento;
import unicam.filieraagricolaids.models.notifiche.CasellaPostale;

import java.util.List;

@Entity
@DiscriminatorValue("Animatore")
public class Animatore extends UtenteRegistrato {
    @OneToMany
    private List<Evento> listEventi;
    @OneToOne
    private CasellaPostale casellaPostale;
}
