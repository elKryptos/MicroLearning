package f2.tirocinio.microlearning.daos;

import f2.tirocinio.microlearning.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {
}
