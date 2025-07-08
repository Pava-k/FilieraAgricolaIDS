package unicam.filieraagricolaids.models.utenti;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TipoUtente", discriminatorType = DiscriminatorType.STRING)
public abstract class UtenteRegistrato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String password;

}
