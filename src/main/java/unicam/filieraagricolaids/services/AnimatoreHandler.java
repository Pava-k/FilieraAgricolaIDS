package unicam.filieraagricolaids.services;

import unicam.filieraagricolaids.infrastructure.AnimatoreRepository;
import unicam.filieraagricolaids.infrastructure.EventoRepository;
import unicam.filieraagricolaids.models.articoli.Evento;
import unicam.filieraagricolaids.models.utenti.Animatore;

public class AnimatoreHandler {

    private final EventoRepository eventoRepository;
    private final AnimatoreRepository animatoreRepository;

    public AnimatoreHandler(EventoRepository eventoRepository,
                            AnimatoreRepository animatoreRepository) {
        this.eventoRepository = eventoRepository;
        this.animatoreRepository = animatoreRepository;
    }

    public Evento caricaEvento(Long animatoreId, Evento nuovoEvento) {
        Animatore animatore = animatoreRepository.findById(animatoreId)
                .orElseThrow(() -> new RuntimeException("Animatore non trovato"));

        nuovoEvento.setAnimatore(animatore);
        animatore.getEventiPubblicati().add(nuovoEvento);

        return eventoRepository.save(nuovoEvento);
    }

    public void rimuoviEvento(Long eventoId, Long animatoreId) {
        Evento evento = eventoRepository.findById(eventoId)
                .orElseThrow(() -> new RuntimeException("Evento non trovato"));

        if (!evento.getAnimatore().getId().equals(animatoreId)) {
            throw new RuntimeException("Non puoi rimuovere un evento che non ti appartiene");
        }

        eventoRepository.delete(evento);
    }
}

