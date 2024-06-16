package f2.tirocinio.microlearning.daos;

import f2.tirocinio.microlearning.entities.Corso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CorsoDao extends JpaRepository<Corso, Integer> {
}
