package f2.tirocinio.microlearning.daos;

import f2.tirocinio.microlearning.entities.Corso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CorsoDao extends JpaRepository<Corso, Integer> {

    @Query(value = "select * from corsi where categoria = :categoria", nativeQuery = true)
    List<Corso> findByCategoria(String categoria);

    @Query(value = "select * from corsi where categoria = :categoria and nome = :nome", nativeQuery = true)
    List<Corso> findByCategoriaAndNome(String categoria , String nome);

}
