package f2.tirocinio.microlearning.daos;

import f2.tirocinio.microlearning.entities.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityDao extends JpaRepository<Activity, Integer> {
}
