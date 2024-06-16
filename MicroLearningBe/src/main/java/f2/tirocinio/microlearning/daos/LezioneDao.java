package f2.tirocinio.microlearning.daos;

import f2.tirocinio.microlearning.entities.Lezione;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LezioneDao extends JpaRepository<Lezione,Integer> {
}
