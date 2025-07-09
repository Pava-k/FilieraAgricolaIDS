package unicam.filieraagricolaids.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;
import unicam.filieraagricolaids.models.articoli.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long> {

}
