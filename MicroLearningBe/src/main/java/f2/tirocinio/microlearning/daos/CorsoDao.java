package f2.tirocinio.microlearning.daos;

import f2.tirocinio.microlearning.entities.Corso;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CorsoDao extends JpaRepository<Corso, Integer> {

    @Query(value = "select * from corsi where categoria = :categoria", nativeQuery = true)
    List<Corso> findByCategoria(String categoria);

    @Query(value = "select * from corsi where categoria = :categoria and nome = :nome", nativeQuery = true)
    List<Corso> findByCategoriaAndNome(String categoria , String nome);

    @Query(value = "select distinct categoria from corsi", nativeQuery = true)
    List<String> findDistinctCategorie();

    @EntityGraph(attributePaths = "lezioni")
    @Query(value = "select c from Corso c")
    List<Corso> findAllWithLezioni();

}
