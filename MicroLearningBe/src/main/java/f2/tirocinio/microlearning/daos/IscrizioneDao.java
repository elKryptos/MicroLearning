package f2.tirocinio.microlearning.daos;

import f2.tirocinio.microlearning.entities.Iscrizione;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IscrizioneDao extends JpaRepository<Iscrizione, Integer> {
}
