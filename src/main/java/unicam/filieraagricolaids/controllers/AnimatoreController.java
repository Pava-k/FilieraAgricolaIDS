import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import unicam.filieraagricolaids.models.articoli.Evento;
import unicam.filieraagricolaids.services.AnimatoreHandler;

@RestController
@RequestMapping("/bachecaEventi")
public class AnimatoreController {

    private final AnimatoreHandler animatoreHandler;

    public AnimatoreController(AnimatoreHandler animatoreHandler) {
        this.animatoreHandler = animatoreHandler;
    }

    @PostMapping("/add/{id}")
    public ResponseEntity<Evento> creaEvento(@PathVariable Long id, @RequestBody Evento evento) {
        Evento creato = animatoreHandler.caricaEvento(id, evento);
        return ResponseEntity.status(HttpStatus.CREATED).body(creato);
    }

    @DeleteMapping("/delete/{id}/{eventoId}")
    public ResponseEntity<Void> cancellaEvento(@PathVariable Long id, @PathVariable Long eventoId) {
        animatoreHandler.rimuoviEvento(eventoId, id);
        return ResponseEntity.noContent().build();
    }
}