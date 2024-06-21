package f2.tirocinio.microlearning.daos;

import f2.tirocinio.microlearning.entities.Lezione;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface LezioneDao extends JpaRepository<Lezione,Integer> {
	
	@Query(value="select * from lezioni where corso_id = :corsoId", nativeQuery=true)
	List<Lezione> findByCorsoId(Integer corsoId);
}
