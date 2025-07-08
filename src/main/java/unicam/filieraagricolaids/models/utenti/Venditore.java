package unicam.filieraagricolaids.models.utenti;

import jakarta.persistence.*;
import unicam.filieraagricolaids.models.articoli.InvitoEvento;
import unicam.filieraagricolaids.models.articoli.Prodotto;
import unicam.filieraagricolaids.models.notifiche.CasellaPostale;

import java.util.ArrayList;
import java.util.List;

@Entity
@DiscriminatorValue("Venditore")
public abstract class Venditore extends UtenteRegistrato implements Notificabile{

    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Prodotto> prodottiCaricati;

    @OneToMany(cascade = CascadeType.ALL)
    private List<InvitoEvento> listaInviti;

    @OneToOne(cascade = CascadeType.ALL)
    private CasellaPostale casellaPostale;

    private String indirizzo;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    public Venditore() {

    }

    public Venditore(String indirizzo, String nome, String password) {
        super();

        this.indirizzo = indirizzo;

        prodottiCaricati = new ArrayList<Prodotto>();

        listaInviti = new ArrayList<>();

        casellaPostale = new CasellaPostale();

    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public CasellaPostale getCasellaPostale() {
        return casellaPostale;
    }

    public void setCasellaPostale(CasellaPostale casellaPostale) {
        this.casellaPostale = casellaPostale;
    }

    public List<InvitoEvento> getListaInviti() {
        return listaInviti;
    }

    public List<Prodotto> getProdottiCaricati() {
        return prodottiCaricati;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
