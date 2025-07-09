package unicam.filieraagricolaids.models.utenti;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import unicam.filieraagricolaids.models.articoli.Evento;
import unicam.filieraagricolaids.models.notifiche.CasellaPostale;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@DiscriminatorValue("Animatore")
public class Animatore extends UtenteRegistrato implements Notificabile{
    @OneToMany
    private List<Evento> eventiPubblicati;
    @OneToOne
    private CasellaPostale casellaPostale;

    public Animatore() {}

    public Animatore(String nome, String pass) {
        super(nome, pass);
        eventiPubblicati = new ArrayList<Evento>();
        casellaPostale = new CasellaPostale();
    }

    public Evento creaEvento(String nome, Date data, String luogo, String desc, int maxP) {
        return new Evento(nome, data, luogo, desc, maxP);
    }

    public List<Evento> getEventiPubblicati() {
        return eventiPubblicati;
    }
}
