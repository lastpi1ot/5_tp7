package ma.ws.jaxr.tp7.repositories;
import ma.ws.jaxr.tp7.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, Long> {

}
