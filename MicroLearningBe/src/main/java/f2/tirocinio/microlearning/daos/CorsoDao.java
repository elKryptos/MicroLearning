package f2.tirocinio.microlearning.daos;

import f2.tirocinio.microlearning.entities.Corso;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CorsoDao extends JpaRepository<Corso, Integer> {
	
	@Query(value ="Select * from courses where category = :category", nativeQuery = true)
	List<Corso> getCategory(String category);
	
	
}
