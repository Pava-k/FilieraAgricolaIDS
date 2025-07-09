package unicam.filieraagricolaids.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;
import unicam.filieraagricolaids.models.utenti.Animatore;

public interface AnimatoreRepository extends JpaRepository<Animatore, Long> {

}
