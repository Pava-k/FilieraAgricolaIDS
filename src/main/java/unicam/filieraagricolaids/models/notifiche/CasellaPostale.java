package unicam.filieraagricolaids.models.notifiche;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class CasellaPostale {
    @Id
    @GeneratedValue
    private Long id;

}
