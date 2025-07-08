package unicam.filieraagricolaids.models.articoli;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public abstract class Prodotto {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
}
