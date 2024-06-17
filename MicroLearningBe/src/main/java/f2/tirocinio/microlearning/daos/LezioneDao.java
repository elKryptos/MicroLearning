package f2.tirocinio.microlearning.daos;

import f2.tirocinio.microlearning.entities.Lezione;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface LezioneDao extends JpaRepository<Lezione, Integer> {
	
	@Query(value ="SELECT * FROM lezioni where nome = :nome", nativeQuery = true)
	List<Lezione> getNome(String nome);
}
