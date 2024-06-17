package f2.tirocinio.microlearning.daos;

import f2.tirocinio.microlearning.entities.Iscrizione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IscrizioneDao extends JpaRepository<Iscrizione, Integer> {

    @Query(value = "select * from iscrizioni where user_id = :user_id",nativeQuery = true)
    List<Iscrizione> findByUserID(Integer user_id);
}
